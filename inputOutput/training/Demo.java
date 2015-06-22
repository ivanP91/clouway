package com.clouway.inputOutput.training;

import java.io.IOException;

/**
 * Created by clouway on 15-6-18.
 */
public class Demo {
    public  static void main(String[] args) throws IOException {
        Test test=new Test();
        test.testMetod();
        SearchInDirectory searchInDirectory=new SearchInDirectory();
        searchInDirectory.searchInDirectory("src/com/clouway/intro/task5/training/", "s.txt");
    }
}
