package Strategies.FlyStrategies.ConcreteClasses;

import Strategies.FlyStrategies.Interface.FlyStrategy;

public class NormalFlying implements FlyStrategy {
    public void fly(){
        System.out.println("I fly normal.I don't linke speed");
    };
}
