package wan;

import java.util.regex.Pattern;

public class Pattenner {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String str="508821881@qq.com";
		String pattern="^[0-9]{5,13}\\@qq\\.com$";
		if(str.matches(pattern)){
			System.out.println("ģʽƥ��ɹ�");
		}
		else{
			System.out.println("ģʽƥ��ʧ��");
		}
		
		 String content = "I am noob " +
			        "from runoob.com.";
			 
			      String pattern12 = ".*runoob.*";
			 
			      boolean isMatch = Pattern.matches(pattern12, content);
			      System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + isMatch);
	}

}
