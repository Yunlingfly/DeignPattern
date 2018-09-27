package test4;

public class Tofu extends Condiment {
	private MiXian mi;
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Tofu(MiXian mi,int num){
		this.mi=mi;
		setNum(num);
	}
	@Override
	public String getName() {
		return mi.getName()+" 豆腐*"+String.valueOf(getNum());
	}

	@Override
	public int getPrice() {
		return mi.getPrice()+1*getNum();	//加价（1*个数）元
	}

}
