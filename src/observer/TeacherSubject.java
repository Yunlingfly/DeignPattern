package observer;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject {
	private List<Observer> observers=new ArrayList<Observer>();
	private List<String> info=new ArrayList<String>();
	 
	@Override
	public void addObserver(Observer o) {
		// TODO 自动生成的方法存根
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO 自动生成的方法存根
		int i = observers.indexOf(o);
        if(i>=0) observers.remove(o);
	}

	@Override
	public void nitifyObserver() {
		// TODO 自动生成的方法存根
		for(int i=0;i<observers.size();i++){
            Observer o=(Observer)observers.get(i);
            for (String str : info) {
            	o.update(str);
            	if(o instanceof TeacherObserver) break;
			}

        }
	}
	public void setHomeWork(String info){
		this.info.add(info);
//		System.out.println("今天的家庭作业是"+info);
//		this.nitifyObserver();
	}

}
