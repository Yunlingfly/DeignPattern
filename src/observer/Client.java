package observer;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TeacherSubject teacher=new TeacherSubject();
        StudentObserver zhangSan=new StudentObserver("����", teacher);
        StudentObserver LiSi=new StudentObserver("����", teacher);
        StudentObserver WangWu=new StudentObserver("����", teacher);
        TeacherObserver WangWei=new TeacherObserver("���", teacher);
        
        teacher.setHomeWork("�ڶ�ҳ������");
        teacher.setHomeWork("����ҳ������");
        teacher.setHomeWork("����ҳ�ڰ���");
        teacher.nitifyObserver();
	}

}
