package test4;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MiXian mi=new ShuiMi();	//水米线
		System.out.println("你点了水米线 "+" 价钱为："+mi.getPrice());
		Eggs egg=new Eggs(mi,1);
		System.out.println(egg.getName()+" 现在的价钱为："+egg.getPrice());
		Tofu tofu=new Tofu(egg,1);
		System.out.println(tofu.getName()+" 现在的价钱为："+tofu.getPrice());
	}

}
