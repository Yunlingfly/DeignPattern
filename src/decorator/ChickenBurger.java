package decorator;

public class ChickenBurger extends Humburger {
	// º¶Õ»±§¿‡
	public ChickenBurger() {
		name = "º¶Õ»±§";
	}

	@Override
	public double getPrice() {
		return 10;
	}

}