package singleton;

public class Singleton3
{
//	����ʵ����
	private static Singleton3 uniqueInstance = new Singleton3();
	private Singleton3()
	{
		//����
	}
         //��JVM���ظ���ʱ�Ѿ�������Ψһ�ĵ���ʵ��
	public static  Singleton3 getInstance()
	{
		return uniqueInstance;
	}
}
