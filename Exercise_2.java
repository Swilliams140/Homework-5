/*
Class: Exercise_2
@Author: Stanley Williams
@version 1.0
Written: October 10, 2024
Course: ITEC 2150 Fall 2024
Description: This Class creates 3 Poem objects and prints them in a file
 */
import java.io.*;// wildcard

public class Exercise_2 {
    public static void main(String[] args){
        //create the output file
        String output = "src/poems.txt";

        //creation of the 3 objects with Names and Poets
        // First object is Grey which matches the tone of the Author
        Poem grey = new Poem();
        grey.setName("The Raven");
        grey.setPoet("Edgar Allan Poe");

        //Blue for Langston Hughes because his poems were popular in a jazzy-time period
        Poem blue = new Poem();
        blue.setName("Harlem");
        blue.setPoet("Langston Hughes");

        //Red for Emily Dickinson because it just seems fitting
        Poem red = new Poem();
        red.setName("I could not stop for death");
        red.setPoet("Emily Dickinson");


        try(PrintWriter pw = new PrintWriter(output)){
            pw.println("First Poem:");
            pw.println(grey.getPoet());
            pw.println(grey.getName());
            pw.println();
            pw.println("Second Poem:");
            pw.println(blue.getPoet());
            pw.println(blue.getName());
            pw.println();
            pw.println("Third Poem:");
            pw.println(red.getPoet());
            pw.println(red.getName());
            pw.println();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
