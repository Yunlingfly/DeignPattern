package test2;

public class Wanjia extends Persona{		//ͨ�õ������
	
	@Override
	public void start() {
		// TODO �Զ����ɵķ������
		int num=0;
		magicAttack=new M_Water();
		physicalAttack=new P_Hand();
		buddhistMonk=new BuddhistMonk(num);			//��ʼ��һ�κ��б���
		chivalrousLady=new ChivalrousLady(num);		//��ʼ��һ��Ů������
		ninja=new Ninja(num);						//��ʼ��һ�����߱���
		System.out.println("��Ϸ�ٴο�ʼ");
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
