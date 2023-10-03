package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args) {
//        Code to create a new file
       /* File myFile = new File("kspFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }*/

//        Code to write to a file
        /*try {
            FileWriter fileWriter = new FileWriter("kspFile.txt");
            fileWriter.write("This is my first file from this Java course. \nOk now bye!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

//        Reading a file
        /*File myFile = new File("kspFile.txt");
        try {
            Scanner op = new Scanner(myFile);
            while(op.hasNextLine()){
                String line = op.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/

//        Deleting a file
        File myFile = new File("kspFile.txt");
        if(myFile.delete())
        {
            System.out.println("I have deleted: " + myFile.getName());
        }
        else {
            System.out.println("Some error occured while deleting the file.");
        }
    }
}
