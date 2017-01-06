import java.util.Scanner;

/**
 * factorial exercise
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = getNumber(sc);
        System.out.println("You entered: " + userInput);
        long fact = calculateFactorial(userInput);
        System.out.println(userInput + "! = " + fact);
        String userResponse = continueCalc(sc);
        evaluateUserRes(userResponse, sc);
    }

    public static int getNumber(Scanner scan) {
        int number;
        do {
            System.out.print("Input a number between 1 and 10: ");
            number = scan.nextInt();
        } while (number<0 || number>10);
        return number;
    }

    public static long calculateFactorial(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static String continueCalc(Scanner sc) {
        String response;
        sc.nextLine();
        System.out.print("Do you want to continue ? Yes or No. ");
        response = sc.nextLine();
        System.out.println("You entered: " + response);
        return response;

    }

    public static void evaluateUserRes(String str, Scanner sc) {
        if (str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("y")) {
            recalculateFactorial (sc);
        } else {
            System.out.println("Thank you for using the factorial calculator app.");
        }
    }

    public static void recalculateFactorial(Scanner sc) {
        int userInput = getNumber(sc);
        System.out.println("You entered: " + userInput);
        long fact = calculateFactorial(userInput);
        System.out.println(userInput + "! = " + fact);
        String userResponse = continueCalc(sc);
        evaluateUserRes(userResponse, sc);
    }
}
