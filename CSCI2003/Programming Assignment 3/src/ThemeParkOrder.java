 // Name: Issa Alkhamees Date Assigned: 2/14
 //
 // Course: CSCI 2003 42733 Date Due: 2/21
 // Instructor: Ms. Greer
 //
 // File name: ThemeParkOrder.java
 //
 // Program Description:  simulate a website that sells theme park tickets.


public class ThemeParkOrder {

    private String name;
    private double priceAdultTicket;
    private double priceChildTicket;
    private int numberAdultTicket;
    private int numberChildTicket;

    //no-argument constructor
    public ThemeParkOrder()
    {
        name = " ";
        priceAdultTicket = 0;
        priceChildTicket = 0;
        numberAdultTicket = 0;
        numberChildTicket = 0;
    }

    //argument constructor
    public ThemeParkOrder(String n, double pA, double pC, int nA, int nC)
    {
        name = n;
        priceAdultTicket = pA;
        priceChildTicket = pC;
        numberAdultTicket = nA;
        numberChildTicket = nC;
    }

    /**
     Sets name variable
     @param n value to set to name
     */

    public void setName(String n)
    {
        name = n;
    }

    /**
     Sets priceAdultTicket variable
     @param pA value to set to name
     */

    public void setPriceAdultTicket(double pA)
    {
        priceAdultTicket = pA;
    }

    /**
     Sets priceChildTicket variable
     @param pC value to set to name
     */

    public void setPriceChildTicket(double pC)
    {
        priceChildTicket = pC;
    }

    /**
     Sets numberAdultTicket variable
     @param nA value to set to name
     */

    public void setNumberAdultTicket(int nA)
    {
        numberAdultTicket = nA;
    }

    /**
     Sets numberChildTicket variable
     @param nC value to set to name
     */

    public void setNumberChildTicket(int nC)
    {
        numberChildTicket = nC;
    }

    /**
     * return the name
     * @return
     */

    public String getName()
    {
        return name;
    }

    /**
     * return number of adult tickets
     * @return
     */

    public int getNumberAdultTicket()
    {
        return numberAdultTicket;
    }

    /**
     * return number of child tickets
     * @return
     */

    public int getNumberChildTicket()
    {
        return numberChildTicket;
    }

    /**
     * return price of adult tickets
     * @return
     */

    public double getPriceAdultTicket()
    {
        return priceAdultTicket;
    }

    /**
     * return price of child tickets
     * @return
     */

    public double getPriceChildTicket()
    {
        return priceChildTicket;
    }

}

