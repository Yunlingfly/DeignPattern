package test2;

public class P_Knife implements PhysicalAttack{
	private int damages=10;		//�˺�ֵ
	public int getDamages() {
		return damages;
	}
	public void setDamages(int damages) {
		this.damages = damages;
	}
	@Override
	public String physical() {
		// TODO �Զ����ɵķ������
		return "����-������!"+"�����"+this.damages+"���˺�";
	}
	@Override
	public int damages() {
		// TODO �Զ����ɵķ������
		return this.getDamages();
	}

}
