package test5;

public class HomeComputerFactory implements ComputerFactory {
	public HomeComputerFactory(){
		MainFrame.title.setText("�����Ǽ�ͥ�����õ���ϸ��Ϣ���ܼ۸�Ϊ��");
	}
	@Override
	public Cpu createCpu(String[] a) {
		// TODO Auto-generated method stub
		return new HomeCpu(a);
	}

	@Override
	public Mainboard createMainboard(String[] a) {
		// TODO Auto-generated method stub
		return new HomeMainboard(a);
	}

	@Override
	public GraphicsCard createGraphicsCard(String[] a) {
		// TODO Auto-generated method stub
		return new HomeGraphicsCard(a);
	}

	@Override
	public Ram createRam(String[] a) {
		// TODO Auto-generated method stub
		return new HomeRam(a);
	}

	@Override
	public Caliche createCaliche(String[] a) {
		// TODO Auto-generated method stub
		return new HomeCaliche(a);
	}
	@Override
	public void displayPrice() {
		// TODO Auto-generated method stub
		MainFrame.totalprice.setText("��4000");
	}
}
