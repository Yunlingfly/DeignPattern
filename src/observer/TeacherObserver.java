package observer;

public class TeacherObserver implements Observer{
	//保存一个Subject的引用,以后如果可以想取消订阅,有了这个引用会比较方便
    @SuppressWarnings("unused")
	private TeacherSubject t;
    private String name;
    public TeacherObserver(String name,TeacherSubject t){
    	this.name=name;
    	this.t=t;
    	t.addObserver(this);
    }
	@Override
	public void update(String info) {
		// TODO 自动生成的方法存根
		System.out.println(name+"是布置作业的老师");
	}
	
}
