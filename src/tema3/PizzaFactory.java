package tema3;
import tema3.enums.PizzaType;
import tema3.enums.Topping;
import tema3.pizza.*;

public class PizzaFactory {
    private Observer observer;
    private Client client;
    private static PizzaFactory uniqueInstance;

    private PizzaFactory(){}

    public static PizzaFactory instance(){
        if(uniqueInstance == null){
            uniqueInstance = new PizzaFactory();
        }

        return uniqueInstance;
    }

    public void addClient(Client client){
        this.client = client;
        observer = new Observer(this.client.getSubject());
        this.client.getSubject().attachObserver(observer);
    }

    public Pizza createPizza(PizzaType type){
        switch(type){
            case CAPRICIOSA:
                client.sendOrder(type, client.getName());
                return new Capriciosa();
            case MARGUERITA:
                client.sendOrder(type, client.getName());
                return new Marguerita();
            case QUATRO_STAGIONI:
                client.sendOrder(type, client.getName());
                return new QuatroStagioni();
            case PROSCIUTTO_FUNGHI:
                client.sendOrder(type, client.getName());
                return new ProsciuttoFunghi();
        }
        return null;
    }
}

class PizzaDecorator extends Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}

class ToppingsDecorator extends PizzaDecorator{
    Topping topping;

    public ToppingsDecorator(Pizza pizza){
        super(pizza);
        this.topping = Topping.NO_TOPPING;
    }

    public ToppingsDecorator(Pizza pizza, Topping topping){
        super(pizza);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return pizza.getClass().getSimpleName() + "{" +
                "topping=" + topping +
                ", price=" + pizza.price +
                '}';
    }
}