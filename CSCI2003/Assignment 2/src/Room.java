// Name: Issa Alkhamees Date Assigned: 1/31
//
// Course: CSCI 2003 42733 Date Due: 2/10
// Instructor: Ms. Greer
//
// File name: Room.java
//
// Program Description: simulate an online store that sells paint.

public class Room
{
    private int numberOfWalls;
    private double height;
    private double width;

    // no-argument constructor
    public Room(int nW, double h, double w)
    {
        numberOfWalls = nW;
        height = h;
        width = w;
    }

    //argument constructor
    public Room()
    {
        numberOfWalls = 0;
        height = 0;
        width = 0;
    }

    //setters
    //set number of wall
    public void setNumberOfWalls(int nW)
    {
        numberOfWalls = nW;
    }

    //set the height
    public void setHeight(int h)
    {
        height = h;
    }

    //set the width
    public void setWidth(int w)
    {
        width = w;
    }

    //getters
    //return number of wall value
    public int getNumberOfWalls()
    {
        return numberOfWalls;
    }

    //return the height value
    public double getHeight()
    {
        return height;
    }

    //return the width value
    public double getWidth()
    {
        return width;
    }

    //calculates the area
    public double getArea()
    {
       return numberOfWalls * width * height;
    }

    public String toString()
    {
        return "Walls:   "+ numberOfWalls
                +"\nHeight:  "+ height
                +" ft" +"\nWidth:   "
                + width +" ft";
    }
}
