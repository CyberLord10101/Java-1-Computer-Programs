package filehandlingdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String line;
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\colep\\IdeaProjects\\FileHandlingDemo\\src\\filehandlingdemo\\myFile.txt"));
            line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
