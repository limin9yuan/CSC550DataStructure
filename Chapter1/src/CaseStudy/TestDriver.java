package CaseStudy;

import java.util.Scanner;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class TestDriver
{
    public static void main(String[] args)
    {
        Shape myShape;
        double perimeter;
        double area;
        myShape = getShape();
        myShape.readShapeData();
        perimeter = myShape.computePerimeter();
        area = myShape.computeArea();
        disPlayResult(myShape, perimeter, area);
    }
    public static Shape getShape()
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter circle to create circle.");
        System.out.println("Enter rectangle to create rectangle.");
        System.out.println("Enter rightTriangle to create rightTriangle.");
        String commend = kbd.next();
        if (commend.equalsIgnoreCase("circle"))
            return new Circle();
        else if (commend.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if (commend.equalsIgnoreCase("rightTriangle"))
            return new RtTriangle();
        else
            return null;
    }
    private static void disPlayResult(Shape myShape, double perimeter, double area)
    {
        System.out.println(myShape);
        System.out.printf("The area is %.2f%nThe perimeter is %.2f", area, perimeter);
    }
}
