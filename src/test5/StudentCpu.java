package test5;

public class StudentCpu implements Cpu {
	String Cpu=new String();
	public StudentCpu(String[] a){
		Cpu="intel i3";
		a[0]=Cpu;
		System.out.println("Cpu:"+Cpu);
	}
} 
