package strategy;

public class ThreeLevelStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO �Զ����ɵķ������
		System.out.println("���Ǹ߼���Ա���ۿ�20%");
		return bookPrice*0.8;
	}

}
