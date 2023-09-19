package at.finn.aeroplane;

public class Hangar
{
    private int length,width,height,capacity;
    private String location,owner,color;

    public Hangar(int length, int width, int height, int capacity, String location, String owner, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.location = location;
        this.owner = owner;
        this.color = color;
    }
    public void park()
    {
        System.out.println("Airplane will be parked soon, have a coffee while you wait");
    }
    public void lock()
    {
        System.out.println("Hangar is now locked");
    }
    public void open()
    {
        System.out.println("Hangar is now open");
    }
}
