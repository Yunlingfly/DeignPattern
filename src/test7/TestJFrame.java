package test7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Label;

public class TestJFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JComboBox comboBox,comboBox2,comboBox3;
	DrawControl drawC=new DrawControl();
	private JButton button;
	String[] str={"圆形","椭圆","实心圆"};
	String[] str2={"方形","正方形","长方形"};
	String[] str3={"三角形","等腰直角三角形","等边三角形"};
	static JPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJFrame frame = new TestJFrame();
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
	public TestJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel p1=new Panel();
		p1.add(new JLabel("圆形:"));
		comboBox=new JComboBox(str);
		p1.add(comboBox);
		
		p1.add(new JLabel("方形:"));
		comboBox2=new JComboBox(str2);
		p1.add(comboBox2);
		
		p1.add(new JLabel("三角形:"));
		comboBox3=new JComboBox(str3);
		p1.add(comboBox3);
		
		comboBox.addActionListener(this);
		comboBox2.addActionListener(this);
		comboBox3.addActionListener(this);
		contentPane.add(p1,"North");
		
		button = new JButton("\u64A4\u9500");	//撤销
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				drawC.undoCommand();
				System.out.println("正在撤销最后一个元素");
				rePait();
			}
		});
		p1.add(button);
		
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(6, 1, 0, 0));
	}

	@Override
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(comboBox)){
			if(comboBox.getSelectedItem().equals("圆形")){
				Circular circular=new Circular(100, 100);
				drawC.addCommand(new CircularCommand(circular));	//向list添加一个数据
				rePait();
//				panel_1.add(circular,"South");
//				circular.drawCircular();
				this.setVisible(true);
			}
			else if(comboBox.getSelectedItem().equals("椭圆")){
				Circular circular=new Circular(30, 70);
				drawC.addCommand(new EllipseCommand(circular));	//向list添加一个数据
				rePait();
//				getContentPane().add(circular,"South");
//				circular.drawEllipse();
				this.setVisible(true);
			}
			else if(comboBox.getSelectedItem().equals("实心圆")){
				Circular circular=new Circular(50, 50);
				drawC.addCommand(new SolidRoundCommand(circular));	//向list添加一个数据
				rePait();
				this.setVisible(true);
			}
		}
			else if(e.getSource().equals(comboBox2)){
				
				if(comboBox2.getSelectedItem().equals("方形")){
					Rectangle rectangle=new Rectangle(100, 100);
					drawC.addCommand(new highRectangleCommand(rectangle));	//向list添加一个数据
					rePait();
					this.setVisible(true);
				
			}
			else if(comboBox2.getSelectedItem().equals("长方形")){

				Rectangle rectangle=new Rectangle(100, 100);
				drawC.addCommand(new longRectangleCommand(rectangle));	//向list添加一个数据
				rePait();
				this.setVisible(true);
			}
			else  if(comboBox2.getSelectedItem().equals("正方形")){

				Rectangle rectangle=new Rectangle(100, 100);
				drawC.addCommand(new squareCommand(rectangle));	//向list添加一个数据
				rePait();
				this.setVisible(true);
			
			} 
			}else if(e.getSource().equals(comboBox3)){

             if(comboBox3.getSelectedItem().equals("三角形")){
            	Triangle triangle=new Triangle(500, 10);
            	drawC.addCommand(new TriangleCommand(triangle));	//向list添加一个数据
 				rePait();
				this.setVisible(true);
            }

			else if(comboBox3.getSelectedItem().equals("等腰直角三角形")){
           	 	Triangle triangle=new Triangle(500, 30);
           	 	drawC.addCommand(new IsoscelesTriangleCommand(triangle));	//向list添加一个数据
				rePait();
				this.setVisible(true);
			}
			else if(comboBox3.getSelectedItem().equals("等边三角形")){
	           	Triangle triangle=new Triangle(500, 50);
	           	drawC.addCommand(new QuilateralTriangleCommand(triangle));	//向list添加一个数据
 				rePait();
				this.setVisible(true);
			}
			}
		}
	public void rePait(){	//重绘
		System.out.println("正在重绘");
		panel_1.removeAll();	//移除所有元素
		panel_1.updateUI();		//更新界面

		drawC.executeCommand();	//重绘界面
	}
}
