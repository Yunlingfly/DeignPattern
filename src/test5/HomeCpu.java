package test5;

public class HomeCpu implements Cpu {
	String Cpu=new String();
	public HomeCpu(String[] a){
		Cpu="intel i5";
		a[0]=Cpu;
		System.out.println("Cpu:"+Cpu);
	}
}
