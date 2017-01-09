import java.util.Scanner;

/**
 * OOP dice rolling app
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        //A loop to restart if user chose to.
        do {
            int sides;
            //Storing the number of sides the user entered into a variable
            sides = getNumberOfSides(sc);
            //Creating first die object
            Die dieOne = new Die(sides);
            //Rolling the die and displaying result to user
            System.out.println("You rolled " + dieOne.roll() + " for die one.");
            //Creating second die object
            Die dieTwo = new Die(sides);
            //Rolling the die and displaying result to user
            System.out.println("You rolled " + dieTwo.roll() + " for die two.");
            //Asking user if they want to continue
            System.out.println("Do you want to roll dice again?");
            response = sc.next();
        } while (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }
    //Asking user to enter number of sides.
    public static int getNumberOfSides (Scanner sc) {
        System.out.print("Enter the number of sides: ");
        return sc.nextInt();
    }
}
