package test3;

public interface ISubject{
    //注册观察者
    public void register(IObserver obs);
    //撤销观察者
    public void unregister(IObserver obs);
    //通知所有观察者及进行数据响应
    public void notifyObservers();

}