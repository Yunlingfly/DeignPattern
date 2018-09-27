package test5;

public class StudentComputerFactory implements ComputerFactory {
	public StudentComputerFactory(){
		MainFrame.title.setText("下面是学生版配置的详细信息，总价格为：");
	}
	@Override
	public Cpu createCpu(String[] a) {
		// TODO Auto-generated method stub
		return new StudentCpu(a);
	}

	@Override
	public Mainboard createMainboard(String[] a) {
		// TODO Auto-generated method stub
		return new StudentMainboard(a);
	}

	@Override
	public GraphicsCard createGraphicsCard(String[] a) {
		// TODO Auto-generated method stub
		return new StudentGraphicsCard(a);
	}

	@Override
	public Ram createRam(String[] a) {
		// TODO Auto-generated method stub
		return new StudentRam(a);
	}

	@Override
	public Caliche createCaliche(String[] a) {
		// TODO Auto-generated method stub
		return new StudentCaliche(a);
	}
	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		MainFrame.totalprice.setText("￥3000");
	}
}
