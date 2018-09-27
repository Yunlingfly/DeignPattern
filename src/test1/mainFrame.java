package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static JTextField text_tool_name;
	private Driver driver=new Driver();
	protected static JTextField text_name;
	protected static JTextArea textArea;
	
	private Car car=new Car();
	private Ship ship=new Ship();
	private Aircraft aircraft=new Aircraft();
	private Other other=new Other();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
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
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 800, 600);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u65B0\u5EFA\u53F8\u673A");		//增加司机
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new DriverDialog(driver,car,ship,aircraft,other);
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_2 = new JMenuItem("\u589E\u52A0\u5DE5\u5177");	//增加工具
		menuItem_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new Addnewtool(other);
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("\u7F16\u8F91");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\u7F16\u8F91\u5DE5\u5177\u7684\u901F\u5EA6");//编辑速度
		menuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new Edit(driver, car, ship, aircraft, other);
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu_1.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 6, 1));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel label_5 = new JLabel("\u6B22\u8FCE\u60A8\uFF01");
		panel_3.add(label_5);
		
		text_name = new JTextField();
		panel_3.add(text_name);
		text_name.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel label = new JLabel("你\u79DF\u501F");
		panel_1.add(label);
		
		text_tool_name = new JTextField();
		panel_1.add(text_tool_name);
		text_tool_name.setColumns(10);
		
		JLabel label_4 = new JLabel("\u6210\u529F");
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textArea = new JTextArea();
		
		textArea.setBounds(237, 0, 285, 85);
		panel_2.add(textArea);
	}
}
