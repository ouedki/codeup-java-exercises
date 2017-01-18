/**
 * Created by apple on 1/17/17.
 */
public class Movie implements Comparable <Movie> {
    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Movie m) {
        if (m.title.equals(title)) {
            return title.compareToIgnoreCase(m.title);
        } else {
            return title.compareToIgnoreCase(m.title);
        }

    }
}
