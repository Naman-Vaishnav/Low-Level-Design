package Strategies.FlyStrategies.ConcreteClasses;

import Strategies.FlyStrategies.Interface.FlyStrategy;

//Concrete Strategies
public class JetFlying implements FlyStrategy {
       public void fly(){
            System.out.println("I fly at Jet speed...");
       };
}
