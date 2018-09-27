package test3;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IObserver obs = new Observer();
        Subject subject = new Subject();
        subject.register(obs);
        subject.setInfo("one");
        subject.notifyObservers();
    }
}