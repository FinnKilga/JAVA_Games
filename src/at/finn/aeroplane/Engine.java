package at.finn.aeroplane;

public class Engine
{
    private int power,weight,height,length,width;
    private String manufacturer;
    private boolean onFire;

    public Engine(int power, int weight, int height, int length, int width, String manufacturer) {
        this.power = power;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.manufacturer = manufacturer;
    }

    public void start()
    {
        System.out.println("Engine started");
    }
    public void stop()
    {
        System.out.println("Engine stopped");
    }
    public void increasePower()
    {
        System.out.println("Power increased");
    }
}
