package test5;

public interface ComputerFactory {
	public Cpu createCpu(String[] a);
	public Mainboard createMainboard(String[] a);
	public GraphicsCard createGraphicsCard(String[] a);
	public Ram createRam(String[] a);
	public Caliche createCaliche(String[] a);
	public void displayPrice();
}
