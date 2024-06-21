package Template_Method.PaymentFlow;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userType;
        userType=sc.nextLine();
        PaymentFlow paymentFlow=null;
        if(userType.toLowerCase().equals("friend")){
            paymentFlow=new FriendPaymentFlow();
            paymentFlow.sendMoney();
        }
        else if(userType.toLowerCase().equals("merchant")){
            paymentFlow=new MerchantPaymentFlow();
            paymentFlow.sendMoney();
        }
        else{
            System.out.println("Invalid user type");
        }
    }
}
