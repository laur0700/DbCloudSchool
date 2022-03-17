package tema1;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus(false, 2.14f);
        Bus b2 = new Bus(true, 1.56f);
        Taxi t1 = new Taxi(true, 3.12f);
        Taxi t2 = new Taxi(false, 1.99f);

        Vehicle[] vehicles = {b1,t2,b2,t1};

        BusStation busStation = new BusStation(vehicles);

        busStation.showAllVehicles();
        busStation.showTotalProfit();

        busStation.sortVehicles();
        busStation.showAllVehicles();
        busStation.showTotalProfit();
    }
}
