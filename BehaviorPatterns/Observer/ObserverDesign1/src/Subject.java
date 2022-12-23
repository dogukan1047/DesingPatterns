import java.util.ArrayList;
import java.util.List;
//takip edilmesi gereken yapıdır
public class Subject {
    private List<Observer> observers=new ArrayList<Observer>();//observerlerın listesini tuttuk (abone olanlar)
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    //
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
