package test2;

public class Wanjia extends Persona{		//通用的玩家类
	
	@Override
	public void start() {
		// TODO 自动生成的方法存根
		int num=0;
		magicAttack=new M_Water();
		physicalAttack=new P_Hand();
		buddhistMonk=new BuddhistMonk(num);			//初始化一次和尚变量
		chivalrousLady=new ChivalrousLady(num);		//初始化一次女侠变量
		ninja=new Ninja(num);						//初始化一次忍者变量
		System.out.println("游戏再次开始");
	}
	public Wanjia(String name,Persona persona) {
		if(name.equals("M_Fire")) persona.magicAttack=new M_Fire();
		else if(name.equals("M_Gold")) persona.magicAttack=new M_Gold();
		else if(name.equals("M_Water")) persona.magicAttack=new M_Water();
		else if(name.equals("P_Knife")) persona.physicalAttack=new P_Knife();
		else if(name.equals("P_Sword")) persona.physicalAttack=new P_Sword();
		else if(name.equals("P_Hand")) persona.physicalAttack=new P_Hand();
	}
	public Wanjia(int num) {
	}
}
