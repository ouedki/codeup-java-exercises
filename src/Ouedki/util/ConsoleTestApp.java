package yourLastName.util;
import java.util.Scanner;

/**
 * Created by apple on 1/12/17.
 */
public class ConsoleTestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = new Console(sc);

        //Prompting user to enter an integer and display it
        int number = console.getInt(sc, "Enter an Integer: ");
        System.out.println("You entered: " + number);

        //Prompting user to enter an integer btw 0 and 100 and display it
        int numberRange = console.getIntWithinRange(sc, "Enter an Integer between 0 and 100: ", 0, 100);
        System.out.println("You entered: " + numberRange);

        //Prompting user to enter a double and display it
        double newDouble = console.getDouble(sc, "Enter a double: ");
        System.out.println("You entered: " + newDouble);

        //Prompting user to enter an double btw 0.1 and 10.99 and display it
        double newDoubleRange = console.getDoubleWithinRange(sc, "Enter a double between 0.1 and 10.99: ", 0.1, 10.99);
        System.out.println("You entered: " + newDoubleRange);

        //Prompting user to enter a string
        String newString = console.getRequiredString(sc, "Enter a string: ");
        System.out.println("You entered: " + newString);
    }

}
