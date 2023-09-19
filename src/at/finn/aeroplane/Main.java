package at.finn.aeroplane;

public class Main
{
    public static void main(String[] argv)
    {
        Engine engine = new Engine(4000,250,2000,1500,1500,"Finn");
        Wheel wheel1 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel2 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel3 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel4 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel5 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel6 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel7 = new Wheel(400,200,400,4,"Finn");
        Wheel wheel8 = new Wheel(400,200,400,4,"Finn");
        Airplane airplane = new Airplane(15000,10000,5000,40,8,"black","Finn",engine);
        airplane.addWheels(wheel1);
        airplane.addWheels(wheel2);
        airplane.addWheels(wheel3);
        airplane.addWheels(wheel4);
        PassengerPlane passengerPlane = new PassengerPlane(15000,10000,5000,150,8,"black","Finn more people",engine,"Innsbruck","Toronto");
        passengerPlane.addWheels(wheel5);
        passengerPlane.addWheels(wheel6);
        passengerPlane.addWheels(wheel7);
        passengerPlane.addWheels(wheel8);
        Hangar hangar = new Hangar(31324,651651,651651,1,"Innsbruck","Finn","black");
        hangar.open();
        airplane.start();
        airplane.keepHeight();
        airplane.land();
        passengerPlane.start();
        passengerPlane.keepHeight();
        passengerPlane.greetPassengers();
        passengerPlane.land();
        hangar.park();
        hangar.lock();
    }
}
