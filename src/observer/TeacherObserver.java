package observer;

public class TeacherObserver implements Observer{
	//����һ��Subject������,�Ժ����������ȡ������,����������û�ȽϷ���
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
		// TODO �Զ����ɵķ������
		System.out.println(name+"�ǲ�����ҵ����ʦ");
	}
	
}
