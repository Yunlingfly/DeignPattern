package test2;

public class Boss {			//π÷ŒÔBoss¿‡
	private String name="Boss";
	private int hp=1000;
	private int mp=100;
	private int sp=20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public String ToString(int num){
		return String.valueOf(num);
	}
}
