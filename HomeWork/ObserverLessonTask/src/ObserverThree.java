public class ObserverThree implements Observer{


    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberThree :: " + message.getMessageContent());
    }
}
