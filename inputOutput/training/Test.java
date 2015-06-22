package com.clouway.inputOutput.training;

import java.io.IOException;
import java.nio.file.*;


/**
 * Created by clouway on 15-6-18.
 */
public class Test {
    public void testMetod() throws IOException {
        Path newLink = Paths.get("src/com/clouway/inputOutput/training/");
        Path target = Paths.get("src/com/clouway/inputOutput/task6/output.ser");
        try (DirectoryStream<Path>
                     stream = Files.newDirectoryStream(newLink, "*.{txt}")) {
            for (Path entry: stream) {
                //System.out.println(entry.getFileName());
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
