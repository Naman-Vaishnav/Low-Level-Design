package Template_Method.PaymentFlow;

//base class
abstract public class PaymentFlow {
    //template method
    public final void sendMoney(){

        checkConnection();
        beforeValidate();
        validateRequest();

        debitMoneyFromSender();

        calulatePaymentFees();

        creditMoneyToReceiver();
    }

    //primitive methods
    public abstract void debitMoneyFromSender();
    public abstract void calulatePaymentFees();
    public abstract void creditMoneyToReceiver();

    public void checkConnection(){
        System.out.println("In base class checking the connection...");
    }


    //hooks
    public void beforeValidate(){
       //empty body
    }

    //defaut/common methods

    public  void validateRequest(){
        System.out.println("Validting the request");
    }



}
