package test2;

public class BuddhistMonk extends Persona{		//���н�ɫ
	private String name="����";
	private String face="����";
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
		// TODO �Զ����ɵķ������
		int num=0;
		magicAttack=new M_Water();
		physicalAttack=new P_Hand();
		
		buddhistMonk=new BuddhistMonk(num);			//��ʼ��һ�κ��б���
		chivalrousLady=new ChivalrousLady(num);		//��ʼ��һ��Ů������
		ninja=new Ninja(num);						//��ʼ��һ�����߱���
		System.out.println("��Ϸ��ʼ����ѡ���˺���");
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