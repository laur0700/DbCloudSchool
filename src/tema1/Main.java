package tema1;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus(15, 2.14f, "white", true);
        Bus b2 = new Bus(23, 1.56f, "blue", true);
        Taxi t1 = new Taxi(12, 3.12f, "yellow", true);
        Taxi t2 = new Taxi(0, 1.99f, "black", false);

        Vehicle[] vehicles = {b1,t2,b2,t1};

        BusStation busStation = new BusStation(vehicles);

        busStation.showAllVehicles();
        busStation.showTotalProfit();

        busStation.sortVehicles();
        busStation.showAllVehicles();
        busStation.showTotalProfit();
    }
}
