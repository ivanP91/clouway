package com.clouway.intro.task1Task2;

/**
 * Created by clouway on 15-5-4.
 */
public class Math1 {
    /**
     * Finds the greater common divisor.
     *
     * @param a first argument
     * @param b second argument
     * @return
     */
    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;

    }

    /**
     * Finds the least common
     * @param a first argument
     * @param b second argument
     * @return
     */
    public int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }


}
