package org.example.exercises.fileOperations.exercise1;

import java.io.File;
import java.io.IOException;

public class FileManagement {

    public static void fileManagementUtility() throws IOException {
        //Create files
        File fileCreated=new File("createdFile.txt");
        boolean created= fileCreated.createNewFile();
        System.out.println("Created: "+created);

        File file1=new File("example.txt");
        System.out.println("Exists: "+file1.exists());
        File file2 = new File("/absolute/path/to/file.txt");
        File file3 = new File("directory", "file.txt");

        //Create directory
        File dir=new File("mydir");
        boolean dirCreated= dir.mkdir();
        System.out.println("Created: "+dirCreated);

        //Check file properties
        System.out.println("File name: "+file1.getName());
        System.out.println("File name: "+file2.getName());
        System.out.println("File name: "+file3.getName());
        System.out.println("Absolute path: "+file1.getAbsolutePath());
        System.out.println("Path: "+file1.getPath());
        System.out.println("Canonical path: "+file1.getCanonicalPath());
        System.out.println("Parent: "+file1.getParent());
        System.out.println("File length: "+file1.length());


        System.out.println("Can read: "+file1.canRead());
        System.out.println("Can execute: "+file1.canExecute());
        System.out.println("Can write: "+file1.canWrite());

        //Rename file
        File other=new File("Renamed file");
        boolean renamed=file1.renameTo(other);
        System.out.println("Renamed: "+renamed);

        //Delete file
        boolean deleted= other.delete();
        System.out.println("Deleted? "+deleted);
    }
}
