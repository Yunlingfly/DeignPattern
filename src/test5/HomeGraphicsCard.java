package test5;

public class HomeGraphicsCard implements GraphicsCard {
	String GraphicsCard=new String();
	public HomeGraphicsCard(String[] a){
		GraphicsCard="�����Կ�";
		a[2]=GraphicsCard;
		System.out.println("GraphicsCard:"+GraphicsCard);
	}
}
