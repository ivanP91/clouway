package com.clouway.inputOutput;

import com.clouway.inputOutput.task1.ReadFromConsole;
import com.clouway.inputOutput.task2.ConsoleReadAndWriteInTextFail;
import com.clouway.inputOutput.task3.RevertTextOfTextFile;
import com.clouway.inputOutput.task4.TransferObject;
import com.clouway.inputOutput.task5.DirectoryBrowser;
import com.clouway.inputOutput.task6.DataClass;
import com.clouway.inputOutput.task6.Vehicle;

import java.io.*;


/**
 * Created by clouway on 15-6-9.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ReadFromConsole read=new ReadFromConsole();
        read.readString();
        ConsoleReadAndWriteInTextFail write=new ConsoleReadAndWriteInTextFail();
        System.out.print("Write name of text fail: ");
        write.consoleReadAndWriteInTextFile();
        RevertTextOfTextFile revert=new RevertTextOfTextFile();
        revert.revertTextOfTextFile();
        DirectoryBrowser d= new DirectoryBrowser();
        d.listContent("/home/clouway/development/idea-IU-141.713.2");
        TransferObject transfer=new TransferObject();
        //transfer.transferObject();
        Vehicle vw=new Vehicle("golf","red",2000);
        DataClass data=new DataClass();
        OutputStream out = new FileOutputStream("src/com/clouway/intro/task5/task6/output.ser");
        data.saveObject(out, vw);
        InputStream inputStream= new FileInputStream("src/com/clouway/intro/task5/task6/output.ser");
        data.getObject(inputStream);
    }
}
