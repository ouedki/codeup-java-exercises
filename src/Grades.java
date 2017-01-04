import java.util.Scanner;

/**
 * Grading app exercise
 */
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        String response;
        String message;

        do {
            System.out.print("Enter your grade: ");
            grade = sc.nextInt();
            sc.nextLine();

            if (grade >= 99) {
                message = ("Your grade is: " + grade + ": A+");
            }else if (grade >= 90) {
                message = ("Your grade is: " + grade + ": A");
            }else if (grade >= 88) {
                message = ("Your grade is: " + grade + ": A-");
            }else if (grade >= 86) {
                message = ("Your grade is: " + grade + ": B+");
            }else if (grade >= 83) {
                message = ("Your grade is: " + grade + ": B");
            }else if (grade >= 80) {
                message = ("Your grade is: " + grade + ": B-");
            }else if (grade >= 78) {
                message = ("Your grade is: " + grade + ": C+");
            }else if (grade >= 69) {
                message = ("Your grade is: " + grade + ": C");
            }else if (grade >= 67) {
                message = ("Your grade is: " + grade + ": C-");
            }else if (grade >= 65) {
                message = ("Your grade is: " + grade + ": D+");
            }else if (grade >= 62) {
                message = ("Your grade is: " + grade + ": D");
            }else if (grade >= 60) {
                message = ("Your grade is: " + grade + ": D-");
            }else {
                message = ("Your grade is: " + grade + ": F");
            }
            System.out.println(message);
            System.out.print("Do you want to continue ? Yes or No. ");
            response = sc.nextLine();
            System.out.println("You entered: " + response);
        }while(response.equals("yes"));
        System.out.println("Thank you for using the grading sys app." + response);

    }
}
