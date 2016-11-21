public class Circle {

    private double radius;

    //set radius value
    public void setRadius (double r) {
        radius = r;
    }

    //return radius value
    public double getRadius(){
        return radius;
    }

    //calculate the area
    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }

    //calculate the circumference
    public double getCircumference(){
        double circumference= Math.PI * 2*radius;
        return circumference;
    }
}
