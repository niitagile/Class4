package DesignPattern.behavrioul;
import java.util.ArrayList;
import java.util.List;

class Subject {

    private List<ObserverCode> observers = new ArrayList<ObserverCode>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(ObserverCode observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (ObserverCode observer : observers) {
            observer.update();
        }
    }
}
abstract class ObserverCode {
    protected Subject subject;
    public abstract void update();
}
 class BinaryObserver extends ObserverCode{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
class OctalObserver extends ObserverCode{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
class HexaObserver extends ObserverCode{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

public class ObserverExample1 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
