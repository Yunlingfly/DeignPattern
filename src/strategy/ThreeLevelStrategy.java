package strategy;

public class ThreeLevelStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO 自动生成的方法存根
		System.out.println("这是高级会员的折扣20%");
		return bookPrice*0.8;
	}

}
