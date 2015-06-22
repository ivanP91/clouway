package com.clouway.inputOutput.task4;

import java.io.*;

/**
 * Created by clouway on 15-6-16.
 */
public class TransferObject {
    public void transferObject() throws IOException {
        BufferedReader input=null;
        PrintWriter output=null;
        try {
            input = new BufferedReader(new FileReader("src/com/clouway/inputOutput/task4/inputTransfer.txt"));
            output = new PrintWriter(new FileWriter("src/com/clouway/inputOutput/task4/outputTransfer.txt"));
            String inputString;
            do {
                inputString=input.readLine();
                if(inputString!=null) {
                    output.println(inputString);
                }
            }while (inputString!=null);
        }catch (FileNotFoundException ex){
            System.out.println(ex.toString());
        }catch (IOException ex){
        } finally {
            if (input != null) {
                try {
                    input.close();
                }catch (IOException ex){

                }
            }
            if (output != null) {
                output.close();
            }
        }
    }
}
