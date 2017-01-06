import java.util.Scanner;

/**
 * Created by apple on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person(promptUserForFN(sc), promptUserForLN(sc), promptUserForEmail(sc));
        System.out.println("Hello " + person1.firstName + " " + person1.lastName + ", we have your email as " + person1.email );
        Person person2 = new Person(promptUserForFN(sc), promptUserForLN(sc), promptUserForEmail(sc));
        System.out.println("Hello " + person2.firstName + " " + person2.lastName + ", we have your email as " + person2.email );
        Person person3 = new Person(promptUserForFN(sc), promptUserForLN(sc), promptUserForEmail(sc));
        System.out.println("Hello " + person3.firstName + " " + person3.lastName + ", we have your email as " + person3.email );

    }
    public static String promptUserForFN (Scanner sc) {
        System.out.print("Enter your First Name: ");
        return sc.nextLine();
    }
    public static String promptUserForLN (Scanner sc) {
        System.out.print("Enter your Last Name: ");
        return sc.nextLine();

    }
    public static String promptUserForEmail (Scanner sc) {
        System.out.print("Enter your email: ");
       return sc.nextLine();
    }
}
