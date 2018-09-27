package test1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addnewtool extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_name;
	private JTextField textField_nums;
	private JTextField textField_speed;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Addnewtool dialog = new Addnewtool();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Addnewtool(Other other) {
		setBounds(700, 300, 450, 300);
		setTitle("增加交通工具");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(4, 1, 4, 1));
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u5DE5\u5177\u540D\uFF1A");
					panel_1.add(label);
				}
				{
					textField_name = new JTextField();
					panel_1.add(textField_name);
					textField_name.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u6570\u91CF\uFF1A");
					panel_1.add(label);
				}
				{
					textField_nums = new JTextField();
					panel_1.add(textField_nums);
					textField_nums.setColumns(10);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u901F\u5EA6\uFF1A");
					panel_1.add(label);
				}
				{
					textField_speed = new JTextField();
					panel_1.add(textField_speed);
					textField_speed.setColumns(10);
				}
				{
					JLabel lblMh = new JLabel("m/h");
					panel_1.add(lblMh);
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
						//新增的属性
						other.setName(textField_name.getText().trim().toString());
						other.setMaxspeed(Integer.parseInt(textField_speed.getText().trim().toString()));
						other.setNums(Integer.parseInt(textField_nums.getText().trim().toString()));
						dispose();
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
						textField_name.setText("");
						textField_nums.setText("");
						textField_speed.setText("");
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
