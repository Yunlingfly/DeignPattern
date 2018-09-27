package singleton;

public class Singleton {
//	 延迟实例化单例模式
	private static Singleton uniqueInstance = null;

//	 其他有用的实例变量

//	 构造方法是私有的，所以在类外不能new出多个实例
	private Singleton() {
//		 初始化其他实例变量
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}