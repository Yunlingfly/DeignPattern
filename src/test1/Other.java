package test1;

public class Other implements Driverable{
	private int maxspeed;
	private int nums=0;
	private int rand=3;		//�����
	private String name="����";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getRand() {
		return rand;
	}
	public void setRand(int rand) {
		this.rand = rand;
	}
	public String speedToString(){	//����ֵת��ΪString����
		return String.valueOf(this.getMaxspeed());
	}
	@Override
	public boolean drive() {
		// TODO �Զ����ɵķ������
		return false;
	}
}
