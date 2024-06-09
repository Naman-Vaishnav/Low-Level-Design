package Observer_Pattern.Decorator_Pattern.Pizza.Decorators;

import Observer_Pattern.Decorator_Pattern.Pizza.Component.Pizza;

public class ChesseDecorator extends PizzaDecorator {
    Pizza pizza;

    public ChesseDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    public int cost(){
        return this.pizza.cost() + 20; //cost of extra chess
    }
}
