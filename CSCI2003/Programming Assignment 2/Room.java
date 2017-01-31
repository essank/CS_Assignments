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
    private int numerOfWalls;
    private int height;
    private int width;

    // no-argument constractor
    public Room
    {
        numerOfWalls = 0;
        height = 0;
        width = 0;
    }

    //argument constractor
    public Room (int nW, int h, int w)
    {
        numerOfWalls = nW;
        height = h;
        width = w;
    }

    //setters
    public void setnumerOfWalls(int nW)
    {
        numerOfWalls = nW;
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
    public int getnumerOfWalls()
    {
        return numerOfWalls;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return height;
    }
}
