package CaseStudy;

/**
 * Created by mingyuanli on 15/11/13.
 */
public abstract class Shape
{
    private String shapeName;

    public abstract double computeArea();
    public abstract double computePerimeter();
    public abstract void readShapeData();
    public Shape()
    {
        shapeName = null;
    }
    public Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }
    public void setShapeName(String shapeName)
    {
        this.shapeName = shapeName;
    }
    public String getShapeName()
    {
        return shapeName;
    }
    public String toString()
    {
        return ("ShapeName: " + shapeName);
    }
}
