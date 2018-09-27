package test4;

public class Eggs extends Condiment {
	private MiXian mi;
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Eggs(MiXian mi,int num){
		this.mi=mi;
		setNum(num);
	}
	@Override
	public String getName() {
		return mi.getName()+" ¼¦µ°*"+String.valueOf(getNum());
	}

	@Override
	public int getPrice() {
		return mi.getPrice()+1*getNum();	//¼Ó¼Û1Ôª
	}

}
