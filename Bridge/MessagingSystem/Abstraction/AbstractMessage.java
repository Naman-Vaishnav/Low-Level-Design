package Bridge.MessagingSystem.Abstraction;

import Bridge.MessagingSystem.Implementor.IMessageSender;

abstract public class AbstractMessage {
    IMessageSender messageSender;
    //String message;
     public AbstractMessage(IMessageSender messageSender){
        this.messageSender=messageSender;
    }

     public void  SendMessage(String message){
        messageSender.SendMessage(message);
     }
}
