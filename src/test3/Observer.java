package test3;

public class Observer implements IObserver {
	
    @Override
    public void refresh(ISubject obj) {
        // TODO Auto-generated method stub
        Subject subject = (Subject)obj;
        MainFrame.jta.append(subject.getInfo());
//        System.out.println("�������ڸ���Ϊ:"+subject.getInfo().substring(0, 7));
    }
}