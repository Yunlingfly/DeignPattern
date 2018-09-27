package test6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.applet.Main;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignInDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			SignInDialog dialog = new SignInDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public SignInDialog(String number) {
		setBounds(600, 250, 450, 300);
		setTitle("µÇÂ¼");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(2, 1, 0, 0));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
					panel_1.add(label);
				}
				{
					textField = new JTextField();
					panel_1.add(textField);
					textField.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u5BC6\u7801\uFF1A");
					panel_1.add(label);
				}
				{
					textField_1 = new JTextField();
					panel_1.add(textField_1);
					textField_1.setColumns(10);
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
						
						if(number.equals("1")){
							MainJFrame.s1=Singleton1.getInstance();
							MainJFrame.s1.setName(textField.getText());
							MainJFrame.s1.setPassword(textField_1.getText());
							MainJFrame.name=MainJFrame.s1.getName();
							MainJFrame.password=MainJFrame.s1.getPassword();
						}
						else if(number.equals("2")){
							MainJFrame.s2=Singleton2.getInstance();
							MainJFrame.s2.setName(textField.getText());
							MainJFrame.s2.setPassword(textField_1.getText());
							MainJFrame.name=MainJFrame.s2.getName();
							MainJFrame.password=MainJFrame.s2.getPassword();
						}
							
						else if(number.equals("3")){
							MainJFrame.s3=Singleton3.getInstance();
							MainJFrame.s3.setName(textField.getText());
							MainJFrame.s3.setPassword(textField_1.getText());
							MainJFrame.name=MainJFrame.s3.getName();
							MainJFrame.password=MainJFrame.s3.getPassword();
						}
//						MainJFrame.name=textField.getText();
//						MainJFrame.password=textField_1.getText();
						MainJFrame.textArea.append("µÇÂ¼Ãû£º"+MainJFrame.name+"ÃÜÂëÎª£º"+MainJFrame.password+"\n");
						dispose();				//¹Ø±Õ´°¿Ú
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
						dispose();				//¹Ø±Õ´°¿Ú
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
