package com.clouway.inputOutput.task6;

import java.io.*;


/**
 * Created by clouway on 15-6-9.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Vehicle vw=new Vehicle("golf","red",2000);
        DataClass data=new DataClass();
        OutputStream out = new FileOutputStream("src/com/clouway/inputOutput/task6/output.ser");
        data.saveObject(out, vw);
        InputStream inputStream= new FileInputStream("src/com/clouway/inputOutput/task6/output.ser");
        System.out.println(data.getObject(inputStream));
    }
}
