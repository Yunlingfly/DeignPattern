package test5;

public class StudentRam implements Ram {
	String Ram=new String();
	public StudentRam(String[] a){
		Ram="2G�ڴ�";
		a[3]=Ram;
		System.out.println("Ram:"+Ram);
	}
}
