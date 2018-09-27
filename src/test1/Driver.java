package test1;

public class Driver{
	private int license;	//是否有驾照
	private int speed;		//速度
	private String name;	//名字
	public Driver(){	//实例化
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLicense() {
		return license;
	}
	public void setLicense(int license) {
		this.license = license;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
