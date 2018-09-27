package singleton;

public class Singleton {
//	 �ӳ�ʵ��������ģʽ
	private static Singleton uniqueInstance = null;

//	 �������õ�ʵ������

//	 ���췽����˽�еģ����������ⲻ��new�����ʵ��
	private Singleton() {
//		 ��ʼ������ʵ������
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}