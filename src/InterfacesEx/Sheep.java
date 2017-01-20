package InterfacesEx;

/**
 * @author Created by yassine on 1/20/17.
 */
public class Sheep implements Countable, Cloneable {

    private String name;
    private int count;

    public void setName(String name) {
        this.name = name;
    }

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
        return getCount() + " " + name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
