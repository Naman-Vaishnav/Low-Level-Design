package Bridge.MessagingSystem.Implementor;

public class SMSMessageSender implements IMessageSender {

    @Override
    public void SendMessage(String message) {
       System.out.println("Sending SMS..."+message);
    }

}
