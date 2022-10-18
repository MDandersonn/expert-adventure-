package Chapter10_lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

@FunctionalInterface
interface Calculator {
    int aum(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;
        Calculator mc1 = (a,b)->(a+b); 
        int result = mc.aum(3, 4);
        int result1 =mc1.aum(4, 5);
        System.out.println(result);  // 7 출력
        System.out.println(result1);
        
        BiFunction<Integer, Integer, Integer> mc2 =(a,b)->(a+b);
        int result2 = mc2.apply(6, 7);
        System.out.println(result2);
        
        BinaryOperator<Integer> mc3 =(a,b) ->(a+b);
        int result3 =mc3.apply(7,8);
        System.out.println(result3);
    }
}