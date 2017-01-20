package yourLastName.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A <code>Console</code> The application prompts the user to enter a valid within a specified range,
 * a valid double within a specified range, a required String, and one of two Strings.
 * Created by apple on 1/12/17.
 * @author  Yassine Ouedki
 * @version  1.0
 */
public class Console {
    Scanner sc;

    /**
     * Creates a new console.
     * @param  sc  The scanner object that will be passed when the constructors is called
     */
    public Console(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Catches and fixes exceptions when the user enters whitespaces in a string.
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @throws IllegalArgumentException if user enters space or \n
     * @throws IllegalStateException if this scanner is closed
     * @return returns a string except whitespaces
     */
    public String getRequiredString(Scanner sc, String prompt) {
        String newString;
        try {
            System.out.print(prompt);
            newString = sc.nextLine();

            if (newString.contains(" ") || newString.isEmpty()) {
                throw new IllegalArgumentException("ERROR - You can NOT enter whitespaces.");
            }
        }catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter a valid string");
            return getRequiredString(sc, prompt);
        }
        return newString;
    }

    /**
     * Restricts users to enter only to different words ignoring case sensitivity
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @param  option1  The first word that users are forced to enter
     * @param  option2  The second word that users are forced to enter
     *
     * @throws IllegalArgumentException if user enters anything but option1 and option2
     * @throws IllegalStateException if this scanner is closed
     * @return returns users input restricted to only option1 and option2
     */
    public String getChoiceString(Scanner sc, String prompt, String option1, String option2, String message) {
        String myString;
        try {
            System.out.print(prompt);
            myString = sc.nextLine();

            if (!(myString.equalsIgnoreCase(option1) || myString.equalsIgnoreCase(option2))) {
                throw new IllegalArgumentException("ERROR - " + message);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getChoiceString(sc, prompt, option1, option2, message);
        }
        return myString;
    }

    /**
     * Catches and fixes exceptions when the user enters anything but integers.
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @throws NumberFormatException if users parse non-integers inputs
     * @throws IllegalStateException if this scanner is closed
     * @throws InputMismatchException if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @return  returns users input restricted to only integers
     */
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

    /**
     * Catches and fixes exceptions when the user enters anything but integers within a specified range.
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @param  min  the minimum integer the users can input
     * @param  max  the maximum integer the users can input
     * @throws NumberFormatException if users parse non-integer inputs
     * @throws IllegalStateException if this scanner is closed
     * @throws InputMismatchException if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @return  returns users input restricted to only integers within the specified range
     */
    public int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
        System.out.print(prompt);
        int numberRange;

        try {
            numberRange = getInt(sc, prompt);
            if (numberRange<min || numberRange>max) {
                throw new IllegalArgumentException("ERROR - Number must be Between " + min + " and " + max);
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("ERROR - You can Only enter numbers");
            System.out.println(e.getMessage());
            return getIntWithinRange(sc, prompt, min, max);
        }
        return numberRange;
    }

    /**
     * Catches and fixes exceptions when the user enters anything but double.
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @throws NumberFormatException if users parse non-double inputs
     * @throws IllegalStateException if this scanner is closed
     * @throws InputMismatchException if the next token does not match the <i>double</i>
     *         regular expression, or is out of range
     * @return  returns users input restricted to only doubles
     */
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

    /**
     * Catches and fixes exceptions when the user enters anything but double within a specified range.
     * @param  sc  The scanner object that will be passed when the method is called
     * @param  prompt  The displayed message that will be shown when user is prompted for input
     * @param  min  the minimum double the users can input
     * @param  max  the maximum double the users can input
     * @throws NumberFormatException if users parse non-double inputs
     * @throws IllegalStateException if this scanner is closed
     * @throws InputMismatchException if the next token does not match the <i>double</i>
     *         regular expression, or is out of range
     * @return  returns users input restricted to only double within the specified range
     */
    public double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
        double newDoubleRange;
        try {
            newDoubleRange = getDouble(sc, prompt);
            if (newDoubleRange <=min || newDoubleRange>=max) {
                throw new IllegalArgumentException("ERROR - Number must be Between 0.1 and 10.99");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Your input must be a double, nothing else!");
            System.out.println(e.getMessage());
            return getDoubleWithinRange(sc, prompt, min, max);
        }
        return newDoubleRange;
    }
}
