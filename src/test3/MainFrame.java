package test3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JLabel northP;	//显示行车灯的状态信息
	public static JLabel eastP;
	public static JLabel southP;
	public static JLabel westP;
	public static JLabel northP1;	//显示行人灯的状态信息
	public static JLabel eastP1;
	public static JLabel southP1;
	public static JLabel westP1;
	public static JTextArea jta;	//信息输出
	private Thread thread;			//线程
	private IObserver obs;
    private Subject subject;
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
		
		JMenuItem menuItem = new JMenuItem("\u5F00\u59CB");
		menuItem.addActionListener(new ActionListener() {		//开始
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jta.setText("开始运行\n");
				thread = new Thread(new Runnable(){
		            public void run(){
		            	obs=new Observer();			//观察者
		            	subject = new Subject();	//被观察者
		            	subject.register(obs);		//添加观察者
		            	
		            	new Start(subject);
		            }});  
				thread.start();		//开启线程
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u6682\u505C");
		menuItem_1.addActionListener(new ActionListener() {		//暂停
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				thread.suspend();//线程暂停
				jta.setText("\n暂停运行...");
			}
		});
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u6062\u590D");
		menuItem_2.addActionListener(new ActionListener() {		//恢复
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				thread.resume();//线程继续
				jta.setText("\n继续运行");
			}
		});
		menu.add(menuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 2, 10, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 3, 0, 0));		//三行三列的显示灯
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("北：");
		panel_6.add(lblNewLabel);
		
		northP = new JLabel("\u53EF\u4EE5\u901A\u884C");
		northP.setOpaque(true);
		northP.setBackground(Color.GREEN);
		panel_6.add(northP);
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		
		JLabel label_4 = new JLabel("西：");
		panel_8.add(label_4);
		
		westP = new JLabel("\u7981\u6B62\u901A\u884C");
		westP.setOpaque(true);
		westP.setBackground(Color.RED);
		panel_8.add(westP);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		
		JLabel label_1 = new JLabel("\u884C\u8F66\u8DEF\u706F");
		panel_9.add(label_1);
		
		JPanel panel_10 = new JPanel();
		panel_3.add(panel_10);
		
		JLabel label_2 = new JLabel("东：");
		panel_10.add(label_2);
		
		eastP = new JLabel("\u7981\u6B62\u901A\u884C");
		eastP.setOpaque(true);
		eastP.setBackground(Color.RED);
		panel_10.add(eastP);
		
		JPanel panel_11 = new JPanel();
		panel_3.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_3.add(panel_12);
		
		JLabel label = new JLabel("南：");
		panel_12.add(label);
		
		southP = new JLabel("\u7981\u6B62\u901A\u884C");
		southP.setOpaque(true);
		southP.setBackground(Color.RED);
		panel_12.add(southP);
		
		JPanel panel_13 = new JPanel();
		panel_3.add(panel_13);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_4.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_4.add(panel_15);
		
		JLabel label_5 = new JLabel("\u5317\uFF1A");
		panel_15.add(label_5);
		
		northP1 = new JLabel("\u7981\u6B62\u901A\u884C");
		northP1.setOpaque(true);
		northP1.setBackground(Color.RED);
		panel_15.add(northP1);
		
		JPanel panel_16 = new JPanel();
		panel_4.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_4.add(panel_17);
		
		JLabel label_11 = new JLabel("\u897F\uFF1A");
		panel_17.add(label_11);
		
		westP1 = new JLabel("\u53EF\u4EE5\u901A\u884C");
		westP1.setOpaque(true);
		westP1.setBackground(Color.GREEN);
		panel_17.add(westP1);
		
		JPanel panel_18 = new JPanel();
		panel_4.add(panel_18);
		
		JLabel label_3 = new JLabel("\u884C\u4EBA\u8DEF\u706F");
		panel_18.add(label_3);
		
		JPanel panel_19 = new JPanel();
		panel_4.add(panel_19);
		
		JLabel label_7 = new JLabel("\u4E1C\uFF1A");
		panel_19.add(label_7);
		
		eastP1 = new JLabel("\u53EF\u4EE5\u901A\u884C");
		eastP1.setOpaque(true);
		eastP1.setBackground(Color.GREEN);
		panel_19.add(eastP1);
		
		JPanel panel_20 = new JPanel();
		panel_4.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_4.add(panel_21);
		
		JLabel label_9 = new JLabel("\u5357\uFF1A");
		panel_21.add(label_9);
		
		southP1 = new JLabel("\u53EF\u4EE5\u901A\u884C");
		southP1.setOpaque(true);
		southP1.setBackground(Color.RED);
		panel_21.add(southP1);
		
		JPanel panel_22 = new JPanel();
		panel_4.add(panel_22);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
        //默认的设置是超过文本框才会显示滚动条，以下设置让滚动条一直显示
        jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel_2.add(jsp, BorderLayout.CENTER);
	}

}
