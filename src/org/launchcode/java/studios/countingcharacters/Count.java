package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class Count {
    public static HashMap<Character, Integer> findCount(String quote){
        char[] quoteString = quote.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char c:quoteString){
            if(!characterCount.containsKey(c) && Character.isLetter(c)){
                int count = 0;
                for(char i:quoteString){
                    if(c == i){
                        count++;
                    }
                }
                characterCount.put(c,count);
            }
        }
        return characterCount;
    }
}
