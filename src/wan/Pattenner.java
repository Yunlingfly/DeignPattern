package wan;

import java.util.regex.Pattern;

public class Pattenner {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="508821881@qq.com";
		String pattern="^[0-9]{5,13}\\@qq\\.com$";
		if(str.matches(pattern)){
			System.out.println("模式匹配成功");
		}
		else{
			System.out.println("模式匹配失败");
		}
		
		 String content = "I am noob " +
			        "from runoob.com.";
			 
			      String pattern12 = ".*runoob.*";
			 
			      boolean isMatch = Pattern.matches(pattern12, content);
			      System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
	}

}
