import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ValidatorTestApp
 */
public class Validator {
    private Scanner sc;

    //Validator constructor
    public Validator(Scanner sc) {
        this.sc = sc;

    }

    //Restricting user to enter an integer
    public int getInt(Scanner sc, String prompt) {
        int number;
        try {
            System.out.print(prompt);
            number = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Your input must be an integer, nothing else!");
            return getInt(sc, prompt);
        }
        return number;
    }

    //Restricting user to enter an integer within a specified range
    public int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
        System.out.print(prompt);
        int numberRange;

        try {
            numberRange = Integer.parseInt(sc.nextLine());
            if (numberRange<min || numberRange>max) {
                throw new IllegalArgumentException("WARNING - Number must be Between 0 and 100.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(sc, prompt, min, max);
        }
        return numberRange;
    }

    //Restricting user to enter a double
    public double getDouble(Scanner sc, String prompt) {
        double newDouble;
        try {
            System.out.print(prompt);
            newDouble = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Your input must be a double, nothing else!");
            return getDouble(sc, prompt);
        }
        return newDouble;
    }

    //Restricting user to enter a double within a specified range
    public double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
        double newDoubleRange;
        try {
            System.out.print(prompt);
            newDoubleRange = Double.parseDouble(sc.nextLine());
            if (newDoubleRange <=min || newDoubleRange>=max) {
                throw new IllegalArgumentException("WARNING - Number must be Between 0.1 and 10.99");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Your input must be a double, nothing else!");
            System.out.println(e.getMessage());
            return getDoubleWithinRange(sc, prompt, min, max);
        }
        return newDoubleRange;
    }

    //Preventing user from entering  whitespaces
    public String getRequiredString(Scanner sc, String prompt) {
        String newString;
        try {
            System.out.print(prompt);
            newString = sc.nextLine();

            if (newString.contains(" ") || newString.isEmpty()) {
                throw new IllegalArgumentException("WARNING - You can NOT enter whitespaces.");
            }
        }catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter a valid string");
            return getRequiredString(sc, prompt);
        }
        return newString;
    }

}
