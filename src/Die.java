/**
 * Created by apple on 1/6/17.
 */
public class Die {
    int numberOfSides;

    public  int roll() {
        return  1 + (int) (Math.random() * (numberOfSides - 1));
    }

    public Die (int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
