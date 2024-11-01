/*
Class: Poem
@Author: Stanley Williams
@version 1.1
Written: October 10, 2024
Course: ITEC 2150 Fall 2024
Description: This Class is used to create the Poem objects in other classes
 */
public class Poem {
    private String name;
    private String poet;



    public Poem(){
        name = "unknown";
        poet = "unknown";
    }

    // I had to create this for Exercise 3
    public Poem (String name, String poet){
        this.name = name;
        this.poet = poet;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPoet(){
        return poet;
    }
    public void setPoet(String poet){
        this.poet = poet;
    }

    //override
    public String toString(){
        return "Poem [name= "+name+", poet= "+poet+"]";
    }
}
