package tema3.pizza;

public class QuatroStagioni extends Pizza{
    public QuatroStagioni(){
        this.price = 36.80;
    }

    @Override
    public String toString() {
        return "QuatroStagioni{" +
                "price=" + this.price +
                '}';
    }
}
