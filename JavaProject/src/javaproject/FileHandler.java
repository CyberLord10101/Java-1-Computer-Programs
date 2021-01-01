package javaproject;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {
    public LinkedList<Member> readFile(){
        LinkedList<Member> m = new LinkedList();
        String lineRead;
        String[] lineSplit;
        Member mem;

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\colep\\IdeaProjects\\" +
                "JavaProject\\src\\javaproject\\members.csv"))){
            lineRead = reader.readLine();
            while(lineRead != null){
                lineSplit = lineRead.split(", ");

                if(lineSplit[0].equals("S")){
                    mem = new SingleClubMember('S', Integer.parseInt(lineSplit[1]),lineSplit[2],
                            Double.parseDouble(lineSplit[3]),Integer.parseInt(lineSplit[4]));
                }else{
                    mem = new MultiClubMember('M', Integer.parseInt(lineSplit[1]), lineSplit[2],
                            Double.parseDouble(lineSplit[3]), Integer.parseInt(lineSplit[4]));
                }
                m.add(mem);

                lineRead = reader.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return m;
    }
    public void appendFile(String mem){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\colep\\IdeaProjects" +
                "\\JavaProject\\src\\javaproject\\members.csv",true))){
            writer.write(mem + "\n");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void overwriteFile(LinkedList<Member> m){
        String s;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\colep\\IdeaProjects" +
                "\\JavaProject\\src\\javaproject\\members.temp", false))){
            for(int i = 0; i < m.size(); i++){
                s = m.get(i).toString();
                writer.write(s + "\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            File f = new File("C:\\Users\\colep\\IdeaProjects" +
                    "\\JavaProject\\src\\javaproject\\members.csv");
            File tf = new File("C:\\Users\\colep\\IdeaProjects" +
                    "\\JavaProject\\src\\javaproject\\members.temp");

            f.delete();
            tf.renameTo(f);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
