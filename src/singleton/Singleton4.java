package singleton;

public class Singleton4 {
//	 双重加锁
	private volatile static Singleton4 uniqueInstance = null;
//	 其他

	private Singleton4() {
//		 其他
	}

	public static Singleton4 getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton4.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton4();
				}

			}
		}
		return uniqueInstance;
	}
}
