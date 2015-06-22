package com.clouway.inputOutput.training;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by clouway on 15-6-18.
 */
public class SearchInDirectory {
    public void searchInDirectory(String target,String searchElement){
        Path newLink = Paths.get(target);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(newLink, searchElement)) {
                for (Path entry: stream) {
                    System.out.println(entry.getFileName());
                }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
