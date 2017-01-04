/**
 * Do while exercise
 */
public class DoWhileEx {
    public static void main(String[] args) {

        //counting by 2's starting with 0 and ending at 100
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while(i<= 100);

        System.out.println("############");

        //counting by 5's from 100 to -10
        int x = 100;
        do {
            System.out.println(x);
            x-=5;
        }while(x>= -10);

        System.out.println("############");

        //displaying the number squared on each line while the number is less than 1,000,000
        long j = 2;
        do {
            System.out.println(j);
            j*=j;
        }while(j<= 1000000);
    }
}
