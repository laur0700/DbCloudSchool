package tema1;

public abstract class Vehicle implements Comparable<Vehicle>{
    private String colour;
    private boolean functional;

    public Vehicle() {
    }

    public Vehicle(String colour, boolean functional){
        this.colour = colour;
        this.functional = functional;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setFunctional(boolean functional){
        this.functional = functional;
    }

    public String getColour(){
        return this.colour;
    }

    public boolean getFunctional(){
        return this.functional;
    }

    public int compareTo(Vehicle o){
        if(this.profit() == o.profit())
            return 0;
        else if(this.profit() > o.profit())
            return 1;
        else
            return -1;
    }

    public abstract void charge();
    public abstract float profit();
    public abstract void display();
}
