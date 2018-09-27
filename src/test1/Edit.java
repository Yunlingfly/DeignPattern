package test1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Edit extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_Car;
	private JTextField textField_Ship;
	private JTextField textField_AirCraft;
	private int[] speeds;
	private JTextField textField_Other;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Edit dialog = new Edit();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Edit(Driver driver,Car car,Ship ship,Aircraft aircraft,Other other) {
		setBounds(700, 300, 450, 300);
		setTitle("编辑工具速度");
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
					JLabel lblCar = new JLabel("Car");
					panel_1.add(lblCar);
				}
				{
					textField_Car = new JTextField();
					panel_1.add(textField_Car);
					textField_Car.setColumns(10);
					textField_Car.setText(car.speedToString());
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
					JLabel lblShip = new JLabel("Ship");
					panel_1.add(lblShip);
				}
				{
					textField_Ship = new JTextField();
					panel_1.add(textField_Ship);
					textField_Ship.setColumns(10);
					textField_Ship.setText(ship.speedToString());
				}
				{
					JLabel lblMh_1 = new JLabel("m/h");
					panel_1.add(lblMh_1);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblAircraft = new JLabel("AirCraft");
					panel_1.add(lblAircraft);
				}
				{
					textField_AirCraft = new JTextField();
					panel_1.add(textField_AirCraft);
					textField_AirCraft.setColumns(10);
					textField_AirCraft.setText(aircraft.speedToString());
				}
				{
					JLabel lblMh_2 = new JLabel("m/h");
					panel_1.add(lblMh_2);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblNewLabel = new JLabel(other.getName());
					panel_1.add(lblNewLabel);
				}
				{
					textField_Other = new JTextField();
					panel_1.add(textField_Other);
					textField_Other.setColumns(10);
					if(!other.speedToString().equals("")) textField_Other.setText(other.speedToString());
				}
				{
					JLabel lblMh_3 = new JLabel("m/h");
					panel_1.add(lblMh_3);
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
						int s;
						speeds=new int[4];
						speeds[3]=0;	//其他
						s=Integer.parseInt(textField_Car.getText().trim().toString());
						speeds[0]=s;
						s=Integer.parseInt(textField_Ship.getText().trim().toString());
						speeds[1]=s;
						s=Integer.parseInt(textField_AirCraft.getText().trim().toString());
						speeds[2]=s;
						
						if(!other.speedToString().equals("")){
							s=Integer.parseInt(textField_Other.getText().trim().toString());
							speeds[3]=s;
							other.setMaxspeed(speeds[3]);
						}
						//修改默认速度
						car.setMaxspeed(speeds[0]);
						ship.setMaxspeed(speeds[1]);
						aircraft.setMaxspeed(speeds[2]);
						dispose();	//关闭
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
						textField_Car.setText(car.speedToString());
						textField_Ship.setText(ship.speedToString());
						textField_AirCraft.setText(aircraft.speedToString());
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
