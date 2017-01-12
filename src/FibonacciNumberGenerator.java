import java.util.Arrays;

/**
 * Fibonacci number generator
 */
public class FibonacciNumberGenerator {
    public static void main(String[] args) {
        long result;
        long array [] = new long[1000];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i<array.length; i++) {
            result = array[i-1] + array[i-2];
            array[i] = result;
        }
        System.out.println(Arrays.toString(array));
    }
}
