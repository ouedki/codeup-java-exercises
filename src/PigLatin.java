import java.util.Scanner;

/**
 * Translator - English to Pig Latin
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        do {
            String word = enterWord(sc);
            word = word.toLowerCase();
            System.out.println("You Entered: " + word);
            System.out.println(findVowel(word));
            System.out.println("Do you want to translate another word?");
            response = sc.nextLine();
        } while (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }
    public static String enterWord (Scanner scan) {
        System.out.println("Enter a word you want to translate: ");
        return scan.nextLine();
    }

    public static String findVowel(String word){
        String newWord="";
        for (int i = 0; i<word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                newWord = word.substring(i) + word.substring(0, i) + "way";
                break;
            }else {
                newWord=word + "ay";
            }
        }
        return newWord;
    }
}
