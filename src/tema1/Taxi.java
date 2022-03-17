package tema1;

public class Taxi extends Vehicle{
    private boolean noPassengers;
    private float ticketPrice;
    private int chargeCount = 23;

    public Taxi(){
    }

    public Taxi(boolean noPassengers, float ticketPrice){
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;

        if(noPassengers == true)
            this.chargeCount = 0;
    }

    @Override
    public void charge() {
        chargeCount++;
    }

    @Override
    public float profit() {
        return (ticketPrice * chargeCount) / 4;
    }

    @Override
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "noPassengers=" + noPassengers +
                ", ticketPrice=" + ticketPrice +
                ", chargeCount=" + chargeCount +
                '}';
    }
}
