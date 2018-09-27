package observer;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TeacherSubject teacher=new TeacherSubject();
        StudentObserver zhangSan=new StudentObserver("张三", teacher);
        StudentObserver LiSi=new StudentObserver("李四", teacher);
        StudentObserver WangWu=new StudentObserver("王五", teacher);
        TeacherObserver WangWei=new TeacherObserver("王炜", teacher);
        
        teacher.setHomeWork("第二页第六题");
        teacher.setHomeWork("第三页第七题");
        teacher.setHomeWork("第五页第八题");
        teacher.nitifyObserver();
	}

}
