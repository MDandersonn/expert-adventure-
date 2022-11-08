import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		String[] arr = new String[] {"A","B","C"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart =Arrays.stream(arr,1,3);

	}

}
