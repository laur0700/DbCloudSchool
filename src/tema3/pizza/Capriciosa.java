package tema3.pizza;

public class Capriciosa extends Pizza{
    public Capriciosa(){
        this.price = 31.89;
    }

    @Override
    public String toString() {
        return "Capriciosa{" +
                "price=" + this.price +
                '}';
    }
}
