package test5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	public static JLabel title;
	public static JLabel totalprice;
	private String[] arr=new String[5];	//保存数据的数组
	private JTextField textField;	//CPU
	private JTextField textField_1;	//主板
	private JTextField textField_2;	//显卡
	private JTextField textField_3;	//内存
	private JTextField textField_4;	//硬盘
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
		setTitle("欢迎光临");
		setBounds(500, 150, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u67E5\u770B");
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("\u5B66\u751F\u914D\u7F6E");	//学生配置
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				title.setText("下面是学生版配置的详细信息");
				Computer com=new Computer();
				com.createComputer("student",arr);
				setText();
			}
		});
		menu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u5BB6\u5EAD\u914D\u7F6E");//家庭配置
		menuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Computer com=new Computer();
				com.createComputer("home",arr);
				setText();
			}
		});
		menu_1.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		
		title = new JLabel("\u8BF7\u9009\u62E9\u4F60\u8981\u7684\u4EA7\u54C1");
		panel_6.add(title);
		
		totalprice = new JLabel("");
		panel_6.add(totalprice);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("CPU\uFF1A");
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel label = new JLabel("\u4E3B\u677F\uFF1A");
		panel_3.add(label);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel label_1 = new JLabel("\u663E\u5361\uFF1A");
		panel_4.add(label_1);
		
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JLabel label_2 = new JLabel("\u5185\u5B58\uFF1A");
		panel_5.add(label_2);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JLabel label_3 = new JLabel("\u786C\u76D8\uFF1A");
		panel_7.add(label_3);
		
		textField_4 = new JTextField();
		panel_7.add(textField_4);
		textField_4.setColumns(10);
	}
	public void setText(){
		this.textField.setText(this.arr[0]);
		this.textField_1.setText(this.arr[1]);
		this.textField_2.setText(this.arr[2]);
		this.textField_3.setText(this.arr[3]);
		this.textField_4.setText(this.arr[4]);
	}
}
