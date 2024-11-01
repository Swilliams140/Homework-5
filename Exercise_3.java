/*
Class: Exercise_3
@Author: Stanley Williams
@version 1.0
Written: October 31, 2024
Course: ITEC 2150 Fall 2024
Description: This Class reads a file then returns the values as objects
 */
// Calling all the libraries that I may need for the assignment
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Exercise_3 {
    public static void main(String[] args){

        //Creates an ArrayList of Poem types
        ArrayList<Poem> lines = new ArrayList<>();

        //Input that looks for the specific local file
        String input = "src/poems2.txt";

        //try statment that initialized the BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader(input))){
            String poemName;

            //This iterates line by line and continues till there is a null statement
            while((poemName = br.readLine()) != null){

                //This reads the second line of the poem
                String poetName = br.readLine();

                //Add to the ArrayList of poems
                if(poetName != null){
                    lines.add(new Poem(poemName,poetName));
                }
            }

            //This Exception catches if there is any null input or output values passed during runtime
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(lines);

    }
}
