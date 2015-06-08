package com.company;

import java.util.HashMap;

/**
 * Created by guenterc on 08.06.2015.
 */
public class CheckStringAllUniqueChars {
    public boolean hasAllUniqueChars(String text) {
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        String[] chars = text.split("");

        for (int i = 0; i < chars.length; i++) {
            String aChar = chars[i];
            if (count.containsKey(aChar)) {
                count.put(aChar, count.get(aChar) + 1 );
            } else {
                count.put(aChar, 1);
            }
            if (count.get(aChar) > 1) {return false;}
        }
        return true;
    }
}
