import java.util.Scanner;
/**
 * Calculate batting statistics.
 */
public class BattingStatisticsApp {
    public static void main(String[] args) {
        int batters;
        int numberOfAtBats;
        int numberOfBasesEarned = 0;
        float battingAverage;
        float sluggingPercentage;
        int[] atBat;
        float[][] stats;
        String response;
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

        do {
            batters = validator.getInt(sc, "Enter the number of batters: ");
            stats = new float[batters][2];
            for (int i = 0; i < batters; i++) {
                numberOfAtBats = validator.getInt(sc, "Enter the number of at bats for player " + (i + 1) + " : ");
                atBat = new int[numberOfAtBats];
                for (int j = 0; j < numberOfAtBats; j++) {
                    numberOfBasesEarned = validator.getIntWithinRange(sc, "Enter the number of Bases earned: ", 0, 4);
                    atBat[j] = numberOfBasesEarned;
                }
                sluggingPercentage = calculateBattingAverage(atBat, numberOfAtBats);
                battingAverage = calculateSluggingPercentage(atBat, numberOfAtBats);
                Player player = new Player(numberOfAtBats, numberOfBasesEarned, battingAverage, sluggingPercentage);
                stats[i][0] = player.battingAverage;
                stats[i][1] = player.sluggingPercentage;
            }

            //Printing the 2d array that holds the stats
            System.out.println("-----------------------------------------");
            System.out.println("BATTER      BATTING AVG        SLUGGING %");
            System.out.println("-----------------------------------------");
            for (int i = 0; i < stats.length; i++) {
                System.out.print(" " + (i+1) +"           ");
                for (int j = 0; j < stats[i].length; j++) {
                    System.out.printf("%.3f", stats[i][j]);
                    System.out.print("             ");
                }
                System.out.println();
            }
            System.out.println("-----------------------------------------");



            response = validator.getChoiceString(sc, "Do you want to generate more batters statistics? ? Y/N ", "y", "n", "You can only enter Y, y, N or n");
        } while (response.equalsIgnoreCase("y"));

    }

    public static float totalNumberOfBases(int[] arr) {
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        return total;
    }

    public static float totalNumberOfAtBats(int[] arr) {
        int total = 0;
        for (int x : arr) {
            if (x > 0) {
                total++;
            }
        }

        return total;
    }

    public static float calculateSluggingPercentage(int[] arr, int numberAtBases) {
        double percentage;
        percentage = totalNumberOfAtBats(arr) / numberAtBases;
        return (float) percentage;
    }

    public static float calculateBattingAverage(int[] arr, int numberAtBases) {
        double average;
        average = totalNumberOfBases(arr) / numberAtBases;
        return (float) average;
    }
}
