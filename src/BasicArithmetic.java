/**
 * Basic arithmetic exercise
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        int x = 9;
        int y = 5;
        int addition = add(x, y);
        int subtraction = subtract(x, y);
        int multiplication = multiply(x, y);
        double division = divide(x, y);
        int modul = modulus(x, y);
        System.out.println(x + "+" + y + "=" + addition);
        System.out.println(x + "-" + y + "=" + subtraction);
        System.out.println(x + "*" + y + "=" + multiplication);
        System.out.println(x + "/" + y + "=" + division);
        System.out.println(x + "%" + y + "=" + modul);

    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int subtract(int a, int b) {
        return a-b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static int modulus(int a, int b) {
        return a%b;
    }
}
