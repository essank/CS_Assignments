// Name: Issa Alkhamees Date Assigned: 2/21
//
// Course: CSCI 2003 42733 Date Due: 2/24
// Instructor: Ms. Greer
//
// File name: Dog.java
//
// Program Description: simulate the website of a pet store that helps the user choose a dog to adopt.

public class Dog {

    private String size;
    private String coatLength;

    public Dog()
    {
         size = "";
         coatLength = "";
    }

    public Dog (String s, String c)
    {
        size = s;
        coatLength = c;
    }

    public void setSize(String s)
    {
         size = s;
    }

    public void setCoatLen(String c)
    {
        coatLength = c;
    }

    public String getSize()
    {
        return size;
    }

    public String getCoatLength()
    {
        return coatLength;
    }

    String breed;
    public String getBreed()
    {

        if (getSize() == "Small")
        {
            if (getCoatLength() == "Short")
            {
                System.out.print("Pug");
            }

            if (getCoatLength() == "Medium")
            {
                System.out.print("Shiba Inu");
            }

            if (getCoatLength() == "Long")
            {
                System.out.print("Long");
            }

        }

        if (getSize() == "Medium")
        {
            if (getCoatLength() == "Short")
            {
                System.out.print("Basset Hound");
            }

            if (getCoatLength() == "Medium")
            {
                System.out.print("Gordon Setter");
            }

            if (getCoatLength() == "Long")
            {
                System.out.print("Irish Setter");
            }
        }

        if (getSize() == "Large")
        {
            if (getCoatLength() == "Short")
            {
                System.out.print("Weimaraner");
            }

            if (getCoatLength() == "Medium")
            {
                System.out.print("Goldendoodle");
            }

            if (getCoatLength() == "Long")
            {
                System.out.print("Belgian Sheepdog");
            }
        }

        return breed;
    }
}
