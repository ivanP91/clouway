package com.clouway.inputOutput.task3;

import java.io.*;

/**
 * Created by clouway on 15-6-11.
 */
public class RevertTextOfTextFile {
    public void revertTextOfTextFile() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("src/com/clouway/inputOutput/task3/input.txt"));
            String l;
            String text="";
            while ((l= inputStream.readLine()) != null) {
                text+=l;
            }
            outputStream = new PrintWriter(new FileWriter("src/com/clouway/inputOutput/task3/input.txt"));
            String reverse = new StringBuffer(text).reverse().toString();
            outputStream.write(reverse);
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
