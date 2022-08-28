package com.jap.ballad;

import java.io.*;

public class Ballad {
    public String readPoemFromAFile(String poemName){
       // Write the logic to read from a file

        String response = "";
        String data = "";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(poemName);
            BufferedReader br = new BufferedReader(fileReader);
            while((data = br.readLine())!= null){

                response = response .concat("\n")+ data;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return response;
    }

    public static void main(String[] args) {
        Ballad obj = new Ballad();
        String output = obj.readPoemFromAFile("src/main/resources/ballad.txt");
        System.out.println(output);
    }


}
