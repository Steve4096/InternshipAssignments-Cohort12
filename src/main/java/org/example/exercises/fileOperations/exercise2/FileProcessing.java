package org.example.exercises.fileOperations.exercise2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessing {

    public static void fileUtilityOperations(){
        Path path= Paths.get("/home/Steve/Downloads/Accounting.xlsx");

        //Print file information
        System.out.println("File name: "+path.getFileName());
        System.out.println("Absolute path: "+path.toAbsolutePath());
        System.out.println("Real path: ");
        System.out.println("File system: "+path.getFileSystem());
        System.out.println("Root: "+path.getRoot());
        System.out.println("Parent: "+path.getParent());
        System.out.println("Name count: "+path.getNameCount());
        System.out.println();
    }
}
