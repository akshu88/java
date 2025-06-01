package tut59;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // How to read a file using Java 

        // BufferedReader + FileReader : Best for reading text files line-by-line
        // FileInputStream : Best for binary files (eg. images, audio files)
        // RandomAccessFile : Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\dell\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = reader.readLine()) !=null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could nott locate file");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }

    }
}
