package Factory.Factory_Method;

import Factory.without.BOBCreditCard;
import Factory.without.ICreditCard;

public class BOBCardFactory extends CardFactory {

    public ICreditCard createProduct(){
        return new BOBCreditCard();
    }

}
