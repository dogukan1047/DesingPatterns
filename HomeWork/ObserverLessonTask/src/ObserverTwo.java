public class ObserverTwo implements Observer{

    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberTwo :: " + message.getMessageContent());
    }
}
