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

    /**
     * return the discount
     * @return
     */

    String x = null;
    public String getDiscount()
    {
        //calculate the discount by if statements
        if (getNumberAdultTicket() + getNumberChildTicket() < 3)
        {
            x = "0%";
        }

        if (getNumberAdultTicket() + getNumberChildTicket() == 3)
        {
            x = "5%";
        }

        if (getNumberAdultTicket() + getNumberChildTicket() == 4)
        {
            x = "10";
        }

        if (getNumberAdultTicket() + getNumberChildTicket() == 5)
        {
            x = "15%";
        }

        if (getNumberAdultTicket() + getNumberChildTicket() > 5)
        {
            x = "20%";
        }
        return x;
    }

    /**
     * return the subtotal
     * @return
     */

    double y;
    public double getSubtotal()
    {
        if (getDiscount() == "0%")
        {
            y = ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket()));
        }

        if (getDiscount() == "5%")
        {
            y = ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket())) - (0.05)
                    * ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket()));
        }

        if (getDiscount() == "10%")
        {
            y = ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket())) - (0.1)
                    * ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket()));
        }

        if (getDiscount() == "15%")
        {
            y = ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceAdultTicket())) - (0.15)
                    * (getNumberAdultTicket() * getPriceAdultTicket() + getNumberChildTicket() * getPriceChildTicket());
        }

        if (getDiscount() == "20%")
        {
            y = (getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceChildTicket()) - (0.2)
                    * ((getNumberAdultTicket() * getPriceAdultTicket()) + (getNumberChildTicket() * getPriceChildTicket()));
        }

        return y;
    }

    // display the order
    public void order()
    {
        System.out.println("\n"+getName()+" Ticket Order");
        System.out.println("------------------------------------");
        System.out.printf("Discount:%19s", getDiscount());

        System.out.printf("\n\nAdult:%10s x $%8.2f", getNumberAdultTicket(),getPriceAdultTicket());
        System.out.printf("\nChild:%10s x $%8.2f", getNumberChildTicket(),getPriceChildTicket());

        System.out.println("\n------------------------------------");
        System.out.printf("Subtotal:%10s$%8.2f", "", getSubtotal());
        System.out.printf("\nTax:%15s$%8.2f", "", (0.11 * getSubtotal()));
        System.out.printf("\nTotal:%13s$%8.2f", "", getSubtotal() + (0.11*getSubtotal()));
    }
}

