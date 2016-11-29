// create FoodItem class
public class FoodItem
{
    private String name; // creating name and make it string
    private int calories; // creating calories and make it integer
    private int fatGrams; // creating fatGrams and make it integer
    private double totalCalories; // creating totalCalories and make it double


    public FoodItem(String StartName, int StartCalories, int StartFatGrams)
    {
        name = StartName;
        calories = StartCalories;
        fatGrams = StartFatGrams;
    }

    // creating setName
    public void setName(String newName)
    {
        name = newName;
    }

    // creating setCalories
    public void setCalories(int newCalories)
    {
        calories = newCalories;
    }

    //creating setFatGrams
    public void setFatGrams(int NewFatGrams)
    {
        fatGrams = NewFatGrams;
    }

    // return name value
    public String getName()
    {
        return name;
    }

    // return calories value
    public int getCalories()
    {
        return calories;
    }

    //return fatGrams
    public int getFatGrams()
    {
        return fatGrams;
    }

    //return toString value
    public String toString()
    {
        return name + " contains " + calories + " calories and " + fatGrams + "fat grams.";
    }

    //return caloriesFromFat after calculation
    public int caloriesFromFat()
    {
        return fatGrams * 9;
    }

    //return percentFat value after calculation
    public double percentFat()
    {
        return caloriesFromFat() / calories;
    }
}
