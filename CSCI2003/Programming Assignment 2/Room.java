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
    private int height;
    private int width;

    // no-argument constractor
    public Room
    {
        numberOfWalls = 0;
        height = 0;
        width = 0;
        totalArea = 0;
    }

    //argument constractor
    public Room (int nW, int h, int w)
    {
        numberOfWalls = nW;
        height = h;
        width = w;
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
        return numerOfWalls;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
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
        return  "Number of walls:  " + numberOfWalls +
                "\nHeight of the wall:  " + height +
                "\n Width of the wall:  " + width + "\n";
    }
}
