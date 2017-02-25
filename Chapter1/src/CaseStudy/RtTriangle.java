package CaseStudy;

import java.util.Scanner;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class RtTriangle extends Shape
{
    private double base;
    private double height;

    public RtTriangle()
    {
        super("RtTriangle");
        base = 0;
        height = 0;
    }
    public RtTriangle(double base, double height)
    {
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getBase()
    {
        return base;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public double computeArea()
    {
        return 0.5 * base * height;
    }
    public double computePerimeter()
    {
        return 3 * base;
    }
    public void readShapeData()
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter base.");
        base = kbd.nextDouble();
        System.out.println("Enter height.");
        height = kbd.nextDouble();
    }
    public String toString()
    {
        return (super.toString() + "\n" +
                "Base: " + base + "\n" +
                "Height: " + height);
    }
}
