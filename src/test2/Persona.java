package test2;

public abstract class Persona {		//��ɫ��
	MagicAttack magicAttack;
	PhysicalAttack physicalAttack;
	
	BuddhistMonk buddhistMonk;
	ChivalrousLady chivalrousLady;
	Ninja ninja;
	Wanjia wanjia;
	public Persona(){	//���췽��
	}
	
	public abstract void start();	//��ʼ��Ϸ
	
	public String magic(){
		return magicAttack.magic();
	}
	
	public String physical(){
		return physicalAttack.physical();
	}

	public MagicAttack getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(MagicAttack magicAttack) {
		this.magicAttack = magicAttack;
	}

	public PhysicalAttack getPhysicalAttack() {
		return physicalAttack;
	}

	public void setPhysicalAttack(PhysicalAttack physicalAttack) {
		this.physicalAttack = physicalAttack;
	}
	
}
