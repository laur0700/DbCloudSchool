package tema3;

import tema3.enums.PizzaType;
import tema3.enums.Topping;
import tema3.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = PizzaFactory.instance();
        pizzaFactory.addClient(new Client("Laurentiu"));

        Pizza pizzaCapriciosa = pizzaFactory.createPizza(PizzaType.CAPRICIOSA);
        System.out.println(pizzaCapriciosa);

        Pizza pizzaCapriciosaTopping = new ToppingsDecorator(pizzaCapriciosa, Topping.TOMATOES);
        System.out.println(pizzaCapriciosaTopping);
        System.out.println("\n");

        Pizza pizzaMarguerita = pizzaFactory.createPizza(PizzaType.MARGUERITA);
        System.out.println(pizzaMarguerita);

        Pizza pizzaMargueritaTopping = new ToppingsDecorator(pizzaMarguerita, Topping.CHEESE);
        System.out.println(pizzaMargueritaTopping);
        System.out.println("\n");

        Pizza pizzaQuatroStagioni = new ToppingsDecorator(pizzaFactory.createPizza(PizzaType.QUATRO_STAGIONI));
        System.out.println(pizzaQuatroStagioni);
        System.out.println("\n");

        Pizza pizzaProsciuttoFunghi = new ToppingsDecorator(pizzaFactory.createPizza(PizzaType.PROSCIUTTO_FUNGHI), Topping.PROSCIUTTO);
        System.out.println(pizzaProsciuttoFunghi);
    }
}
