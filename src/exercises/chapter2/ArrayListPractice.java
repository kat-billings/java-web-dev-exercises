package exercises.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> sample = new ArrayList<>();
        sample.add(23);
        sample.add(3);
        sample.add(90);
        sample.add(954);
        sample.add(86433);
        sample.add(7);
        sample.add(0);
        sample.add(12);
        sample.add(6);
        sample.add(235);
        sample.add(1890);

        Integer evens = EvenSum.findSum(sample);
        System.out.println(evens);

        ArrayList<String> words = new ArrayList<>();
        words.add("What");
        words.add("doing");
        words.add("are");
        words.add("track");
        words.add("field");
        words.add("association");
        words.add(" ");
        words.add("kinds");
        words.add("fives");
        words.add("in");
        words.add("a");

        FindFiveLetterWords.printer(words);
    }
}
