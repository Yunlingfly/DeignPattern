package abstractFactory;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		AbstractFactory a = new ConcreteFactory1(); // ��ƷA
		a.createProductA(); // a1
		a.createProductB(); // b1

		AbstractFactory b = new ConcreteFactory2(); // ��ƷB
		b.createProductA(); // a2
		b.createProductB(); // b2
	}

}
