package TypesOfDuck;

import Strategies.FlyStrategies.ConcreteClasses.NormalFlying;
import Strategies.QuankStrategies.ConcreateClasses.LoudQuanking;

public class CityDuck extends Duck {
    public CityDuck(){
        super(new NormalFlying(),new LoudQuanking());
    }
}
