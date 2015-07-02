package com.clouway.inputOutput.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by clouway on 15-6-22.
 */
public class FailInputStreame {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/com/clouway/inputOutput/training/xanadu.txt");
            out = new FileOutputStream("src/com/clouway/inputOutput/training/outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}
