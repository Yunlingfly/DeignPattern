package test5;

public class HomeRam implements Ram {
	String Ram=new String();
	public HomeRam(String[] a){
		Ram="4G�ڴ�";
		a[3]=Ram;
		System.out.println("Ram:"+Ram);
	}
}
