package TypesOfDuck;
import Strategies.FlyStrategies.Interface.FlyStrategy;
import Strategies.QuankStrategies.Interface.QuackStrategy;


public class Duck {

    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

    Duck(){}
    public Duck(FlyStrategy flyStrategy,QuackStrategy quackStrategy){
        this.flyStrategy=flyStrategy;
        this.quackStrategy=quackStrategy;
    }

   public void fly(){
        this.flyStrategy.fly();
    }

    public void quank(){
       this.quackStrategy.quank();
    }


}
