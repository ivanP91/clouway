package com.clouway.inputOutput.task2;

import java.io.*;

/**
 * Created by clouway on 15-6-10.
 */
public class ConsoleReadAndWriteInTextFail {

    public String consoleReadAndWriteInTextFile() throws IOException {
        String message="";
        BufferedReader name=new BufferedReader(new InputStreamReader(System.in));
        String failName=name.readLine();
        BufferedWriter out=null;
        BufferedReader in=null;
        try {
            out = new BufferedWriter(new FileWriter("src/com/clouway/inputOutput/task2/"+ failName +".txt"));
            String lineFromInput=null;
               do {
                   in = new BufferedReader(new InputStreamReader(System.in));
                   lineFromInput = in.readLine();
                   out.write(lineFromInput);
                   //out.newLine();
               }while (!lineFromInput.equalsIgnoreCase("."));
            message="Write Successful";
        } catch (IOException e1) {
            message="Error during reading/writing";
        }finally {
            if (out==null){
                out.close();
            }
            if (in==null){
                in.close();
            }
        }
        return message;
    }
}
