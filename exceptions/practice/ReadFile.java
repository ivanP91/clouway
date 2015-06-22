package com.clouway.exceptions.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by clouway on 15-6-5.
 */
public class ReadFile {
    public void failReader() {
        try {
            FileReader fr = new FileReader("src/com/clouway/intro/task4/practice/OutFile.txt");
            char[] a = new char[1000];
            fr.read(a);
            for (char c : a) {
                System.out.println(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Runs for sure");
        }
    }

    public void failReaderB() throws IOException {
        BufferedReader br = null;
        try {
            String s;
            br = new BufferedReader(new FileReader("src/com/clouway/intro/task4/practice/OutFile.txt"));
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException " + ex.getMessage());
        } /*catch (IOException ex) {
            System.out.println("Exception " + ex.getMessage());
        }*/ finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
