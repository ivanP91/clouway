package com.clouway.inputOutput.task2;

import java.io.*;


/**
 * Created by clouway on 15-6-9.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ConsoleReadAndWriteInTextFail write=new ConsoleReadAndWriteInTextFail();
        System.out.print("Write name of text fail: ");
        write.consoleReadAndWriteInTextFile();
    }
}
