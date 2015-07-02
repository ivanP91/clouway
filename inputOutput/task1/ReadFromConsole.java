package com.clouway.inputOutput.task1;

import java.util.Scanner;

/**
 * Created by clouway on 15-6-9.
 */
public class ReadFromConsole {

    public String readString(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        return s;
    }
    public int readInt(){
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        return s;
    }
    public char readChar(){
        Scanner input=new Scanner(System.in);
        char s=input.next().charAt(0);
        return s;
    }
    public  float readFloat(){
        Scanner input=new Scanner(System.in);
        float s=input.nextFloat();
        return s;
    }
}
