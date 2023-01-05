import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    //somut sınıf takip edenlerin listesinin olacağı yer

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void NnotifyUpdate(Message m) {
        for (Observer observer : observers
        ) {
            observer.update(m);

        }
    }
}
