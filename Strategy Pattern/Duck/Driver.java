import Strategies.FlyStrategies.ConcreteClasses.JetFlying;
import Strategies.QuankStrategies.ConcreateClasses.NormaQuanking;
import TypesOfDuck.Duck;
import TypesOfDuck.WildDuck;

public class Driver {
    public static void main(String[] args) {
        /* Passing strategy direcly

        Duck duck=new Duck(new JetFlying(),new NormaQuanking() );
        duck.fly(); //I fly at Jet speed...
        duck.quank();//Normal quank
        
        */

        /*Using  Subclasses */
        WildDuck wildDuck=new WildDuck();
        wildDuck.fly(); //I fly at Jet speed...
        wildDuck.quank();// Normal quank

    }
}
