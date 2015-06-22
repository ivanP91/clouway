package com.clouway.inputOutput.task1;

import java.util.Scanner;

/**
 * Created by clouway on 15-6-9.
 */
public class ReadFromConsole {

    public void readString(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(s);
    }
    public void readInt(){
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        System.out.println(s);
    }
    public void readChar(){
        Scanner input=new Scanner(System.in);
        char s=input.next().charAt(0);
        System.out.println(s);
    }
    public  void readFloat(){
        Scanner input=new Scanner(System.in);
        float s=input.nextFloat();
        System.out.println(s);
    }
}
