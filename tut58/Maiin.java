package tut58;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Maiin {
    public static void main(String[] args){
        
        // How to write a file using Java

        // FileWriter = Good for email or medium-sized text files
        // Bufferedwriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (eg. images, audio files)


        String filePath = "C:\\Users\\dell\\OneDrive\\Desktop\\test.txt";
        String textContent = "I like pizza!\nIt's really good!\nBuy me pizza!";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}
