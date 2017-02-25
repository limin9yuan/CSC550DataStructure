package CaseStudy;

import java.util.Scanner;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class Rectangle extends Shape
{
    private double width;
    private double height;

    public Rectangle()
    {
        super("Rectangle");
        width = 0;
        height = 0;
    }
    public Rectangle(double width, double height)
    {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getWidth()
    {
        return width;
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
        return width * height;
    }
    public double computePerimeter()
    {
        return (width + height) * 2;
    }
    public void readShapeData()
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the width of rectangle.");
        width = kbd.nextDouble();
        System.out.println("Enter the height of rectangle.");
        height = kbd.nextDouble();
    }
    public String toString()
    {
        return (super.toString() + "\n" +
                "Width: " + width + "\n" +
                "Height: " + height);
    }
}
