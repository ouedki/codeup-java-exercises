/**
 * Created by apple on 1/6/17.
 */
public class Die {
    int numberOfSides;

    public  int roll(int max) {
        return  1 + (int) (Math.random() * (max - 1));
    }

    public Die (int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
