package test2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_BOSS_hp;			//BOSS属性
	private JTextField textField_BOSS_mp;
	private JTextField textField_BOSS_sp;
	protected static JTextField textField_P_name;	//玩家属性
	protected static JTextField textField_P_HP;
	protected static JTextField textField_P_MP;
	protected static JTextField textField_P_Face;
	private JComboBox<String> jcb1;					//物理或魔法
	private JComboBox<String> jcb2;					//攻击方式
	private String jcbA[]={"物理攻击","魔法攻击"};
	private String jcbP[]={"刀","剑","手"};
	private String jcbM[]={"火系","金系","水系"};
	private Boss boss=new Boss();
	private Persona persona=new Wanjia(0);			//和尚

	protected static JTextField textField;
	protected static JPanel panel_P_image;
	protected static JLabel label_P_image;		//玩家头像
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 800, 600);

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u6587\u4EF6");
		menu.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 3, 1));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2));
		
		JPanel panel_4 = new ImagePanel("D:/java/DeignPattern/src/test2/Boss.jpg");		//Boss图像
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 1));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JLabel lblHp = new JLabel("HP:");
		panel_6.add(lblHp);
		
		textField_BOSS_hp = new JTextField();
		panel_6.add(textField_BOSS_hp);
		textField_BOSS_hp.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		JLabel lblMp = new JLabel("MP:");
		panel_7.add(lblMp);
		
		textField_BOSS_mp = new JTextField();
		panel_7.add(textField_BOSS_mp);
		textField_BOSS_mp.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		
		JLabel lblSp = new JLabel("SP:");
		panel_8.add(lblSp);
		
		textField_BOSS_sp = new JTextField();
		panel_8.add(textField_BOSS_sp);
		textField_BOSS_sp.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2));
		
		panel_P_image = new JPanel();
		panel_2.add(panel_P_image);
		
		label_P_image = new JLabel("");
		
		label_P_image.setIcon(new ImageIcon("D:/java/DeignPattern/src/test2/BuddhistMonk.jpg"));
		panel_P_image.add(label_P_image);
		
		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10);
		panel_10.setLayout(new GridLayout(4, 1));
		
		JPanel panel_11 = new JPanel();
		panel_10.add(panel_11);
		
		JLabel lblName = new JLabel("Name:");
		panel_11.add(lblName);
		
		textField_P_name = new JTextField();
		panel_11.add(textField_P_name);
		textField_P_name.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12);
		
		JLabel lblHp_1 = new JLabel("HP:");
		panel_12.add(lblHp_1);
		
		textField_P_HP = new JTextField();
		panel_12.add(textField_P_HP);
		textField_P_HP.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_10.add(panel_13);
		
		JLabel lblMp_1 = new JLabel("MP:");
		panel_13.add(lblMp_1);
		
		textField_P_MP = new JTextField();
		panel_13.add(textField_P_MP);
		textField_P_MP.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_10.add(panel_14);
		
		JLabel lblFace = new JLabel("Face:");
		panel_14.add(lblFace);
		
		textField_P_Face = new JTextField();
		panel_14.add(textField_P_Face);
		textField_P_Face.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 1));
		
		JPanel panel_16 = new JPanel();
		panel_3.add(panel_16);
		
		persona=new Wanjia(0);			//玩家类

		persona.start();				//初始化
		initBoss(); 			//初始化Boss属性值和和尚属性值
		
		JButton button = new JButton("\u5207\u6362\u89D2\u8272");	//切换角色
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog jdialog=new Exchange(persona);
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		panel_16.add(button);
		
		JPanel panel_17 = new JPanel();
		panel_3.add(panel_17);
		
		jcb1 = new JComboBox<String>();
		jcb1.setModel(new DefaultComboBoxModel<String>(jcbA));
		jcb1.addItemListener(this);		//添加监控
		panel_17.add(jcb1);
		
		jcb2 = new JComboBox<String>();
		jcb2.setModel(new DefaultComboBoxModel<String>(jcbP));	//初始化二级列表
		panel_17.add(jcb2);
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JButton button_1 = new JButton("\u653B\u51FB");			//攻击按钮
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//!!!下面的new很重要!!!注意new的是persona.wanjia而不是直接persona=new Wanjia() 且要改变的是原来的persona
				persona.wanjia=new Wanjia(selected(),persona);			//攻击
				
				int damages;									//伤害值
				if(jcb1.getSelectedIndex()==0){
					textField.setText("你攻击了Boss，使用了"+persona.physicalAttack.physical());
					damages=persona.getPhysicalAttack().damages();
					boss.setHp(boss.getHp()-damages);
					textField_BOSS_hp.setText(String.valueOf(boss.getHp()));	//刷新Boss血量
				}else {
					textField.setText("你攻击了Boss，使用了"+persona.magicAttack.magic());
					damages=persona.getMagicAttack().damages();
					boss.setHp(boss.getHp()-damages);
					textField_BOSS_hp.setText(String.valueOf(boss.getHp()));	//刷新Boss血量
				}
				
//				System.out.println(persona.getMagicAttack().magic());
			}
		});
		panel_15.add(button_1);
		
		JPanel panel_18 = new JPanel();
		panel_3.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panel_18.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==jcb1){	//二级联动下拉列表实现
			if(jcb1.getSelectedIndex()==0) jcb2.setModel(new DefaultComboBoxModel<String>(jcbP));
			else if(jcb1.getSelectedIndex()==1) jcb2.setModel(new DefaultComboBoxModel<String>(jcbM));
		}
	}
	public void initBoss(){
		textField_BOSS_hp.setText(boss.ToString(boss.getHp()));
		textField_BOSS_mp.setText(boss.ToString(boss.getMp()));
		textField_BOSS_sp.setText(boss.ToString(boss.getSp()));
		
		textField_P_name.setText(persona.buddhistMonk.getName());
		textField_P_HP.setText(persona.buddhistMonk.ToString(persona.buddhistMonk.getHp()));
		textField_P_MP.setText(persona.buddhistMonk.ToString(persona.buddhistMonk.getMp()));
		textField_P_Face.setText(persona.buddhistMonk.getFace());
	}
	public String selected(){
		if(jcb1.getSelectedIndex()==0&&jcb2.getSelectedIndex()==0) return "P_Knife";
		else if(jcb1.getSelectedIndex()==0&&jcb2.getSelectedIndex()==1) return "P_Sword";
		else if(jcb1.getSelectedIndex()==0&&jcb2.getSelectedIndex()==2) return "P_Hand";
		else if(jcb1.getSelectedIndex()==1&&jcb2.getSelectedIndex()==0) return "M_Fire";
		else if(jcb1.getSelectedIndex()==1&&jcb2.getSelectedIndex()==1) return "M_Gold";
		else if(jcb1.getSelectedIndex()==1&&jcb2.getSelectedIndex()==2) return "M_Water";
		else return null;
		
	}
}
