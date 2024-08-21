package entities;

public class Retangle{
    public double width, height;

    public double area() {
        double p = width * height;
        return p;
    }

    public double perimeter() {
        double p = (2*width) + (2*height);
        return p;
    }

    public double diagonal() {
        double p = (Math.pow(width, 2)+Math.pow(height, 2));
        return Math.sqrt(p);
    }

}