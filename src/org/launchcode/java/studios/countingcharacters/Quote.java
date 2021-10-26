package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class Quote {
    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("Enter quote: ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        HashMap<Character, Integer> newCount = Count.findCount(quote);
        System.out.println(newCount);
    }
}
