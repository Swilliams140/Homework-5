/*
Class: Exercise_1
@Author: Stanley Williams
@version 1.0
Written: October 31, 2024
Course: ITEC 2150 Fall 2024
Description: This Class scans a file and returns the average, sum, highest number and lowest number.
 */
import java.io.*; // wildcard
import java.util.Scanner; // call the Scanner from the util Library in the IDE
public class Exercise_1 {
    public static void main(String[] args){
        File myfile = new File("src/Book1.csv");
        Scanner input = null;
        double sum = 0;
        int numCount = 0;
        double highestnum = 0;
        double lowestnum = 0;

        try{
            input = new Scanner(myfile);
            while (input.hasNextDouble()){
                double num = input.nextDouble();
                highestnum = num;
                if (num > highestnum){
                    highestnum =  num;
                }
                if (num < lowestnum){
                    lowestnum = num;
                }
                numCount++;
                sum += num;
            }


        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            input.close();
        }

        double avg = sum/numCount;

        try(PrintWriter pw = new PrintWriter("src/stat.txt")){
            pw.println("The sum of the numbers is: "+ sum);
            pw.println("The lowest number is: "+ lowestnum);
            pw.println("The highest number is: "+highestnum);
            pw.println("The average of the numbers read is "+avg);
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
