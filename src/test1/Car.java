package test1;

public class Car implements Driverable{
	private int maxspeed=120;
	private int nums=6;
	private int rand=2;		//随机数
	private String name="Car";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car(){
		
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
		// TODO 自动生成的方法存根
		return false;
	}
	public String speedToString(){	//将数值转化为String类型
		return String.valueOf(this.getMaxspeed());
	}

}
