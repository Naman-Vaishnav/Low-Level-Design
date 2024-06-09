package Observer_Pattern.Decorator_Pattern.Pizza;

import Observer_Pattern.Decorator_Pattern.Pizza.Component.MargheritaPizza;
import Observer_Pattern.Decorator_Pattern.Pizza.Component.Pizza;
import Observer_Pattern.Decorator_Pattern.Pizza.Decorators.ChesseDecorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza1=new MargheritaPizza();
        pizza1=new ChesseDecorator(pizza1);

        System.out.println(pizza1.cost()); //520
    }
}
