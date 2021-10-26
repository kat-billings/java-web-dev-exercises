package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class FindFiveLetterWords {
    public static void printer(ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int search = input.nextInt();

        for(String word: words){
            int length = word.length();
            if(length == search){
                System.out.println(word);
            }
        }
    }
}
