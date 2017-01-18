import java.util.Scanner;

/**
 * Created by apple on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        String response;
        String area;
        String circumference;

        do {
            double radius = validator.getDouble(sc, "Enter a radius: ");
            Circle circle = new Circle(radius);
            area = circle.getFormattedArea();
            circumference = circle.getFormattedCircumference();

            System.out.printf("The Area is: %.2f", Double.parseDouble(area));
            System.out.println();
            System.out.printf("The circumference is: %.2f", Double.parseDouble(circumference));
            System.out.println();

            response = validator.getChoiceString(sc, "Do you want to continue? (y/n): ", "y", "n", "you can only enter y or n");
        }while (response.equals("y"));

        System.out.println("goodbye");
        System.out.println("The number of circles created is: " + Circle.getObjectCount() );

    }
}
