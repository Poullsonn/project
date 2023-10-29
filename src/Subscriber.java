import java.util.List;
public class Subscriber implements IObserver {
    String name;

    public Subscriber(String name){
        this.name=name;
    }

    @Override
    public void handleEvent(List<String> events){
        System.out.print(name + " we have some changes in events: \n" +events +"\n......................................................\n\n");
    }
}
