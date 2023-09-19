package at.finn.aeroplane;

public class Wheel
{
    private int length, width, height, weight, usage;
    private boolean gearUp;
    private String manufacturer;

    public Wheel(int length, int width, int height, int weight, String manufacturer) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.gearUp = false;
        this.usage = 0;
    }
    public void gearUp()
    {
        this.gearUp = true;
        System.out.println("Gear is up");
    }
    public void gearDown()
    {
        this.gearUp = false;
        System.out.println("Gear is down");
    }

    public void setUsage()
    {
        this.usage += 10;
        System.out.println((100 - this.usage)/10 + " more landings possible");
    }
}
