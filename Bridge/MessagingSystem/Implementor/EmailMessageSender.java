package Bridge.MessagingSystem.Implementor;

public class EmailMessageSender implements IMessageSender{

    @Override
    public void SendMessage(String message) {
       System.out.println("Sending Email..."+message);
    }

}
