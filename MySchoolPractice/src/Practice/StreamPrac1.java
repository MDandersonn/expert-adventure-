package Practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamPrac1 {

	public static void main(String[] args) throws IOException {
		
		/////////////////////////////////스트림생성///////////////////////////////////////
		//배열의 스트림
		String[] arr = {"A","B","C"};
		Integer[] arr1 = {1,2,3};
		Arrays.stream(arr,1,3); //Stream의 1,2번요소
		
		
		//콜렉션의 스트림
		List<String> list1 = Arrays.asList(arr);
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
//		List<String> list3 = new List<>(Arrays.asList(arr)); 이건불가능
		
		list1.stream();
		
		
		Stream<String> builderStream =
				Stream.<String>builder().add("Eric").build(); // [Eric, Elena, Java]
		
		List<Integer> list3 = Arrays.asList(arr1);
		
		Stream<String> generatedStream = 
				  Stream.generate(() -> "gen").limit(5); // [el, el, el, el, el]

		Stream<Integer> iteratedStream =
				Stream.iterate(30,n ->n+2).limit(5);// [30, 32, 34, 36, 38]
		
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]

		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		//boxed는 오토박싱 .Integer로 만들어주는것.
		
		
		//String을 Int스트림으로.
		IntStream charsStream =
				  "Stream".chars(); // [83, 116, 114, 101, 97, 109]
		
		
		//문자열을 정규표현식을 이용하여 자르고 각요소들을 스트림으로
		Stream<String> stringStream = 
				  Pattern.compile(", ").splitAsStream("Eric, Elena, Java");
				  // [Eric, Elena, Java]
		
		//파일스트림 파일의 각라인을 스트림으로만들어줌
//		Stream<String> lineStream = 
//				  Files.lines(Paths.get("file.txt"), 
//				              Charset.forName("UTF-8"));
		
		//스트림 연결하기
		Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
		Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
		Stream<String> concat = Stream.concat(stream1, stream2);
		// [Java, Scala, Groovy, Python, Go, Swift]
		
		
		
		/////////////////////////////////////가공하기////////////////////////////////////////
		//Filtering 
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		Stream<String> stream = 
				  names.stream()
				  .filter(x -> x.contains("a"));
				// [Elena, Java]
		System.out.println(Arrays.toString(stream.toArray()) );

		//Mapping
		Stream<String> stream3 = 
				  names.stream()
				  .map(String::toUpperCase);
				// [ERIC, ELENA, JAVA]	}
		
//		Stream<Integer> stream4 = 
//				  productList.stream()
//				  .map(Product::getAmount);
//				// [23, 14, 13, 23, 13]
//		
		
		//중첩리스트 제거
		List<List<String>> list = 
				  Arrays.asList(Arrays.asList("a"), 
				                Arrays.asList("b"));
				// [[a], [b]]
		
		List<String> flatList = 
				  list.stream()
				  .flatMap(Collection::stream)
				  .collect(Collectors.toList());
				// [a, b]
		
		
//		// 국영수 평균구하기
//		students.stream()
//		  .flatMapToInt(student -> 
//		                IntStream.of(student.getKor(), 
//		                             student.getEng(), 
//		                             student.getMath()))
//		  .average().ifPresent(avg -> 
//		                       System.out.println(Math.round(avg * 10)/10.0));
		
		
		//정렬하기
		IntStream.of(14, 11, 20, 39, 23)
		  .sorted()
		  .boxed()
		  .collect(Collectors.toList());
		// [11, 14, 20, 23, 39]
		
		
		List<String> lang = 
				  Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

				lang.stream()
				  .sorted()
				  .collect(Collectors.toList());
				// [Go, Groovy, Java, Python, Scala, Swift]

				lang.stream()
				  .sorted(Comparator.reverseOrder())
				  .collect(Collectors.toList());
				// [Swift, Scala, Python, Java, Groovy, Go]
		
		//문자열길이를 기준으로정렬
				lang.stream()
				  .sorted(Comparator.comparingInt(String::length))
				  .collect(Collectors.toList());
				// [Go, Java, Scala, Swift, Groovy, Python]

				lang.stream()
				  .sorted((s1, s2) -> s2.length() - s1.length())
				  .collect(Collectors.toList());
				// [Groovy, Python, Scala, Swift, Java, Go]
		
		
		//Peek
				int sum = IntStream.of(1, 3, 5, 7, 9)
						  .peek(System.out::println)
						  .sum();
				System.out.println(sum);
				int sum1 = IntStream.of(1, 3, 5, 7, 9)
						  .sum();
				System.out.println(sum1);
				
	///////////////////////////결과만들기/////////////////////////////////////
				//계산
				long count = IntStream.of(1, 3, 5, 7, 9).count();
				long sum2 = LongStream.of(1, 3, 5, 7, 9).sum();
				//만약 스트림이 비어 있는 경우 count 와 sum 은 0을 출력하면 됩니다.
				//하지만 평균, 최소, 최대의 경우에는 표현할 수가 없기 때문에 Optional 을 이용해 리턴합니다.
				OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
				OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();

				DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
				  .average()
				  .ifPresent(System.out::println);//Optional처리.
				
				
				//reduce
				OptionalInt reduced = 
						  IntStream.range(1, 4) // [1, 2, 3]
						  .reduce((a, b) -> { return Integer.sum(a, b);  });
				System.out.println(reduced);
				
				
				//reduce 초기값 설정하는경우
				int reducedTwoParams = 
						  IntStream.range(1, 4) // [1, 2, 3]
						  .reduce(10, Integer::sum); // method reference

				
		//Collectors
				List<Product> productList = 
						  Arrays.asList(new Product(23, "potatoes"),
						                new Product(14, "orange"),
						                new Product(13, "lemon"),
						                new Product(23, "bread"),
						                new Product(13, "sugar"));
				List<String> collectorCollection =
						  productList.stream()
						    .map(Product::getName)
						    .collect(Collectors.toList());
						// [potatoes, orange, lemon, bread, sugar]
				
				
				//스트링으로 합치기
				String listToString = 
						 productList.stream()
						  .map(Product::getName)
						  .collect(Collectors.joining());
						// potatoesorangelemonbreadsugar
				
				String listToString = 
						 productList.stream()
						  .map(Product::getName)
						  .collect(Collectors.joining(", ", "<", ">"));
						// <potatoes, orange, lemon, bread, sugar>
				
				//평균내기
				Double averageAmount = 
						 productList.stream()
						  .collect(Collectors.averagingInt(Product::getAmount));
						// 17.2

				//숫자의 합
				Integer summingAmount = 
						 productList.stream()
						  .collect(Collectors.summingInt(Product::getAmount));
						// 86
				
				Integer summingAmount = 
						  productList.stream()
						  .mapToInt(Product::getAmount)
						  .sum(); // 86
				//요약정보
				IntSummaryStatistics statistics = 
						 productList.stream()
						  .collect(Collectors.summarizingInt(Product::getAmount));

				
				//수량을 기준으로 그룹
				Map<Integer, List<Product>> collectorMapOfLists =
						 productList.stream()
						  .collect(Collectors.groupingBy(Product::getAmount));
				
				// 기준으로 그룹나누기
				Map<Boolean, List<Product>> mapPartitioned = 
						  productList.stream()
						  .collect(Collectors.partitioningBy(el -> el.getAmount() > 15));
				
				
				// collect한 이후 추가작업이 필요한경우
				Set<Product> unmodifiableSet = 
						 productList.stream()
						  .collect(Collectors.collectingAndThen(Collectors.toSet(),
						                                        Collections::unmodifiableSet));
				
				//매칭
				List<String> names1 = Arrays.asList("Eric", "Elena", "Java");

				boolean anyMatch = names1.stream()
				  .anyMatch(name -> name.contains("a"));
				boolean allMatch = names1.stream()
				  .allMatch(name -> name.length() > 3);
				boolean noneMatch = names1.stream()
				  .noneMatch(name -> name.endsWith("s"));
		
				//반복
				names.stream().forEach(System.out::println);

	}
	
}
