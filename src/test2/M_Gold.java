package test2;

public class M_Gold implements MagicAttack{
	private int damages=10;		//�˺�ֵ
	public int getDamages() {
		return damages;
	}
	public void setDamages(int damages) {
		this.damages = damages;
	}
	
	@Override
	public String magic() {
		// TODO �Զ����ɵķ������
		return "ħ��-��ϵ����!"+"�����"+this.damages+"���˺�";
	}
	@Override
	public int damages() {
		// TODO �Զ����ɵķ������
		return this.getDamages();
	}
}
