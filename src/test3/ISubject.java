package test3;

public interface ISubject{
    //ע��۲���
    public void register(IObserver obs);
    //�����۲���
    public void unregister(IObserver obs);
    //֪ͨ���й۲��߼�����������Ӧ
    public void notifyObservers();

}