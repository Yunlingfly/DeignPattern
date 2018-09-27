package test4;

public class Beef extends Condiment {
	private MiXian mi;
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Beef(MiXian mi,int num) {
		this.mi=mi;
		setNum(num);
	}
	@Override
	public String getName() {
		return mi.getName()+" Å£Èâ*"+String.valueOf(getNum());
	}

	@Override
	public int getPrice() {
		return mi.getPrice()+2*getNum();	//¼Ó¼Û2Ôª
	}

}
