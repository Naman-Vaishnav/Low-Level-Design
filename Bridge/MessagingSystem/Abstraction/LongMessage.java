package Bridge.MessagingSystem.Abstraction;

import Bridge.MessagingSystem.Implementor.IMessageSender;

public class LongMessage extends AbstractMessage {
    
    public LongMessage(IMessageSender messageSender){
        super(messageSender);
    }

  

}
