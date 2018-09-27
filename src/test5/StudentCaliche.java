package test5;

public class  StudentCaliche implements Caliche{
	String Caliche=new String();
	public StudentCaliche(String[] a){
		Caliche="IDE";
		a[4]=Caliche;
		System.out.println("Caliche:"+Caliche);
	}
}
