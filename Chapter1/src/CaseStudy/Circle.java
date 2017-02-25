package CaseStudy;

import java.util.Scanner;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        super("Circle");
        radius = 0;
    }
    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double computeArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double computePerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public void readShapeData()
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the radius of circle.");
        radius = kbd.nextDouble();
    }
    public String toString()
    {
        return (super.toString() + "\n" +
                "Radius: " + radius);
    }
}
