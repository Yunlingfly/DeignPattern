package decorator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger();
		System.out.println(humburger.getName() + "  송풀：" + humburger.getPrice());
		
		Lettuce lettuce = new Lettuce(humburger);
		System.out.println(lettuce.getName() + "  송풀：" + lettuce.getPrice());
		
		Chilli chilli = new Chilli(humburger);
		System.out.println(chilli.getName() + "  송풀：" + chilli.getPrice());
		
		Chilli chilli2 = new Chilli(lettuce);
		System.out.println(chilli2.getName() + "  송풀：" + chilli2.getPrice());
	}

}