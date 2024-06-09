package Observer_Pattern.Decorator_Pattern.Pizza.Decorators;

import Observer_Pattern.Decorator_Pattern.Pizza.Component.Pizza;

public abstract class PizzaDecorator extends Pizza {
    public abstract int cost();
}
