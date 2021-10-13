package exercises;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String lowerCaseQuote = quote.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Search word:");
        String search = input.nextLine().toLowerCase();

        boolean isIncluded = lowerCaseQuote.contains(search);

        if (isIncluded){
            int position = lowerCaseQuote.indexOf(search);
            int length = search.length();
            String revised = lowerCaseQuote.replace(search, "");
            System.out.println("First Position: " + position);
            System.out.println("Length: " + length);
            System.out.println("New Quote: " + revised);
        } else {
            System.out.println(search + " is not in the quote");
        }
    }
}
