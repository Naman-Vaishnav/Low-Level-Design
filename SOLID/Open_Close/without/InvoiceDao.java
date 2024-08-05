package Open_Close.without;


public class InvoiceDao {
    public void saveToDB(){
        System.out.println("Saving to DB:(");
    }   

    //we want to add new functionality
    public void saveToFile(){
        System.out.println("Saving to file");
    }
}
