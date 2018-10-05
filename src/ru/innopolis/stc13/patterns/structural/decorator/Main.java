package decorator;

import decorator.decorator.WithCucumber;
import decorator.decorator.WithJalapeno;
import decorator.pizza.PizzaRussian;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new PizzaRussian();
        pizza = new WithCucumber(pizza);
        pizza = new WithJalapeno(pizza);
        pizza = new WithCucumber(pizza);

        System.out.println(pizza.getDescription() + " цена:" + pizza.cost());

    }
}
