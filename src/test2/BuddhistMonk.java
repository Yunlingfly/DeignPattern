package test2;

public class BuddhistMonk extends Persona{		//和尚角色
	private String name="和尚";
	private String face="俊朗";
	private int hp=90;
	private int mp=10;
	
	public BuddhistMonk(String name) {
		if(name.equals("M_Fire")) magicAttack=new M_Fire();
		else if(name.equals("M_Gold")) magicAttack=new M_Gold();
		else if(name.equals("M_Water")) magicAttack=new M_Water();
		else if(name.equals("P_Knife")) physicalAttack=new P_Knife();
		else if(name.equals("P_Sword")) physicalAttack=new P_Sword();
		else if(name.equals("P_Hand")) physicalAttack=new P_Hand();
	}
	public BuddhistMonk(int k){
	}
	@Override
	public void start() {
		// TODO 自动生成的方法存根
		int num=0;
		magicAttack=new M_Water();
		physicalAttack=new P_Hand();
		
		buddhistMonk=new BuddhistMonk(num);			//初始化一次和尚变量
		chivalrousLady=new ChivalrousLady(num);		//初始化一次女侠变量
		ninja=new Ninja(num);						//初始化一次忍者变量
		System.out.println("游戏开始，你选择了和尚");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
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
	public String ToString(int num){
		return String.valueOf(num);
	}
}
