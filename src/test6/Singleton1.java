package test6;

public class Singleton1
{  	//延迟实例化并使用同步getInstance()方法
    private static Singleton1 uniqueInstance = null;
    //其他有用的实例变量
    private String name;
    private String password;
      
    //构造方法是私有的，所以在类外不能new出多个实例
    private Singleton1()
    {
    	MainJFrame.textArea.append("使用了延迟实例化并使用同步getInstance()方法\n");
    }
  
    public static synchronized Singleton1 getInstance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
//        System.out.println();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("撸狗1"+this.name);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("撸狗1"+this.password);
	}
    
}