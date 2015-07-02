package com.clouway.inputOutput.task4;

import java.io.*;


/**
 * Created by clouway on 15-6-9.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        TransferObject transfer=new TransferObject();
        System.out.println(transfer.transferObject("src/com/clouway/inputOutput/task4/inputTransfer.txt","src/com/clouway/inputOutput/training/Slavi.txt",4));


    }
}
