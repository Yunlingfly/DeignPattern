package wan;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);  
		String size=in.next();
		in.nextLine();
		String name=in.nextLine();
		String[] number=name.split(" ");
		int count=0;
		
		for(int i = 0;i < Integer.valueOf(size);i++){
			if(i==Integer.valueOf(size)-1) {count++;break;}
			if(number[i].equals((number[i+1]))) continue;
			else count++;
		}
		System.out.print(count);Math.sqrt(2);
	}

}
