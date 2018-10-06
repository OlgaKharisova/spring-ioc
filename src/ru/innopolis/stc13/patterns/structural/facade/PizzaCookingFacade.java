package ru.innopolis.stc13.patterns.structural.facade;

public class PizzaCookingFacade {
    public void cook(Dish dish) {
        OrderReceiver orderReceiver = new OrderReceiver();
        if (orderReceiver.acceptOrder(dish.getName())) {
            PizzaCooker pizzaCooker = new PizzaCooker();
            if (pizzaCooker.cookPizza(dish.getName())) {
                Delivery delivery = new Delivery();
                if (delivery.deliver()) {
                    System.out.println("This is your pizza");
                    return;
                }
            }
        }
        System.out.println("Have no pizza");
    }
}
