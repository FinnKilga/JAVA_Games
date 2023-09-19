package at.finn.aeroplane;

public class PassengerPlane extends Airplane{
    private String startLocation,Destination;
    private boolean onTime;

    public PassengerPlane(int length, int width, int height, int maxSeats, int weight, String color, String name, Engine engine, String startLocation, String destination) {
        super(length, width, height, maxSeats, weight, color, name, engine);
        this.startLocation = startLocation;
        Destination = destination;
        if ((int)(Math.random()*100) % 2 == 0)
        {
            this.onTime = true;
        }
        else
        {
            this.onTime = false;
        }

    }

    public void autopilot()
    {
        System.out.println("Passenger plane is now on autopilot");
    }
    public void greetPassengers()
    {
        System.out.println("Hello and welcome to " + this.name + ". We are on the way from " + this.startLocation + " to " + this.Destination);
        String onTime;
        if (this.onTime)
        {
            onTime = "on time";
        }
        else
        {
            onTime = "not on time";
        }
        System.out.println("We are currently " + onTime);
    }
}
