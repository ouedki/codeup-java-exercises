package Roshambo;
import Validator.Validator;

/**
 * Created by apple on 1/18/17.
 */
public class RoshamboPlayer {

    //Initializing properties
    String name;
    String roshambo;
    int playerScore;
    int opponentScore;
    private Validator validator;

    //constructor
    public RoshamboPlayer(String name, Validator validator) {
        this.name = name;
        this.validator=validator;
    }

    //Default constructor
    public RoshamboPlayer() {

    }

    //Asking user to pick rock, paper, or scissors.
    public String generateRoshambo () {
        String user = validator.getThreeChoiceString("Rock[r]|Paper[p]|Scissors[s]?", "r", "p", "s", "you can only input r|p|s");
        if (user.equalsIgnoreCase("r")) {
            return "rock";
        } else if (user.equalsIgnoreCase("p")) {
            return "paper";
        }else if (user.equalsIgnoreCase("s")) {
            return "scissors";
        } else return "";
    }

    //Checking all winning combinations
    public void checkWinner (String player1, String player2) {
        if (player1.equalsIgnoreCase("rock") &&  player2.equalsIgnoreCase("paper")) {
            System.out.println(player2 + " wins");
            opponentScore++;
        } else if (player1.equalsIgnoreCase("rock") &&  player2.equalsIgnoreCase("scissors")) {
            System.out.println(player1 + " wins");
            playerScore++;
        }else if (player1.equalsIgnoreCase("paper") &&  player2.equalsIgnoreCase("scissors")) {
            System.out.println(player2 + " wins");
            opponentScore++;
        }else if (player1.equalsIgnoreCase("paper") &&  player2.equalsIgnoreCase("rock")) {
            System.out.println(player1 + " wins");
            playerScore++;
        }else if (player1.equalsIgnoreCase("scissors") &&  player2.equalsIgnoreCase("paper")) {
            System.out.println(player1 + " wins");
            playerScore++;
        }else if (player1.equalsIgnoreCase("scissors") &&  player2.equalsIgnoreCase("rock")) {
            System.out.println(player2 + " wins");
            opponentScore++;
        }else if (player1.equalsIgnoreCase(player2)) {
            System.out.println("It's a draw....go again");
            System.out.println("---");
        }
    }

    //ASCII art to display when users start the app
    public static void generateTitle() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Welcome to the game of...");
        System.out.println();
        System.out.println("ROCK                    PAPER                           SCISSORS!!");
        System.out.println("    _______                 _______                    _______");
        System.out.println("---'   ____)            ---'   ____)____           ---'   ____)____");
        System.out.println("      (_____)                     ______)                    ______)");
        System.out.println("      (_____)                     _______)                __________)");
        System.out.println("      (____)                    _______)                 (____)");
        System.out.println("---.__(___)             ---.__________)            ---.__(___)");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
    }
}
