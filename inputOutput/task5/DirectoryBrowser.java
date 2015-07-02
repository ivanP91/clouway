package com.clouway.inputOutput.task5;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by clouway on 15-6-11.
 */
public class DirectoryBrowser {

    public String listContent(String path) {
        Path pathOfFileOrDirectory;
        String message = "";
        try {
            pathOfFileOrDirectory = Paths.get(path);
            pathOfFileOrDirectory.toRealPath();
            boolean isRegularExecutableFile = Files.isRegularFile(pathOfFileOrDirectory);
            if (isRegularExecutableFile) {
                message = "\"" + pathOfFileOrDirectory.getFileName() + "\" is file";
            } else {
                System.out.println("\"" + pathOfFileOrDirectory.getFileName() + "\" is directory and contains: ");
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(pathOfFileOrDirectory)) {
                    for (Path file : stream) {
                        System.out.println(file.getFileName());
                    }
                } catch (IOException | DirectoryIteratorException x) {
                    System.err.println(x);
                }
            }
        } catch (NoSuchFileException x) {
            message = path + " no that file or directory%n";
        } catch (IOException x) {
            message = x.toString();
        }
        return message;
    }

}
