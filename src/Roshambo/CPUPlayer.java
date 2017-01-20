package Roshambo;

/**
 * Created by apple on 1/18/17.
 */
public class CPUPlayer extends RoshamboPlayer {

    //generating a random constant from the enum class
    public String generateRoshambo() {
        int randomNum = 1 + (int)(Math.random() * 3);
        switch (randomNum){
            case 1:
                return Roshambo.ROCK.toString();

            case 2:
                return Roshambo.PAPER.toString();

            case 3:
                return Roshambo.SCISSORS.toString();

            default:
                return "";
        }
    }
}
