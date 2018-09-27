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
	private int price;		//�ܼ۸�
	private String info;	//��Ϣ
	private Dao dao;
	private int index=0;	//��ʼ���û�ID
	public static int dingnumber;	//������
	private Detair detair;	//bean
	private Checkbox cx1;	//���߿�
	private Checkbox cx2;	//���߿�
	private Checkbox cx3;	//���߿�
	private CheckboxGroup chk;	//ѡ��
	private JComboBox comboBox1;	//����
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	private JCheckBox checkBox;		//����
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JPanel panel_6;		//��һ��
	private JPanel panel_3;		//�ڶ���
	private JPanel panel_7;		//������
	
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
		setTitle("��ӭ����");
		setBounds(500, 150, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u70B9\u9910");
		menuItem.addActionListener(new ActionListener() {		//���
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}
		});
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u67E5\u770B");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\u67E5\u770B\u8BA2\u5355");
		menuItem_1.addActionListener(new ActionListener() {		//�鿴����
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				dao=new Dao();
				try {
					detair=dao.list(detair.getDingdan());		//�г���һ���û�
					System.out.println("������Ϊ��"+detair.getDingdan()+" �µ�ʱ�䣺"+detair.getTime());
					System.out.println(detair.getInfo());
					System.out.println("�ܼ�Ϊ"+detair.getPrice());
					JDialog j=new JView(detair);
					j.setVisible(true);
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
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
		label.setFont(new Font("����", Font.PLAIN, 17));
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
		button.addActionListener(new ActionListener() {		//�ύ����
			public void actionPerformed(ActionEvent e) {
				setPrice(0);		//��ʼ���ܼ۸�
				if(buy()==1){		//��������Ϣ
				Object[] options = { "OK", "CANCEL" };
				JOptionPane.showOptionDialog(null, "ȷ���µ���"+getInfo()+"\n�ܼ�Ϊ��"+getPrice(), "��ʾ",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null, options, options[0]);
				}
				String[] p=getInfo().split(" ");
				dao=new Dao();
						try {
							detair=new Detair();
							dao.add(p,index,detair);
						} catch (SQLException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
						index=index+1;	//�û�ID��+1
			}
		});
		panel_4.add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {	//����
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
	public int buy(){		//��������Ϣ
		if(cx1.getState()){		//������ѡ��
			MiXian mi=new GanMi();
//			System.out.println("�����"+mi.getName()+" ��ǮΪ��"+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else if(cx2.getState()){	//������ѡ��
			MiXian mi=new SuanMi();
//			System.out.println("�����"+mi.getName()+" ��ǮΪ��"+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else if(cx3.getState()){	//ˮ����
			MiXian mi=new ShuiMi();	//ˮ����
//			System.out.println("�����"+mi.getName()+" ��ǮΪ��"+mi.getPrice());
			setPrice(mi.getPrice());
			int i=0,j=0,k=0;
			if(checkBox.isSelected()) i=1;
			if(checkBox_1.isSelected()) j=1;
			if(checkBox_2.isSelected()) k=1;
			howmuch(mi, i, j, k);
		}else{
			JOptionPane.showMessageDialog(null, "��ѡ��Ҫ������", "��ʾ",
                    JOptionPane.YES_OPTION);
			return 0;
		}
		return 1;
	}
	public void howmuch(MiXian mi,int tofu,int eggs,int beef){
		if(tofu!=0){	//������ѡ��
			int i=comboBox1.getSelectedIndex()+1;
			Tofu t=new Tofu(mi,i);
//			System.out.println(t.getName()+" ���ڵļ�ǮΪ��"+t.getPrice());
			setPrice(t.getPrice());setInfo(t.getName());
			if(eggs!=0){
				int j=comboBox2.getSelectedIndex()+1;
				Eggs e=new Eggs(t, j);
//				System.out.println(e.getName()+" ���ڵļ�ǮΪ��"+e.getPrice());
				setPrice(e.getPrice());setInfo(e.getName());
				if(beef!=0){
					int k=comboBox3.getSelectedIndex()+1;
					Beef b=new Beef(e, k);
//					System.out.println(b.getName()+" ���ڵļ�ǮΪ��"+b.getPrice());
					setPrice(b.getPrice());setInfo(b.getName());
				}
			}
			else if(beef!=0){
				int k=comboBox3.getSelectedIndex()+1;
				Beef b=new Beef(t, k);
//				System.out.println(b.getName()+" ���ڵļ�ǮΪ��"+b.getPrice());
				setPrice(b.getPrice());setInfo(b.getName());
			}
		}		//if
		else if(eggs!=0){	//������ѡ��
			int j=comboBox2.getSelectedIndex()+1;
			Eggs e=new Eggs(mi, j);
//			System.out.println(e.getName()+" ���ڵļ�ǮΪ��"+e.getPrice());
			setPrice(e.getPrice());setInfo(e.getName());
			if(beef!=0){
				int k=comboBox3.getSelectedIndex()+1;
				Beef b=new Beef(e, k);
//				System.out.println(b.getName()+" ���ڵļ�ǮΪ��"+b.getPrice());
				setPrice(b.getPrice());setInfo(b.getName());
			}
		}
		else if(beef!=0){
			int k=comboBox3.getSelectedIndex()+1;
			Beef b=new Beef(mi, k);
//			System.out.println(b.getName()+" ���ڵļ�ǮΪ��"+b.getPrice());
			setPrice(b.getPrice());setInfo(b.getName());
		}
	}
}
