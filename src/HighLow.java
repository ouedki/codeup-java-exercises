/**
 * Created by apple on 1/10/17.
 */
public class HighLow {

    int tracker;
    public HighLow() {
    }
    public int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
