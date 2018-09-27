package test6;

public class Singleton3
{  	//˫�ؼ�����
    private volatile static  Singleton3 uniqueInstance = null;
    // volatile�ؼ���ȷ������uniqueInstance��������ʼ����Singleton3ʵ��ʱ������߳���ȷ�ش���uniqueInstance����
    //����  
    private String name;
    private String password;
    private Singleton3()  
    {  
    	MainJFrame.textArea.append("˫�ؼ�����\n");
    }  
  
    public static  Singleton3 getInstance()  
    {  
        if (uniqueInstance == null)  
        {  
            synchronized(Singleton3.class){
         //ʹ��synchronized������ʹÿ���߳̽���÷���֮ǰ��ҪҪ�ȵȺ������߳��뿪�÷���(synchronized�������Ǹ����Ӧ��Class����)
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
