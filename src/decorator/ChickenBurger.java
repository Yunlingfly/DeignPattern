package decorator;

public class ChickenBurger extends Humburger {
	// ���ȱ���
	public ChickenBurger() {
		name = "���ȱ�";
	}

	@Override
	public double getPrice() {
		return 10;
	}

}