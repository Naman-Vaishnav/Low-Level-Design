package Factory.Simple;

import Factory.without.BOBCreditCard;
import Factory.without.HDFCCreditCard;
import Factory.without.ICreditCard;

public class CardFactory {
    public static ICreditCard getCreditCard(String bankName){
        ICreditCard creditCard=null;

        
        if(bankName.equals("HDFC"))creditCard=new HDFCCreditCard();
        else if(bankName.equals("BOB"))creditCard=new BOBCreditCard();

        //added new condition for new type will break Open/Close principle

        return creditCard;
    }
}
