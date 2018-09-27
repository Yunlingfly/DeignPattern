package wan;

public class As {
	public static void main(String[] args) {
		SouseFatory s=new CarFactory();
		MoveAble create = s.create();
		create.run();
	}
}