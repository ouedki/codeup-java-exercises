import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by apple on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = enterFirstName(sc);
        String lastName = enterLastName(sc);
        int age = enterAge(sc);
        Student student1 = new Student(firstName, lastName, age);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " is " + student1.getAge() + " years old.");
    }

    public static String enterFirstName(Scanner sc) {
        String fn;
        System.out.print("Enter First Name: ");
        fn = sc.nextLine();

        return fn;
    }

    public static String enterLastName(Scanner sc) {
        String ln = "";
        try {
            System.out.print("Enter Last Name: ");
            ln = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error! Invalid entry. Please enter a string");
        }
        return ln;
    }

    public static int enterAge(Scanner sc) {
        int age;
        try {
            System.out.print("Enter age: ");
            age = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Error! Invalid entry. Please enter an integer");
            return enterAge(sc);
        }
        return age;
    }
}
