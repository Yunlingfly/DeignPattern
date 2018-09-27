package singleton;

public class Singleton2 {
//	 多线程同步单例模式
	private static Singleton2 uniqueInstance2 = null;

//	 其他有用的实例变量

//	 构造方法是私有的，所以在类外不能new出多个实例
	private Singleton2() {
//		 初始化其他实例变量
	}

//	 使用java关键字：synchronized
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance2 == null) {
			uniqueInstance2 = new Singleton2();
		}
		return uniqueInstance2;
	}
}
