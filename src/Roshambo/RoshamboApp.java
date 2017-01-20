package Roshambo;
import Validator.Validator;

import java.util.Scanner;

/**
 * Created by apple on 1/18/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {

        //Initializing scanner object
        Scanner sc = new Scanner(System.in);

        //Initializing validator object
        Validator validator = new Validator(sc);

        //Initializing an opponent
        RoshamboPlayer opponent;

        String response;
        RoshamboPlayer.generateTitle();

        //Asking user to enter their name
        String name = validator.getRequiredString("Please enter your name: ");

        //Initializing a player object
        RoshamboPlayer player1 = new RoshamboPlayer(name, validator);
        System.out.println("Good luck " + player1.name);

        //Asking user to choose an opponent (rock player or CPU player)
        String userOpponent = validator.getChoiceString("Pick an opponent? (CPU/Rock): ", "cpu", "rock", "Try again");

        //Creating an opponent object based on user input
        if(userOpponent.equalsIgnoreCase("rock")) {
            opponent = new RockPlayer();
        } else {
            opponent = new CPUPlayer();
        }

        //A loop to replay the game if user select yes
        do {
            System.out.println("==================");
            System.out.println("Get ready to play.");
            System.out.println("==================");

            //A loop to re-run this code the player and user picked the same Roshambo.Roshambo
            do {
                player1.roshambo = player1.generateRoshambo();
                opponent.roshambo = opponent.generateRoshambo();
                System.out.println("+----------------------------------------+");
                System.out.println("    Player:" + player1.roshambo + "    |    Opponent:" + opponent.roshambo );
                System.out.println("+----------------------------------------+");
                player1.checkWinner(player1.roshambo, opponent.roshambo);

            }while (player1.roshambo.equals(opponent.roshambo));
            System.out.println();
            System.out.println("**********SCORE BOARD***********");
            System.out.println("   " + player1.name + ": " + player1.playerScore + "   |   Opponent: " + player1.opponentScore);
            System.out.println("********************************");
            System.out.println();
            response = validator.getChoiceString("Do you want to start a new game? (y/n): ", "y", "n", "you can only enter y or n");
        } while (response.equals("y"));
    }
}
