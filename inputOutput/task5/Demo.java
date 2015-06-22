package com.clouway.inputOutput.task5;

import java.io.*;


/**
 * Created by clouway on 15-6-9.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        DirectoryBrowser d= new DirectoryBrowser();
        d.listContent("/home/clouway/development/idea-IU-141.713.2");
    }
}
