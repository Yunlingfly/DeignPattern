package test6;

public class Singleton2 
{  	//急切实例化
    private static Singleton2 uniqueInstance = new Singleton2();
    private String name;
    private String password;
    private Singleton2()
    {
    	MainJFrame.textArea.append("使用了急切实例化\n");
    }
         //在JVM加载该类时已经创建此唯一的单件实例  
    public static  Singleton2 getInstance()  
    {
        return uniqueInstance;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("撸狗2"+this.name);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("撸狗2"+this.password);
	}
    
}