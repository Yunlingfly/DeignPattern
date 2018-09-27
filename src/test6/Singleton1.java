package test6;

public class Singleton1
{  	//�ӳ�ʵ������ʹ��ͬ��getInstance()����
    private static Singleton1 uniqueInstance = null;
    //�������õ�ʵ������
    private String name;
    private String password;
      
    //���췽����˽�еģ����������ⲻ��new�����ʵ��
    private Singleton1()
    {
    	MainJFrame.textArea.append("ʹ�����ӳ�ʵ������ʹ��ͬ��getInstance()����\n");
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
		System.out.println("ߣ��1"+this.name);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("ߣ��1"+this.password);
	}
    
}