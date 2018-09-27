package strategy;

public class TweLevelStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO 自动生成的方法存根
		System.out.println("这是中级会员的折扣10%");
		return bookPrice*0.9;
	}

}
