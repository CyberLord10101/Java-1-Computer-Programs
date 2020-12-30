package filehandlingdemo;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        //This is how to write to a file
        String text = "Hello World";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("myFile2.txt",true))){
            writer.write(text);
            writer.newLine();
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
        //How to rename files **Warning goes to src not inside the package
        File f = new File("myFile2.txt");
        File nf = new File("myNewFile.txt");
        f.renameTo(nf);


        //This is the new way of reading a file
        /*
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\colep\\IdeaProjects\\FileHandlingDemo\\src\\filehandlingdemo\\myFile.txt"))){
            line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(IOException e ){
            System.out.println(e.getMessage());
        }

        */
        /* This is the old before Java 7 way of reading a file
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
        */
    }
}
