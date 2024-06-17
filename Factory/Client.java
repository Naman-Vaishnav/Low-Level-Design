package Factory;

import java.util.Scanner;

import Factory.Factory_Method.BOBCardFactory;
import Factory.Factory_Method.HDFCCardFactory;
import Factory.Simple.CardFactory;
import Factory.without.BOBCreditCard;
import Factory.without.HDFCCreditCard;
import Factory.without.ICreditCard;

public class Client {
    public static void main(String[] args) {
        String bankName;
        Scanner sc=new Scanner(System.in);
        bankName=sc.nextLine();

        ICreditCard creditCard=null;

        /* 
        //without factory pattern 
        if(bankName.equals("HDFC"))creditCard=new HDFCCreditCard();
        else if(bankName.equals("BOB"))creditCard=new BOBCreditCard();

        System.out.println( "Card type:"+creditCard.getCardType());
        

        //simple factory pattern 
        creditCard=CardFactory.getCreditCard(bankName);
        System.out.println( "Card type:"+creditCard.getCardType());
        */

        //factory method pattern
        if(bankName.equals("HDFC"))creditCard=new HDFCCardFactory().createProduct();
        else if(bankName.equals("BOB"))creditCard=new BOBCardFactory().createProduct();
        System.out.println( "Card type:"+creditCard.getCardType());

      


    }
}
