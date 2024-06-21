package Template_Method.PaymentFlow;

public class MerchantPaymentFlow extends PaymentFlow {
    @Override
    public void calulatePaymentFees() {
        System.out.println("100 rc payment fees for Merchant :)");
        
    }

    @Override
    public void creditMoneyToReceiver() {
       System.out.println("Money is credited to Merchant");
        
    }

    @Override
    public void debitMoneyFromSender() {
        System.out.println("Dediting from your account to send to Merchant");
        
    }

    @Override
    public void validateRequest() {
        System.out.println("Validating for merchant");
        
    }

    //hook
    public void beforeValidate(){
        System.out.println("In beforeValidate for merchat");
    }
}
