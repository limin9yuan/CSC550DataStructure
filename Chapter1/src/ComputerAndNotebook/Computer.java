package ComputerAndNotebook;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class Computer
{
    private String manufacturer;
    private String processor;
    private double ramSize;
    private double diskSize;
    private double processorSpeed;

    public Computer()
    {
        manufacturer = null;
        processor = null;
        ramSize = 0;
        diskSize = 0;
        processorSpeed = 0;
    }
    public Computer(String manufacturer, String processor, double ramSize,
                    double diskSize, double processorSpeed)
    {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }
    public Computer(Computer other)
    {
        manufacturer = other.manufacturer;
        processor = other.processor;
        ramSize = other.ramSize;
        diskSize = other.diskSize;
        processorSpeed = other.processorSpeed;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setProcessor(String processor)
    {
        this.processor = processor;
    }
    public String getProcessor()
    {
        return processor;
    }
    public void setRamSize(double ramSize)
    {
        this.ramSize = ramSize;
    }
    public double getRamSize()
    {
        return ramSize;
    }
    public void setDiskSize(double diskSize)
    {
        this.diskSize = diskSize;
    }
    public double getDiskSize()
    {
        return diskSize;
    }
    public void setProcessorSpeed(double processorSpeed)
    {
        this.processorSpeed = processorSpeed;
    }
    public double getProcessorSpeed()
    {
        return processorSpeed;
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        else
        {
            Computer newComputer = (Computer) other;
            return (manufacturer.equals(newComputer.manufacturer) &&
                    processor.equals(newComputer.processor) &&
                    ramSize == newComputer.ramSize &&
                    diskSize == newComputer.diskSize &&
                    processorSpeed == newComputer.processorSpeed);
        }
    }
    public String toString()
    {
        return ("Manufacturer: " + manufacturer + "\n" +
                "Processor: " + processor + "\n" +
                "RamSize: " + ramSize + "\n" +
                "DiskSize: " + diskSize + "\n" +
                "ProcessorSpeed: " + processorSpeed + "\n");
    }
}
