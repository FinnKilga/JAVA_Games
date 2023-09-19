package at.finn.aeroplane;

import java.util.ArrayList;
import java.util.List;

public class Airplane
{
    protected int length,width,height,maxSeats,weight;
    protected String color, name;

    protected Engine engine;
    protected List<Wheel> wheels;

    public Airplane(int length, int width, int height, int maxSeats, int weight, String color, String name, Engine engine) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.maxSeats = maxSeats;
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.engine = engine;
        this.wheels = new ArrayList<Wheel>();
    }
    public void start()
    {
        engine.start();
        System.out.println("Airplane started");
        for (Wheel wheel:wheels)
        {
            wheel.gearUp();
        }
    }
    public void keepHeight()
    {
        System.out.println("Airplane will keep height");
    }
    public void land()
    {
        for (Wheel wheel:wheels)
        {
            wheel.gearDown();
        }
        System.out.println("Airplane is about to Land");
        for (Wheel wheel:wheels)
        {
            wheel.setUsage();
        }
        System.out.println("Engine and plane will soon shut down");
        this.engine.stop();
    }

    public void addWheels(Wheel wheel)
    {
        this.wheels.add(wheel);
    }
}
