package com.clouway.intro.task6;

import java.lang.*;

/**
 * Created by clouway on 15-5-4.
 */
public class StringGenerator {

    /**
     * Generate shuffle string with variable length
     * @param length length of string
     * @param first
     * @param last
     */
    public void shuffleString(int length, char first, char last) {
        String randomString = "";
        for (int i = 0; i < length; i++) {
            int rn = (int) ((last - first) * Math.random()) + first;
            char c = (char) rn;
            randomString += Character.toString(c);
        }
        System.out.println(randomString);
    }

}
