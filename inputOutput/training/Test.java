package com.clouway.inputOutput.training;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.*;

/**
 * Created by clouway on 15-6-18.
 */
public class Test {
    public void move() {
        BufferedReader input = null;
        PrintWriter output = null;
        try {
            input = new BufferedReader(new FileReader("src/com/clouway/inputOutput/task4/inputTransfer.txt"));
            output = new PrintWriter(new FileWriter("src/com/clouway/inputOutput/task4/outputTransfer.txt"));
            String inputString;
            do {
                inputString = input.readLine();
                if (inputString != null) {
                    output.println(inputString);
                }
            } while (inputString != null);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {

                }
            }
            if (output != null) {
                output.close();
            }
        }
    }

    public void testMetod() throws IOException {
        Path newLink = Paths.get("src/com/clouway/inputOutput/training/");
        Path target = Paths.get("src/com/clouway/inputOutput/task6/output.ser");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(newLink, "*.{txt}")) {
            for (Path entry: stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        /*try {
            newLink.toRealPath();
            target.toRealPath();
            System.out.println(newLink.toString());
            System.out.println(target.toString());
            Files.createLink(newLink, target);
            System.out.println(newLink.toString());
        } catch (IOException x) {
            System.err.println(x);
        } catch (UnsupportedOperationException x) {
            // Some file systems do not support symbolic links.
            System.err.println(x);
        }*/
    }
}
