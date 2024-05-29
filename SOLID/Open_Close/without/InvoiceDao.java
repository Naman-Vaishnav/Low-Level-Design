package Single_Reponsibility.with;


public class InvoiceDao {
    public void saveToDB(){
        System.out.println("Saving to DB:(");
    }   

    //we want to new functionality
    public void saveToFile(){
        System.out.println("Saving to file");
    }
}
