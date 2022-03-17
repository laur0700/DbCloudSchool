package tema1;

public class Bus extends Vehicle {
    private int noPassengers;
    private float ticketPrice;

    public Bus(){
    }

    public Bus(int noPassengers, float ticketPrice, String colour, boolean functional){
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
        this.setColour(colour);
        this.setFunctional(functional);
    }

    @Override
    public void charge() {
        noPassengers++;
    }

    @Override
    public float profit() {
        return (ticketPrice * noPassengers) / 4;
    }

    @Override
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "noPassengers=" + noPassengers +
                ", ticketPrice=" + ticketPrice +
                ", colour=" + getColour() +
                ", functional=" + getFunctional() +
                '}';
    }
}
