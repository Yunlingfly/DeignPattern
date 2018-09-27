package test3;

public interface IObserver{
    //传入的参数对象可以间接获取变化后的主题数据
    public void refresh(ISubject subject);

}
