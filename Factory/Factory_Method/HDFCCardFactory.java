package Factory.Factory_Method;

import Factory.without.HDFCCreditCard;
import Factory.without.ICreditCard;

public class HDFCCardFactory extends CardFactory{
    public ICreditCard createProduct(){
        return new HDFCCreditCard();
    }
}
