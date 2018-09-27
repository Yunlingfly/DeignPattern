package test2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exchange extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_B_HP;		//���е�����
	private JTextField textField_B_MP;
	private JTextField textField_C_HP;		//Ů��������
	private JTextField textField_C_MP;
	private JTextField textField_N_HP;		//���ߵ�����
	private JTextField textField_N_MP;
	private ButtonGroup buttonGroup1;	//��ѡ��ť��

	/**
	 * Create the dialog.
	 */
	public Exchange(Persona persona) {
		setBounds(700, 200, 450, 300);
		setTitle("�л���ɫ");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(4, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u548C\u5C1A��");
				panel.add(label);
			}
			{
				JLabel lblHp = new JLabel("HP");
				panel.add(lblHp);
			}
			{
				textField_B_HP = new JTextField();
				panel.add(textField_B_HP);
				textField_B_HP.setColumns(10);
				textField_B_HP.setText(String.valueOf(persona.buddhistMonk.getHp()));
			}
			{
				JLabel lblNewLabel = new JLabel("MP");
				panel.add(lblNewLabel);
			}
			{
				textField_B_MP = new JTextField();
				panel.add(textField_B_MP);
				textField_B_MP.setColumns(10);
				textField_B_MP.setText(String.valueOf(persona.buddhistMonk.getMp()));
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u4FA0\u5973\uFF1A");
				panel.add(label);
			}
			{
				JLabel lblHp_1 = new JLabel("HP");
				panel.add(lblHp_1);
			}
			{
				textField_C_HP = new JTextField();
				panel.add(textField_C_HP);
				textField_C_HP.setColumns(10);
				textField_C_HP.setText(String.valueOf(persona.chivalrousLady.getHp()));
			}
			{
				JLabel lblNewLabel_1 = new JLabel("MP");
				panel.add(lblNewLabel_1);
			}
			{
				textField_C_MP = new JTextField();
				panel.add(textField_C_MP);
				textField_C_MP.setColumns(10);
				textField_C_MP.setText(String.valueOf(persona.chivalrousLady.getMp()));
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u5FCD\u8005\uFF1A");
				panel.add(label);
			}
			{
				JLabel lblHp_2 = new JLabel("HP");
				panel.add(lblHp_2);
			}
			{
				textField_N_HP = new JTextField();
				panel.add(textField_N_HP);
				textField_N_HP.setColumns(10);
				textField_N_HP.setText(String.valueOf(persona.ninja.getHp()));
			}
			{
				JLabel lblMp = new JLabel("MP");
				panel.add(lblMp);
			}
			{
				textField_N_MP = new JTextField();
				panel.add(textField_N_MP);
				textField_N_MP.setColumns(10);
				textField_N_MP.setText(String.valueOf(persona.ninja.getMp()));
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				buttonGroup1 = new ButtonGroup(); 
				  
				JRadioButton RadioButton1 = new JRadioButton("����");
				JRadioButton RadioButton2 = new JRadioButton("��Ů");
				JRadioButton RadioButton3 = new JRadioButton("����");
				buttonGroup1.add(RadioButton1);
				buttonGroup1.add(RadioButton2);
				buttonGroup1.add(RadioButton3);
				{
					JLabel label = new JLabel("\u9009\u62E9\u89D2\u8272\uFF1A");
					panel.add(label);
				}
				panel.add(RadioButton1);
				panel.add(RadioButton2);
				panel.add(RadioButton3);
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
						Enumeration<AbstractButton> radioBtns=buttonGroup1.getElements();  
						while (radioBtns.hasMoreElements()) {
						    AbstractButton btn = radioBtns.nextElement();
						    if(btn.isSelected()){
//						    	MainFrame.textField_P_name.setText(btn.getText());		//��������
						    	setMain(btn, persona); 	//ˢ��������
						    	dispose();				//�رմ���
							    break;
						    }
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void setMain(AbstractButton btn,Persona persona){
		if(btn.getText().equals("����")){
			MainFrame.textField.setText("���л�����  "+persona.buddhistMonk.getName());
    		MainFrame.textField_P_name.setText(persona.buddhistMonk.getName());
    		MainFrame.textField_P_HP.setText(persona.buddhistMonk.ToString(persona.buddhistMonk.getHp()));
    		MainFrame.textField_P_MP.setText(persona.buddhistMonk.ToString(persona.buddhistMonk.getMp()));
    		MainFrame.textField_P_Face.setText(persona.buddhistMonk.getFace());
    		MainFrame.label_P_image.setIcon(
        			new ImageIcon("D:/java/DeignPattern/src/test2/BuddhistMonk.jpg"));
    	}else if(btn.getText().equals("��Ů")){
    		MainFrame.textField.setText("���л�����  "+persona.chivalrousLady.getName());
    		MainFrame.textField_P_name.setText(persona.chivalrousLady.getName());
    		MainFrame.textField_P_HP.setText(persona.chivalrousLady.ToString(persona.chivalrousLady.getHp()));
    		MainFrame.textField_P_MP.setText(persona.chivalrousLady.ToString(persona.chivalrousLady.getMp()));
    		MainFrame.textField_P_Face.setText(persona.chivalrousLady.getFace());
    		MainFrame.label_P_image.setIcon(
        			new ImageIcon("D:/java/DeignPattern/src/test2/ChivalrousLady.jpg"));
    	}else if(btn.getText().equals("����")){
    		MainFrame.textField.setText("���л�����  "+persona.ninja.getName());
    		MainFrame.textField_P_name.setText(persona.ninja.getName());
    		MainFrame.textField_P_HP.setText(persona.ninja.ToString(persona.ninja.getHp()));
    		MainFrame.textField_P_MP.setText(persona.ninja.ToString(persona.ninja.getMp()));
    		MainFrame.textField_P_Face.setText(persona.ninja.getFace());
    		MainFrame.label_P_image.setIcon(
        			new ImageIcon("D:/java/DeignPattern/src/test2/Ninja.jpg"));
    	}
    	
	}
}
