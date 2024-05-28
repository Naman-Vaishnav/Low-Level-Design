package Single_Reponsibility.without;

import Single_Reponsibility.Marker;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int calculateTotal(){
        int total=marker.price*this.quantity;
        return total;
    }

    public void printInvoice(){
        System.out.println("Printing the Invoice :)");
    }

    public void saveToDB(){
        System.out.println("Saving to DB:(");
    }
}
