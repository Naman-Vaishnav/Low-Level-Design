package Factory.Factory_Method;

import Factory.without.ICreditCard;

abstract public class CardFactory {
    
   /* public ICreditCard makeProduct(){
        ICreditCard creditCard=this.createProduct();
        return creditCard;
    }*/ 

    abstract public ICreditCard createProduct();

}
