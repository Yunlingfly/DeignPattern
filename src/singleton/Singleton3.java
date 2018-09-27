package singleton;

public class Singleton3
{
//	急切实例化
	private static Singleton3 uniqueInstance = new Singleton3();
	private Singleton3()
	{
		//其他
	}
         //在JVM加载该类时已经创建此唯一的单件实例
	public static  Singleton3 getInstance()
	{
		return uniqueInstance;
	}
}
