package strategy;

public class TweLevelStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double bookPrice) {
		// TODO �Զ����ɵķ������
		System.out.println("�����м���Ա���ۿ�10%");
		return bookPrice*0.9;
	}

}
