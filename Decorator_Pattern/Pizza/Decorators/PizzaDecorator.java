package Decorator_Pattern.Pizza.Decorators;

import Decorator_Pattern.Pizza.Component.Pizza;

public abstract class PizzaDecorator extends Pizza {
    public abstract int cost();
}
