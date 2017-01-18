/**
 * Created by apple on 1/17/17.
 */
public class Circle {

    private double radius;
    private static int count;


    public Circle(double radius){
        this.radius = radius;
        count++;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public String getFormattedCircumference(){
        return formatNumber(getCircumference());
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }

    private String formatNumber(double x){
        return Double.toString(x);
    }

    public static int getObjectCount(){
        return count;
    }

    public double getRadius() {
        return radius;
    }
}
