package com.clouway.inputOutput.task5;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by clouway on 15-6-11.
 */
public class DirectoryBrowser {

    public void listContent(String path) {
        Path ford;
        try {
            ford = Paths.get(path);
            ford.toRealPath();
            boolean isRegularExecutableFile = Files.isRegularFile(ford);
            if (isRegularExecutableFile) {
                System.out.println("\""+ford.getFileName() + "\" is file");
            } else {
                System.out.println("\"" + ford.getFileName() + "\" is directory and contains: ");
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(ford)) {
                    for (Path file : stream) {
                        System.out.println(file.getFileName());
                    }
                }catch (IOException | DirectoryIteratorException x) {
                    System.err.println(x);
                }
            }
        } catch (NoSuchFileException x) {
            System.err.format(path + " no that file or directory%n");
        } catch (IOException x) {
            System.err.format(x.toString());
        }
    }

}
