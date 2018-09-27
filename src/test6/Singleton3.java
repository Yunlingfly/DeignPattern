package test6;

public class Singleton3
{  	//双重检查加锁
    private volatile static  Singleton3 uniqueInstance = null;
    // volatile关键词确保：当uniqueInstance变量被初始化成Singleton3实例时，多个线程正确地处理uniqueInstance变量
    //其他  
    private String name;
    private String password;
    private Singleton3()  
    {  
    	MainJFrame.textArea.append("双重检查加锁\n");
    }  
  
    public static  Singleton3 getInstance()  
    {  
        if (uniqueInstance == null)  
        {  
            synchronized(Singleton3.class){
         //使用synchronized可以迫使每个线程进入该方法之前，要要先等候其他线程离开该方法(synchronized锁定的是该类对应的Class对象)
                if(uniqueInstance==null)  
                {
                    uniqueInstance = new Singleton3();
                }
                  
            }
        }
        return uniqueInstance;  
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}  
