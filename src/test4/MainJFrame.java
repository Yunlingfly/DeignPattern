package test4;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;

public class MainJFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int price;		//总价格
	private String info;	//消息
	private Dao dao;
	private int index=0;	//初始的用户ID
	public static int dingnumber;	//订单号
	private Detair detair;	//bean
	private Checkbox cx1;	//米线框
	private Checkbox cx2;	//米线框
	private Checkbox cx3;	//米线框
	private CheckboxGroup chk;	//选组
	private JComboBox comboBox1;	//数量
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JCheckBox checkBox;		//配料
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JPanel panel_6;		//第一行
	private JPanel panel_3;		//第二行
	private JPanel panel_7;		//第三行
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("欢迎光临");
		setBounds(500, 150, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u70B9\u9910");
		menuItem.addActionListener(new ActionListener() {		//点餐
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				
			}
		});
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u67E5\u770B");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\u67E5\u770B\u8BA2\u5355");
		menuItem_1.addActionListener(new ActionListener() {		//查看订单
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				dao=new Dao();
				try {
					detair=dao.list(detair.getDingdan());		//列出上一个用户
					System.out.println("订单号为："+detair.getDingdan()+" 下单时间："+detair.getTime());
					System.out.println(detair.getInfo());
					System.out.println("总价为"+detair.getPrice());
					JDialog j=new JView(detair);
					j.setVisible(true);
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		});
		menu_1.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u4F60\u8981\u7684\u7C73\u7EBF");
		label.setFont(new Font("宋体", Font.PLAIN, 17));
		panel_1.add(label);
	    chk=new CheckboxGroup();
	    cx1=new Checkbox("\u5E72\u7C73\u7EBF(\uFFE510/\u4EFD)",chk,false);
	    cx1.setFont(new Font("Dialog", Font.PLAIN, 16));
	    cx2=new Checkbox("\u9178\u7C73\u7EBF(\uFFE512/\u4EFD)",chk,false);
	    cx2.setFont(new Font("Dialog", Font.PLAIN, 16));
	    cx3=new Checkbox("\u6C34\u7C73\u7EBF(\uFFE511/\u4EFD)",chk,false);
	    cx3.setFont(new Font("Dialog", Font.PLAIN, 16));
	    panel_1.add(cx1);panel_1.add(cx2);panel_1.add(cx3);
		
		JPanel panel_2 = new JPanel();
	    panel.add(panel_2);
	    panel_2.setLayout(new GridLayout(4, 0, 0, 0));
	    
	    JPanel panel_5 = new JPanel();
	    panel_2.add(panel_5);
	    
	    JLabel label_1 = new JLabel("\u8BF7\u9009\u62E9\u914D\u6599");
	    panel_5.add(label_1);
	    
	    panel_6 = new JPanel();
	    panel_2.add(panel_6);
	    
	    checkBox = new JCheckBox("\u8C46\u8150(\uFFE51/\u4EFD)");
	    panel_6.add(checkBox);
	    
	    JLabel label_2 = new JLabel("\u6570\u91CF\uFF1A");
	    panel_6.add(label_2);
        comboBox1=new JComboBox();
        for(int i=1;i<5;i++) comboBox1.addItem(String.valueOf(i));
        panel_6.add(comboBox1);
	    
	    panel_3 = new JPanel();
	    panel_2.add(panel_3);
	    
	    checkBox_1 = new JCheckBox("\u9E21\u86CB(\uFFE51/\u4EFD)");
	    panel_3.add(checkBox_1);
	    
	    JLabel label_3 = new JLabel("\u6570\u91CF\uFF1A");
	    panel_3.add(label_3);
	    
	    comboBox2=new JComboBox();
	    for(int i=1;i<5;i++) comboBox2.addItem(String.valueOf(i));
        panel_3.add(comboBox2);
        
	    panel_7 = new JPanel();
	    panel_2.add(panel_7);
	    
	    checkBox_2 = new JCheckBox("\u725B\u8089(\uFFE52/\u4EFD)");
	    panel_7.add(checkBox_2);
	    
	    JLabel label_4 = new JLabel("\u6570\u91CF\uFF1A");
	    panel_7.add(label_4);
	    comboBox3=new JComboBox();
	    for(int i=1;i<5;i++) comboBox3.addItem(String.valueOf(i));
        panel_7.add(comboBox3);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {		//提交订单
			public void actionPerformed(ActionEvent e) {
				setPrice(0);		//初始化总价格
				if(buy()==1){		//处理订单消息
				Object[] options = { "OK", "CANCEL" };
				JOptionPane.showOptionDialog(null, "确认下单？"+getInfo()+"\n总价为："+getPrice(), "提示",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null, options, options[0]);
				}
				String[] p=getInfo().split(" ");
				dao=new Dao();
						try {
							detair=new Detair();
							dao.add(p,index,detair);
						} catch (SQLException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						index=index+1;	//用户ID自+1
			}
		});
		panel_4.add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {	//重置
			public void actionPerformed(ActionEvent arg0) {
				chk.setSelectedCheckbox(null);  
				checkBox.setSelected(false);
				checkBox_1.setSelected(false);
				checkBox_2.setSelected(false);
				comboBox1.setSelectedIndex(0);
				comboBox2.setSelectedIndex(0);
				comboBox3.setSelectedIndex(0);
			}
		});
		panel_4.add(button_1);
	}
	public int buy(){		//处理订单消息
		if(cx1.getState()){		//干米线选择
			MiXian mi=new GanMi();
//			System.out.println("你点了"+mi.getName()+" 价钱为："+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else if(cx2.getState()){	//酸米线选择
			MiXian mi=new SuanMi();
//			System.out.println("你点了"+mi.getName()+" 价钱为："+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else if(cx3.getState()){	//水米线
			MiXian mi=new ShuiMi();	//水米线
//			System.out.println("你点了"+mi.getName()+" 价钱为："+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else{
			JOptionPane.showMessageDialog(null, "请选择要的米线", "提示",
                    JOptionPane.YES_OPTION);
			return 0;
		}
		return 1;
	}
	public void howmuch(MiXian mi,int tofu,int eggs,int beef){
		if(tofu!=0){	//豆腐被选了
			int i=comboBox1.getSelectedIndex()+1;
			Tofu t=new Tofu(mi,i);
//			System.out.println(t.getName()+" 现在的价钱为："+t.getPrice());
			setPrice(t.getPrice());setInfo(t.getName());
			if(eggs!=0){
				int j=comboBox2.getSelectedIndex()+1;
				Eggs e=new Eggs(t, j);
//				System.out.println(e.getName()+" 现在的价钱为："+e.getPrice());
				setPrice(e.getPrice());setInfo(e.getName());
				if(beef!=0){
					int k=comboBox3.getSelectedIndex()+1;
					Beef b=new Beef(e, k);
//					System.out.println(b.getName()+" 现在的价钱为："+b.getPrice());
					setPrice(b.getPrice());setInfo(b.getName());
				}
			}
			else if(beef!=0){
				int k=comboBox3.getSelectedIndex()+1;
				Beef b=new Beef(t, k);
//				System.out.println(b.getName()+" 现在的价钱为："+b.getPrice());
				setPrice(b.getPrice());setInfo(b.getName());
			}
		}		//if
		else if(eggs!=0){	//鸡蛋被选了
			int j=comboBox2.getSelectedIndex()+1;
			Eggs e=new Eggs(mi, j);
//			System.out.println(e.getName()+" 现在的价钱为："+e.getPrice());
			setPrice(e.getPrice());setInfo(e.getName());
			if(beef!=0){
				int k=comboBox3.getSelectedIndex()+1;
				Beef b=new Beef(e, k);
//				System.out.println(b.getName()+" 现在的价钱为："+b.getPrice());
				setPrice(b.getPrice());setInfo(b.getName());
			}
		}
		else if(beef!=0){
			int k=comboBox3.getSelectedIndex()+1;
			Beef b=new Beef(mi, k);
//			System.out.println(b.getName()+" 现在的价钱为："+b.getPrice());
			setPrice(b.getPrice());setInfo(b.getName());
		}
	}
}
