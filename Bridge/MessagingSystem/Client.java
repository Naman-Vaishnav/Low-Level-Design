package Bridge.MessagingSystem;

import Bridge.MessagingSystem.Abstraction.AbstractMessage;
import Bridge.MessagingSystem.Abstraction.LongMessage;
import Bridge.MessagingSystem.Abstraction.ShortMessage;
import Bridge.MessagingSystem.Implementor.EmailMessageSender;
import Bridge.MessagingSystem.Implementor.IMessageSender;
import Bridge.MessagingSystem.Implementor.SMSMessageSender;

public class Client {
    public static void main(String[] args) {
        String longMessage="Long Message....";
        String shortMessage="Short Message...";

        AbstractMessage message;
        IMessageSender messageSender;

        messageSender=new EmailMessageSender();
        message=new LongMessage(messageSender);
        message.SendMessage(longMessage);

        messageSender=new SMSMessageSender();
        message=new ShortMessage(messageSender);
        message.SendMessage(shortMessage);

    }
    
   




}
