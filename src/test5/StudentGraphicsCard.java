package test5;

public class StudentGraphicsCard implements GraphicsCard {
	String GraphicsCard=new String();
	public StudentGraphicsCard(String[] a){
		GraphicsCard="�����Կ�";
		a[2]=GraphicsCard;
		System.out.println("GraphicsCard:"+GraphicsCard);
	}
}

