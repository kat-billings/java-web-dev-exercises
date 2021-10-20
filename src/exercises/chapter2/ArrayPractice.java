package exercises.chapter2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,8};
        String guyQuote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        for(int i: arr){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }

        String[] quoteWords = guyQuote.split(" ");
        System.out.println(Arrays.toString(quoteWords));

        String[] quoteSentences = guyQuote.split("\\.");
        System.out.println(Arrays.toString(quoteSentences));
    }
}
