import java.util.Scanner;
/**
 * Exercise - Exploring the Scanner Class
 */
public class Classroom {
    public static void main(String[] args) {
        //Initializing all needed variables
        Scanner sc = new Scanner(System.in);
        int userInput;
        String sentence;
        String firstWord;
        String secondWord;
        String thirdWord;
        double length;
        double height;
        double width;
        double perimeter;
        double area;
        double volume;
        boolean keepMeasuring = true;
        String response;
        String yes = "yes";
        String no = "no";

        //Prompting the user to enter a integer and storing it into a variable
        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();
        System.out.println("You entered: " + userInput);
        sc.nextLine(); // Consume newline left-over

        //Prompting the user to enter a sentence and storing it into a variable
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
        System.out.println("You entered: " + sentence);

        //Prompting the user to enter one word and storing it into a variable
        System.out.print("Enter the 1st word: ");
        firstWord = sc.nextLine();

        //Prompting the user to enter a second word and storing it into a variable
        System.out.print("Enter the 2nd word: ");
        secondWord = sc.nextLine();

        //Prompting the user to enter a third word and storing it into a variable
        System.out.print("Enter the 3rd word: ");
        thirdWord = sc.nextLine();
        System.out.println("You entered: " + firstWord + " " + secondWord + " " + thirdWord);

        //Part 2 of the exercise
        System.out.println("2. Calculating the perimeter and area of various classrooms.");

        // A loop to keep asking the user to enter dimensions of a classroom
        while (keepMeasuring) {
            //Prompting a user to enter a length and storing it into a variable
            System.out.print("Enter the length: ");
            length = sc.nextDouble();
            System.out.println("You entered: " + length);

            //Prompting a user to enter a width and storing it into a variable
            System.out.print("Enter the width: ");
            width = sc.nextDouble();
            System.out.println("You entered: " + width);

            //Prompting a user to enter a height and storing it into a variable
            System.out.print("Enter the height: ");
            height = sc.nextDouble();
            System.out.println("You entered: " + height);
            sc.nextLine(); // Consume newline left-over

            //Calculating the perimeter of the classroom
            perimeter = 2*(length+width);
            System.out.println("The perimeter of the classroom is: " + perimeter);

            //Calculating the area of the classroom
            area = length*width;
            System.out.println("The area of the classroom is: " + area);

            //Calculating the volume of the classroom
            volume = length*width*height;
            System.out.println("The area of the classroom is: " + volume);

            //Asking the user wants continue measuring another classroom
            System.out.println("Do you want to continue? yes/no ");
            response = sc.nextLine();

            //Monitoring whether the user wants to continue measuring or exit the loop
            if (response.equals(yes)) {
                keepMeasuring = true;
            } else if (response.equals(no)) {
                keepMeasuring = false;
            } else {
                System.out.println("Invalid input! Next time enter yes or no.");
            }
        }
    }

}
