package chapter14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args) {
        String path = "javaProjects\src";
        File file = createFile(path);
        writeToFile(file,true);
    }


    public static File createFile(String path){
        try {
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            if (file.exists()) file.delete();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        throw new IllegalStateException();
    }

    public static void writeToFile(File file, boolean append){
        try( FileWriter fileWriter = new FileWriter(file,true);
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println("Hello");
            writer.println("world");
//            Try with resources makes flush and close redundant.
//            writer.flush();
//            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void readFromFile(String path){
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
