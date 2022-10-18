package Chapter12_07Exam;
import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3];
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);
            int e = 4 / 0;
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } finally {
            result += 4;
        }
        System.out.println(result); // result 의 값은 무엇일까?
    }
}