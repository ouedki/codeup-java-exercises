import java.util.Scanner;
/**
 * FizzBuzz exercise
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        int fizz;
        int buzz;

        System.out.print("Enter a starting number: ");
        start = sc.nextInt();
        System.out.println("You entered: " + start);

        System.out.print("Enter a ending number: ");
        end = sc.nextInt();
        System.out.println("You entered: " + end);

        System.out.print("Enter a starting number: ");
        fizz = sc.nextInt();
        System.out.println("You entered: " + fizz);

        System.out.print("Enter a starting number: ");
        buzz = sc.nextInt();
        System.out.println("You entered: " + buzz);

        for (int i = start; i<=end; i++) {
            if ((i%buzz == 0) && (i%fizz == 0) ) {
                System.out.println("FizzBuzz");
            }else if (i%fizz == 0) {
                System.out.println("Fizz");
            }else if (i%buzz == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
