/**
 * For loop exercise
 */
public class ForLoopEx {
    public static void main(String[] args) {
        //counting by 5's from 5 to 100
        for (int i = 5; i<=15; i++) {
            System.out.println(i);
        }

        System.out.println("############");
        //counting by 2's starting with 0 and ending at 100
        for (int j = 2; j<=100; j+=2) {
            System.out.println(j);
        }

        System.out.println("############");
        //counting by 5's from 100 to -10
        for (int k = 100; k>= -10; k-=5) {
            System.out.println(k);
        }

        System.out.println("############");
        //displaying the number squared on each line while the number is less than 1,000,000
        for (long l = 2; l<=1000000; l*=l) {
            System.out.println(l);
        }
    }
}
