package InterfacesEx;

/**
 * Created by apple on 1/20/17.
 */
public class Alligator implements Countable{

    private int count;


    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return getCount() + " alligator";
    }
}
