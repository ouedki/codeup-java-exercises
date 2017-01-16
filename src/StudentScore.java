/**
 * StudentScore class
 */
public class StudentScore implements Comparable<StudentScore> {
    //Initializing variables
    private String firstName;
    private String lastName;
    private int score;

    //constructor
    public StudentScore(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    //Getters for the above private properties
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(StudentScore s) {
        if (s.lastName.equals(lastName) && s.firstName.equals(firstName)) {
            return (Integer.valueOf(s.score).compareTo(score));
        } else if (s.lastName.equals(lastName)) {
            return firstName.compareToIgnoreCase(s.firstName);
        } else {
            return lastName.compareToIgnoreCase(s.lastName);
        }

    }


}
