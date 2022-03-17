package tema1;

public class Bus extends Vehicle {
    private boolean noPassengers;
    private float ticketPrice;
    private int chargeCount = 15;

    public Bus(){
    }

    public Bus(boolean noPassengers, float ticketPrice){
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
        return "Bus{" +
                "noPassengers=" + noPassengers +
                ", ticketPrice=" + ticketPrice +
                ", chargeCount=" + chargeCount +
                '}';
    }
}
