package TypesOfDuck;

import Strategies.FlyStrategies.ConcreteClasses.JetFlying;
import Strategies.QuankStrategies.ConcreateClasses.NormaQuanking;

public class WildDuck extends Duck {
    public WildDuck(){
        super(new JetFlying(),new NormaQuanking());
    }

}
