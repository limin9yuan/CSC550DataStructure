package ComputerAndNotebook;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class Notebook extends Computer
{
    private double screenSize;
    private double weight;

    public Notebook()
    {
        super();
        screenSize = 0;
        weight = 0;
    }
    public Notebook(String manufacturer, String processor, double ramSize, double diskSize, double processorSpeed,
                    double screenSize, double weight)
    {
        super(manufacturer, processor, ramSize, diskSize, processorSpeed);
        this.screenSize = screenSize;
        this.weight = weight;
    }
    public Notebook(Notebook other)
    {
        super(other);
        screenSize = other.screenSize;
        weight = other.weight;
    }
    public void setScreenSize(double screenSize)
    {
        this.screenSize = screenSize;
    }
    public double getScreenSize()
    {
        return screenSize;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        else
        {
            Notebook newNotebook = (Notebook) other;
            return (super.equals(newNotebook) &&
                    screenSize == newNotebook.screenSize &&
                    weight == newNotebook.weight);
        }

    }
    public String toString()
    {
        return (super.toString() + "\n" +
                "ScreenSize: " + screenSize + "\n" +
                "Weight: " + weight);
    }
}
