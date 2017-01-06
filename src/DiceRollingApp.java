import java.util.Scanner;

/**
 * Created by apple on 1/6/17.
 */
public class DiceRollingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sides = getNumberOfSides(sc);
        Die dieOne = new Die(sides);
        System.out.println("You rolled " + dieOne.roll(sides) + " for die one.");
        Die dieTwo = new Die(sides);
        System.out.println("You rolled " + dieTwo.roll(sides) + " for die two.");
    }
    public static int getNumberOfSides (Scanner sc) {
        System.out.print("Enter the number of sides: ");
        return sc.nextInt();
    }
}
