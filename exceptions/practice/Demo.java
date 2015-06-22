package com.clouway.exceptions.practice;

import java.io.IOException;

/**
 * Created by clouway on 15-6-5.
 */
public class Demo {
    public static void main (String[] args) throws IOException {
        ListOfNumbers list=new ListOfNumbers();
        list.writeList();
        ReadFile file=new ReadFile();
        file.failReaderB();
       // file.failReader();
    }
}
