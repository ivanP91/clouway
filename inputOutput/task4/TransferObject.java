package com.clouway.inputOutput.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by clouway on 15-6-16.
 */
public class TransferObject {
    public int transferObject(String source, String target, int num) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        int i=0;
        try {
            inputStream = new FileReader(source);
            outputStream = new FileWriter(target);
            int c;
            while ((c = inputStream.read()) != -1 && i<num) {
                outputStream.write(c);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        return i;
    }
    public boolean transferObject(String source, String target) {
        boolean transferObject=false;
        Path in = Paths.get(source);
        Path out = Paths.get(target);
        try {
            Files.copy(in, out);
            transferObject=true;
        } catch (IOException e) {
           e.printStackTrace();
        }
        return transferObject;
    }

}
