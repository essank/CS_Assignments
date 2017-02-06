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

    // no-argument constractor
    public Room(int nW, double h, double w)
    {
        numberOfWalls = nW;
        height = h;
        width = w;
    }

    //argument constractor
    public Room()
    {
        numberOfWalls = 0;
        height = 0;
        width = 0;
    }

    //setters
    public void setNumberOfWalls(int nW)
    {
        numberOfWalls = nW;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public void setWidth(int w)
    {
        width = w;
    }

    //getters
    public int getNumberOfWalls()
    {
        return numberOfWalls;
    }

    public double getHeight()
    {
        return height;
    }

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
