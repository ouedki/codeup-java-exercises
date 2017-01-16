import java.util.*;

/**
 * StudentScoresApp
 */
public class StudentScoresApp {
    public static void main(String[] args) {

        //Initializing variables
        Scanner sc = new Scanner(System.in); //creating an instance of scanner class
        Validator validator = new Validator(sc); //creating an instance of validator class
        StudentScore student;
        ArrayList<StudentScore> students = new ArrayList<StudentScore>();
        String response;
        String firstName;
        String lastName;
        int studentScore;

        //Ask user if they want to re-run the program
        do {
            int numberOfStudents = validator.getInt(sc, "Enter number of students you want to store: ");
            for (int i = 0; i<numberOfStudents; i++){
                firstName = promptForFirstName(sc, validator);
                lastName = promptForLastName(sc, validator);
                studentScore = promptForScore(sc, validator);
                student = new StudentScore(firstName, lastName, studentScore);
                students.add(student);
                System.out.println();
            }
            //sorting the ArrayList
            Collections.sort(students);

            //Printing the ArrayList
            System.out.println("-------------------------------------------");
            System.out.println("First Name      Last Name         Score");
            System.out.println("-------------------------------------------");
            for (int i = 0; i<students.size(); i++){
                System.out.printf("%-15s", students.get(i).getFirstName());
                System.out.printf("%-20s",students.get(i).getLastName());
                System.out.printf("%-20s", students.get(i).getScore());
                System.out.println();
            }
            System.out.println("-------------------------------------------");
            response=validator.getChoiceString(sc, "Do you want to add more students? Y/N: ", "y", "n", "You can only enter y, Y, n or N.");
        } while(response.equalsIgnoreCase("y"));

    }
    //asking user to enter first name
    public  static  String promptForFirstName (Scanner sc, Validator vl) {
        return vl.getRequiredString(sc, "Enter your First name: ");
    }

    //asking user to enter last name
    public  static  String promptForLastName (Scanner sc, Validator vl) {
        return vl.getRequiredString(sc, "Enter your Last name: ");
    }

    //asking user to enter score
    public  static  int promptForScore (Scanner sc, Validator vl) {
        return vl.getIntWithinRange(sc, "Enter your score: ", 0, 100);
    }
}
