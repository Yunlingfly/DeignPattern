package singleton;

public class Singleton2 {
//	 ���߳�ͬ������ģʽ
	private static Singleton2 uniqueInstance2 = null;

//	 �������õ�ʵ������

//	 ���췽����˽�еģ����������ⲻ��new�����ʵ��
	private Singleton2() {
//		 ��ʼ������ʵ������
	}

//	 ʹ��java�ؼ��֣�synchronized
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance2 == null) {
			uniqueInstance2 = new Singleton2();
		}
		return uniqueInstance2;
	}
}
