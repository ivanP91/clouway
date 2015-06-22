package com.clouway.inputOutput.task2;

import java.io.*;

/**
 * Created by clouway on 15-6-10.
 */
public class ConsoleReadAndWriteInTextFail {

    public void consoleReadAndWriteInTextFile() throws IOException {
        BufferedReader name=new BufferedReader(new InputStreamReader(System.in));
        String failName=name.readLine();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/com/clouway/inputOutput/task2/"+ failName +".txt"));
        try {
            String lineFromInput=null;
               do {
                   lineFromInput = in.readLine();
                   out.write(lineFromInput);
                   //out.newLine();
               }while (!lineFromInput.equalsIgnoreCase("."));
            System.out.println("Write Successful");
        } catch (IOException e1) {
            System.out.println("Error during reading/writing");
        }finally {
            out.close();
            in.close();
        }
    }
}
