package test1;

public class Ship implements Driverable{
	private int maxspeed=1000;
	private int nums=3;
	private int rand=1;		//�����
	private String name="Ship";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ship(){
		
	}
	public int getRand() {
		return rand;
	}
	public void setRand(int rand) {
		this.rand = rand;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	@Override
	public boolean drive() {
		// TODO �Զ����ɵķ������
		return false;
	}
	public String speedToString(){	//����ֵת��ΪString����
		return String.valueOf(this.getMaxspeed());
	}

}
