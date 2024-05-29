package Interface_Segmented.without;

/**
 * waiter
 */

public class waiter implements RestaurantInterface {
  public  void serveFood(){
    System.out.println("Serving food..");
   }
   public void washDishes(){
      //unnecessary method override
   }
   public void takeOrder(){
      System.out.println("Taking food..");
   }
    
}