package test2;

public class P_Sword implements PhysicalAttack{
	private int damages=10;		//伤害值
	public int getDamages() {
		return damages;
	}
	public void setDamages(int damages) {
		this.damages = damages;
	}
	
	@Override
	public String physical() {
		// TODO 自动生成的方法存根
		return "物理-剑攻击!"+"造成了"+this.damages+"点伤害";
	}
	@Override
	public int damages() {
		// TODO 自动生成的方法存根
		return this.getDamages();
	}
}
