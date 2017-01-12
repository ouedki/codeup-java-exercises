import java.util.Random;

/**
 * Server Name Generator exercise
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String [] adjective = {"cute", "poor", "happy", "stupid", "wonderful", "serious", "angry", "lucky", "ugly", "desperate"};
        String [] nouns = {"dog", "boy", "girl", "student", "donkey", "wife", "boss", "actor", "face", "pig"};
        String adj = getRandom(adjective);
        String noun = getRandom(nouns);
        System.out.println(adj + " " + noun);

    }
    public static String getRandom (String[] array) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }
}
