package tema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusStation {
    private List<Vehicle> vehicles = new ArrayList<>();

    public BusStation(){
    }

    public BusStation(Vehicle[] vehicles){
        for(Vehicle v : vehicles){
            this.vehicles.add(v);
        }
    }

    public void showAllVehicles(){
        for(Vehicle v : vehicles){
            v.display();
        }
    }

    public void showTotalProfit(){
        float totalProfit = 0;

        for(Vehicle v : vehicles){
            totalProfit += v.profit();
        }

        System.out.println(totalProfit + "\n");
    }

    public void sortVehicles(){
        Collections.sort(vehicles);
    }
}
