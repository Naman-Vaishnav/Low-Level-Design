package Factory.without;

public class BOBCreditCard implements ICreditCard {

    @Override
    public int getCardCharges() {
        
        return 10;
    }

    @Override
    public int getCardLimit() {
        // TODO Auto-generated method stub
        return 1110;
    }

    @Override
    public String getCardType() {    
        return "BOB";
    }

}
