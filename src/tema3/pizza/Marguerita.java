package tema3.pizza;

public class Marguerita extends Pizza{
    public Marguerita(){
        this.price = 25.98;
    }

    @Override
    public String toString() {
        return "Marguerita{" +
                "price=" + this.price +
                '}';
    }
}
