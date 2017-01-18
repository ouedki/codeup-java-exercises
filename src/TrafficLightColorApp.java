import java.util.Scanner;

/**
 * Created by apple on 1/12/17.
 */
public class TrafficLightColorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        String response;
        
        do {
            String TLColor = getColor(validator,sc);
            TLColor = TLColor.toUpperCase();
            TrafficLightColor color = TrafficLightColor.RED;
            makeDrivingDecision(color, TLColor);
            response = validator.getChoiceString(sc, "Do you want to generate more batters statistics? ? Y/N ", "y", "n", "You can only enter Y, y, N or n");
        }while (response.equalsIgnoreCase("y"));
        

    }

    public static String getColor(Validator vl, Scanner sc) {
        String color;
        color = vl.getThreeChoiceString(sc, "enter a Traffic Light Color:", "red", "yellow", "green", "You can only enter traffic light colors");
        return color;
    }

    public static void makeDrivingDecision(TrafficLightColor color, String user) {
        switch(user){
            case"RED":
                color=TrafficLightColor.RED;
                System.out.println("It's RED, Stop!!!");
                break;
            case"YELLOW":
                color=TrafficLightColor.YELLOW;
                System.out.println("It's YELLOW, Get Ready to stop.....");
                break;
            default:
                color=TrafficLightColor.GREEN;
                System.out.println("Green is GREEN....It's all good now....You can go.");
                break;
        }
    }
}

