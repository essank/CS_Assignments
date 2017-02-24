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

    //no-argument constructor
    public Dog()
    {
         size = "";
         coatLength = "";
    }
   
    //argument constructor
    public Dog (String s, String c)
    {
        size = s;
        coatLength = c;
    }

    //setters
    //set size of the dog
    public void setSize(String s)
    {
         size = s;
    }
   //set coat length of the dog
    public void setCoatLen(String c)
    {
        coatLength = c;
    }

    //getters
    //return the dog size
    public String getSize()
    {
        return size;
    }

    //return coat lenght of the dog
    public String getCoatLength()
    {
        return coatLength;
    }

    // create breed as a string 
    public String getBreed()
    {
    
    String breed = "";
         
        //if statment check getSize value 
        if (getSize() == "Small")
        {
            //check getCoatLength value 
            if (getCoatLength() == "Short")
            {
                System.out.print("Pug");
            }

           else if (getCoatLength() == "Medium")
            {
                System.out.print("Shiba Inu");
            }

           else if (getCoatLength() == "Long")
            {
                System.out.print("Long");
            }

        }
        
        // else if statement check getSize value
        else if (getSize() == "Medium")
        {
            //check getCoatLength value
            if (getCoatLength() == "Short")
            {
                System.out.print("Basset Hound");
            }

            else if (getCoatLength() == "Medium")
            {
                System.out.print("Gordon Setter");
            }

           else if (getCoatLength() == "Long")
            {
                System.out.print("Irish Setter");
            }
        }
        
        // else if statement check getSize value
        else if (getSize() == "Large")
        {
            //check getCoatLength value
            if (getCoatLength() == "Short")
            {
                System.out.print("Weimaraner");
            }

            else if (getCoatLength() == "Medium")
            {
                System.out.print("Goldendoodle");
            }

            else  if (getCoatLength() == "Long")
            {
                System.out.print("Belgian Sheepdog");
            }
        }
        
        //return breed value
        return breed;
    }
}
