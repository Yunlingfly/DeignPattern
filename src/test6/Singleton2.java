package test6;

public class Singleton2 
{  	//����ʵ����
    private static Singleton2 uniqueInstance = new Singleton2();
    private String name;
    private String password;
    private Singleton2()
    {
    	MainJFrame.textArea.append("ʹ���˼���ʵ����\n");
    }
         //��JVM���ظ���ʱ�Ѿ�������Ψһ�ĵ���ʵ��  
    public static  Singleton2 getInstance()  
    {
        return uniqueInstance;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("ߣ��2"+this.name);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("ߣ��2"+this.password);
	}
    
}