package Factory.without;

public class HDFCCreditCard implements ICreditCard{

    @Override
    public int getCardCharges() {
        
        return 10;
    }

    @Override
    public int getCardLimit() {
        
        return 10000;
    }

    @Override
    public String getCardType() {
        return "HDFC";
    }

}
