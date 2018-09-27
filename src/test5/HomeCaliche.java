package test5;

public class HomeCaliche implements Caliche{
	String Caliche=new String();
	public HomeCaliche(String[] a){
		Caliche="SATA";
		a[4]=Caliche;
		System.out.println("Caliche:"+Caliche);
	}
}

