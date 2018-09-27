package test6;

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
import javax.swing.JTextArea;

public class MainJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String name;
	static String password;
	static JTextArea textArea;
	static Singleton1 s1;
	static Singleton2 s2;
	static Singleton3 s3;
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
		setTitle("请登录");
		setBounds(500, 150, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u83DC\u5355");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u767B\u5F55");	//登录
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new SignInDialog("1");
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu.add(menuItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u767B\u5F552");	//登录2
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new SignInDialog("2");
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu.add(mntmNewMenuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u767B\u5F553");		//登录3
		menuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				JDialog jdialog=new SignInDialog("3");
				jdialog.setVisible(true);
				jdialog=null;					//回收窗体
				System.gc();
			}
		});
		menu.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
