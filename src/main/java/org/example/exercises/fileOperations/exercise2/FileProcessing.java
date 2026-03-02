package org.example.exercises.fileOperations.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileProcessing {

    public static void fileUtilityOperations() throws IOException {
        //Accessing a file
        Path path=Paths.get("FileOperationsPractice.txt");

        //Print file information
        System.out.println("File name: "+path.getFileName());
        System.out.println("Absolute path: "+path.toAbsolutePath());
        System.out.println("Real path: "+path.toRealPath());
        System.out.println("File system: "+path.getFileSystem());
        System.out.println("Root: "+path.getRoot());
        System.out.println("Parent: "+path.getParent());
        System.out.println("Name count: "+path.getNameCount());

        //Reading the file contents
        System.out.println("===READING FILE CONTENTS===");
        try {
            if(!Files.exists(path)){
                System.out.println("File does not exist");
                Files.createFile(path);
                System.out.println("File created at: "+path.toAbsolutePath());
            }

            //Writing to the file
            String fileContent="Hello all\nThis is a file that I created when I was learning about java operations.\nJava is fun and I love it.\nI dont understnd why people say that Java is difficult";
            Files.writeString(path,fileContent);

//            //Read all bytes
//            byte[] bytesInFile=Files.readAllBytes(path);
//            String contentFromFile=new String(bytesInFile);
//            System.out.println("==Bytes in file==");
//            System.out.println(contentFromFile);
//
//            //Read all lines as string
//            List<String> lines=Files.readAllLines(path);
//            System.out.println("==Lines in file==");
//            lines.forEach(System.out::println);

            //Read as string
            String content=Files.readString(path);
            System.out.println("Reading as string==");
            System.out.println(content);

            //Process file content
            //Count lines
            long linesCount=Files.readAllLines(path).size();
            System.out.println("==Number of lines==");
            System.out.println("Number of lines: "+linesCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
