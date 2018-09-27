package test1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class DriverDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField text_speed;
	private JTextField text_name;
	private JCheckBox checkBox;
	private int havelicense;
	private int speeds;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			DriverDialog dialog = new DriverDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public DriverDialog(Driver driver,Car car,Ship ship,Aircraft aircraft,Other other) {
		setBounds(700, 300, 450, 300);
		setTitle("����˾��");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(3, 1, 3, 1));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u662F\u5426\u6709\u9A7E\u9A76\u8BC1\uFF1F");
					panel_1.add(label);
				}
				{
					checkBox = new JCheckBox("\u662F");
					panel_1.add(checkBox);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u4F60\u9700\u8981\u7684\u4EA4\u901A\u5DE5\u5177\u7684\u901F\u5EA6\u4E3A\uFF1F");
					panel_1.add(label);
				}
				{
					text_speed = new JTextField();
					panel_1.add(text_speed);
					text_speed.setColumns(10);
				}
				{
					JLabel lblMh = new JLabel("m/h");
					panel_1.add(lblMh);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u4F60\u7684\u540D\u5B57");
					panel_1.add(label);
				}
				{
					text_name = new JTextField();
					panel_1.add(text_name);
					text_name.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(checkBox.isSelected()) havelicense=1;
						else havelicense=0;
						
						if(havelicense==0){		//û������ʸ�
							JOptionPane.showMessageDialog(checkBox, "��û������ʸ�!", "��ʾ",
			                        JOptionPane.YES_OPTION);
						}else if(text_name.getText().equals("")){
							JOptionPane.showMessageDialog(text_name, "����������", "��ʾ",
			                        JOptionPane.YES_OPTION);
						}else if(text_speed.getText().equals("")){
							JOptionPane.showMessageDialog(text_speed, "����������", "��ʾ",
			                        JOptionPane.YES_OPTION);
						}else {
						
						driver.setName(text_name.getText().trim().toString());	//����
						speeds=Integer.parseInt(text_speed.getText().trim().toString());
						driver.setSpeed(speeds);			//תΪ����
						driver.setLicense(havelicense);		//�м�ʻ֤
						havelicense=0;	//���û�Ĭ��
						if(aircraft.getMaxspeed()<speeds&&ship.getMaxspeed()<speeds&&car.getMaxspeed()<speeds&&other.getMaxspeed()<speeds){
							JOptionPane.showMessageDialog(checkBox, "û�г�����Ҫ���ٶȵĹ��ߣ�", "��ʾ",
				                    JOptionPane.YES_OPTION);
						}else if(aircraft.getNums()==0&&ship.getNums()==0&&car.getNums()==0&&other.getNums()==0){
							JOptionPane.showMessageDialog(checkBox, "�����Ѿ�û���κν�ͨ�����ˣ����޷���裡", "��ʾ",
				                    JOptionPane.YES_OPTION);
						}else{
						randtool(speeds,car,ship,aircraft,other); 		//���ѡ����
						
						mainFrame.text_name.setText(driver.getName());	//��ҳ����ʾ˾������
						
						dispose();			//�ر�
						}		//else
						}		//else
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Reset");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						text_speed.setText("");
						text_name.setText("");
						checkBox.setSelected(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private void randtool(int speed,Car car,Ship ship,Aircraft aircraft,Other other){
		
		int rand;
		
        while(true){
        	Random random = new Random();
            rand=random.nextInt(4);
            if(rand==car.getRand()&&car.getMaxspeed()>speed&&car.getNums()!=0){
            	car.setNums(car.getNums()-1);
            	mainFrame.text_tool_name.setText("Car");
            	mainFrame.textArea.setText("ʣ��Car:"+car.getNums()+"\n"
            							  +"ʣ��Ship:"+ship.getNums()+"\n"
            							  +"ʣ��AirCraft:"+aircraft.getNums()+"\n"
            							  +"ʣ��"+other.getName()+":"+other.getNums());
            	break;
            	
            }
            if(rand==ship.getRand()&&ship.getMaxspeed()>speed&&ship.getNums()!=0){
            	ship.setNums(ship.getNums()-1);
            	mainFrame.text_tool_name.setText("Ship");
            	mainFrame.textArea.setText("ʣ��Car:"+car.getNums()+"\n"
            							  +"ʣ��Ship:"+ship.getNums()+"\n"
            							  +"ʣ��AirCraft:"+aircraft.getNums()+"\n"
            							  +"ʣ��"+other.getName()+":"+other.getNums());
            	break;
            	
            }
            if(rand==aircraft.getRand()&&aircraft.getMaxspeed()>speed&&aircraft.getNums()!=0){
            	aircraft.setNums(aircraft.getNums()-1);
            	mainFrame.text_tool_name.setText("AirCraft");
            	mainFrame.textArea.setText("ʣ��Car:"+car.getNums()+"\n"
            							  +"ʣ��Ship:"+ship.getNums()+"\n"
            							  +"ʣ��AirCraft:"+aircraft.getNums()+"\n"
            							  +"ʣ��"+other.getName()+":"+other.getNums());
            	break;
            	
            }
            if(rand==other.getRand()&&other.getMaxspeed()>speed&&other.getNums()!=0){
            	other.setNums(other.getNums()-1);
            	mainFrame.text_tool_name.setText(other.getName());
            	mainFrame.textArea.setText("ʣ��Car:"+car.getNums()+"\n"
						  				  +"ʣ��Ship:"+ship.getNums()+"\n"
						  				  +"ʣ��AirCraft:"+aircraft.getNums()+"\n"
						  				  +"ʣ��"+other.getName()+":"+other.getNums());
            }
        }		//while
        
	}
}
