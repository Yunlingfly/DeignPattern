package test6;

public class Test {

	public Test() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Singleton1 s1=Singleton1.getInstance();
		s1.setName("zzy");
		s1.setPassword("123");
		System.out.println(s1.getName());
		Singleton1 s2=Singleton1.getInstance();
		System.out.println(s2.getName());
		
	}

}
