import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by apple on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        String response;

        do {
            int category = validator.getIntWithinRange(sc, "Enter a category: animated[1], drama[2], horror[3], scifi[4]: ", 1, 4);
            ArrayList<Movie> movies = new ArrayList<>();

            for (int i = 0; i < 100; i++) {

                movies.add(MovieIO.getMovie(i));
            }

            Collections.sort(movies);

            switch (category) {
                case 1:
                    System.out.println("*******************************");
                    System.out.println("============Animated===========");
                    System.out.println("*******************************");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    System.out.println("*******************************");
                    break;

                case 2:
                    System.out.println("*******************************");
                    System.out.println("==============Drama============");
                    System.out.println("*******************************");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    System.out.println("*******************************");
                    break;

                case 3:
                    System.out.println("*******************************");
                    System.out.println("=============Horror============");
                    System.out.println("*******************************");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    System.out.println("*******************************");
                    break;

                case 4:
                    System.out.println("*******************************");
                    System.out.println("=============Scifi=============");
                    System.out.println("*******************************");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    System.out.println("*******************************");
                    break;
            }
            System.out.println();
            response = validator.getChoiceString(sc, "Select another category? (y/n): ", "y", "n", "you can only enter y or n");
            System.out.println();

        } while (response.equals("y"));


    }
}
