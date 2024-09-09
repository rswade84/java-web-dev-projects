package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharactersCount {
    public static void main(String[] args) {

        // 1. Hardcode your quote into a String
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // 2.  Turn quote into character array using .toCharArray()
        char[] charArray = quote.toCharArray();

        // 3.  Create a HashMap of characters and counts
        HashMap<Character, Integer> counts = new HashMap<>();

        // 4.  Loop through the character array
        for (char c: charArray) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }

        // 5.  Print out the HashMap
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }


    }
}
