package com.welin;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
//            Path fileToCreate=FileSystems.getDefault().getPath("Example","file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate=FileSystems.getDefault().getPath("Example","Dir4");
//            Files.createDirectories(dirToCreate);
//                Path dirToCreate=FileSystems.getDefault().getPath("Example","Dir2/Dir3/Dir4/Dir5/Dir6");
//                Files.createDirectories(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Example", "Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Example", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());

//            Path fileToDelete=FileSystems.getDefault().getPath("Example","Dir1","file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//        Path path= FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
////        Path filePath= FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath= Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
//
////        filePath= Paths.get("/Users/chenweilin/Desktop/java/14/OutThere.txt");
//        filePath= Paths.get("/Users/chenweilin","/Desktop/java","/14/OutThere.txt");
//        printFile(filePath);
//
//        filePath=Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2=FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3=FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4=Paths.get("abcdef","whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath=FileSystems.getDefault().getPath("files");
//        System.out.println("Exist = "+Files.exists(filePath));
//
//        System.out.println("Exist = "+Files.exists(path4));
//
//    }
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader= Files.newBufferedReader(path)){
//            String line;
//            while((line=fileReader.readLine())!=null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
