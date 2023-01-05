public class Main {
    public static void main(String[] args) {
      ObserverOne observerOne=new ObserverOne();
      ObserverTwo observerTwo=new ObserverTwo();
      ObserverThree observerThree=new ObserverThree();



      MessagePublisher messagePublisher=new MessagePublisher();

      messagePublisher.attach(observerOne);
      messagePublisher.attach(observerTwo);

      messagePublisher.NnotifyUpdate(new Message("first message"));


      messagePublisher.detach(observerOne);
      messagePublisher.attach(observerThree);

      messagePublisher.NnotifyUpdate(new Message("second message"));
    }
}