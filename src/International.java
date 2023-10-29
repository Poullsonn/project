import java.util.ArrayList;
import java.util.List;
public class International implements IObserved {
    List<String> events = new ArrayList<>();

    List<IObserver> subscribers = new ArrayList<>();

    public void addEvents(String events){
        this.events.add(events);
        notifyObservers();
    }

    public void removeEvents(String events){
        this.events.remove(events);
        notifyObservers();
    }
    @Override
    public void addObserver(IObserver observer){
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer){
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(IObserver observer: subscribers){
            observer.handleEvent(this.events);
        }
    }

}
