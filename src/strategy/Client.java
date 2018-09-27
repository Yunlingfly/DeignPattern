package strategy;

public class Client {
	public static void main(String[] args){
		//选择并创建需要使用的策略对象
        MemberStrategy strategy = new OneLevelStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quto(300);
        System.out.println("图书的最终价格为：" + quote);
        strategy = new TweLevelStrategy();
        price = new Price(strategy);
        //计算价格
        quote = price.quto(300);
        System.out.println("图书的最终价格为：" + quote);
        strategy = new ThreeLevelStrategy();
        price = new Price(strategy);
        //计算价格
        quote = price.quto(300);
        System.out.println("图书的最终价格为：" + quote);
	}
}
