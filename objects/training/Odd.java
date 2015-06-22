package com.clouway.objects.training;

/**
 * Created by clouway on 15-5-21.
 */
public class Odd {

    public int sumOdd() {
        int sumOdd = 0;
        for (int i = 1; i < 100; i += 2) {
            sumOdd += i;
        }
        return sumOdd;
    }
    public int sumOddWhile(){
        int sumOdd=1;
        int i=1;
        while (i<99){
            i+=2;
            sumOdd+=i;
        }
        return sumOdd;
    }

}
