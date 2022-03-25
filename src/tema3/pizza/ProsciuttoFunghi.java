package tema3.pizza;

public class ProsciuttoFunghi extends Pizza{
    public ProsciuttoFunghi(){
        this.price = 32.12;
    }

    @Override
    public String toString() {
        return "ProsciuttoFunghi{" +
                "price=" + this.price +
                '}';
    }
}
