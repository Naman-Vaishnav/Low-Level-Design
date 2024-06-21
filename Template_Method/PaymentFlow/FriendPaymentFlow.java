package Template_Method.PaymentFlow;

public class FriendPaymentFlow extends PaymentFlow {

    @Override
    public void calulatePaymentFees() {
        System.out.println("No payment fees for friends :)");
        
    }

    @Override
    public void creditMoneyToReceiver() {
       System.out.println("Money is credited to friend");
        
    }

    @Override
    public void debitMoneyFromSender() {
        System.out.println("Dediting from your account to send to friend");
        
    }

   
}
