package strategy;

public class Client {
	public static void main(String[] args){
		//ѡ�񲢴�����Ҫʹ�õĲ��Զ���
        MemberStrategy strategy = new OneLevelStrategy();
        //��������
        Price price = new Price(strategy);
        //����۸�
        double quote = price.quto(300);
        System.out.println("ͼ������ռ۸�Ϊ��" + quote);
        strategy = new TweLevelStrategy();
        price = new Price(strategy);
        //����۸�
        quote = price.quto(300);
        System.out.println("ͼ������ռ۸�Ϊ��" + quote);
        strategy = new ThreeLevelStrategy();
        price = new Price(strategy);
        //����۸�
        quote = price.quto(300);
        System.out.println("ͼ������ռ۸�Ϊ��" + quote);
	}
}
