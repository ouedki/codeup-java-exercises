import java.util.Scanner;

/**
 * Table of powers exercises
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int result;
        int result2;
        String response;

        do {
            System.out.print("Enter a number: ");
            userInput = sc.nextInt();
            sc.nextLine();

            System.out.println("|Number   |Square |Cube   |");
            System.out.println("---------------------------");

            for (int i = 1; i<=userInput; i++ ) {
                result = i * i;
                result2 = i * i * i;
                System.out.printf("%8s %8s %8s", i, result, result2);
                System.out.println();
            }
            System.out.print("Do you want to continue ? Yes or No. ");
            response = sc.nextLine();
            System.out.println("You entered: " + response);
        }while(response.equals("yes"));
        System.out.println("Thank you for using the table of powers app." + response);
    }
}
