package abstractFactory;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AbstractFactory a = new ConcreteFactory1(); // 商品A
		a.createProductA(); // a1
		a.createProductB(); // b1

		AbstractFactory b = new ConcreteFactory2(); // 商品B
		b.createProductA(); // a2
		b.createProductB(); // b2
	}

}
