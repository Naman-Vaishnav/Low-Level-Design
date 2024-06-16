package Bridge.MessagingSystem.Abstraction;

import Bridge.MessagingSystem.Implementor.IMessageSender;

public class ShortMessage extends AbstractMessage {
    
    public ShortMessage(IMessageSender messageSender){
        super(messageSender);
        
    }

    
}
