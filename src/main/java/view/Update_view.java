package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Update_view {

	private JFrame frame;
	private JTextField name_input;
	private JTextField birth_input;
	private JTextField mail_input;
	private JTextField phone_input;
	private JTextField id_input;
	private JTextField textField_5;
	private JTextField address_input;
	private JTextField salary_input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_view window = new Update_view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Update_view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 980, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel addpanel = new JPanel();
		addpanel.setBounds(0, 0, 966, 551);
		frame.getContentPane().add(addpanel);
		addpanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 0, 966, 53);
		addpanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Information");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(26, 10, 230, 33);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 255, 255));
		panel_2.setBounds(0, 52, 966, 499);
		addpanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel id = new JLabel("Input ID");
		id.setFont(new Font("Tahoma", Font.BOLD, 15));
		id.setBounds(23, 162, 73, 23);
		panel_2.add(id);
		
		JLabel name = new JLabel("Full Name");
		name.setFont(new Font("Tahoma", Font.BOLD, 15));
		name.setBounds(273, 32, 88, 23);
		panel_2.add(name);
		
		JLabel birth = new JLabel("Date of Birth");
		birth.setFont(new Font("Tahoma", Font.BOLD, 15));
		birth.setBounds(392, 102, 98, 31);
		panel_2.add(birth);
		
		JLabel address = new JLabel("Address");
		address.setFont(new Font("Tahoma", Font.BOLD, 15));
		address.setBounds(608, 171, 98, 23);
		panel_2.add(address);
		
		JLabel phone = new JLabel("Phone Number");
		phone.setFont(new Font("Tahoma", Font.BOLD, 15));
		phone.setBounds(273, 238, 136, 28);
		panel_2.add(phone);
		
		JLabel position = new JLabel("Position");
		position.setFont(new Font("Tahoma", Font.BOLD, 15));
		position.setBounds(603, 32, 98, 23);
		panel_2.add(position);
		
		JLabel status = new JLabel("Status");
		status.setFont(new Font("Tahoma", Font.BOLD, 15));
		status.setBounds(608, 102, 59, 23);
		panel_2.add(status);
		
		JLabel mail = new JLabel("Email");
		mail.setFont(new Font("Tahoma", Font.BOLD, 15));
		mail.setBounds(276, 171, 85, 23);
		panel_2.add(mail);
		
		name_input = new JTextField();
		name_input.setColumns(10);
		name_input.setBounds(273, 60, 307, 28);
		panel_2.add(name_input);
		
		birth_input = new JTextField();
		birth_input.setColumns(10);
		birth_input.setBounds(392, 131, 172, 28);
		panel_2.add(birth_input);
		
		mail_input = new JTextField();
		mail_input.setColumns(10);
		mail_input.setBounds(273, 195, 307, 28);
		panel_2.add(mail_input);
		
		phone_input = new JTextField();
		phone_input.setColumns(10);
		phone_input.setBounds(273, 266, 307, 28);
		panel_2.add(phone_input);
		
		id_input = new JTextField();
		id_input.setColumns(10);
		id_input.setBounds(23, 195, 172, 28);
		panel_2.add(id_input);
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.BOLD, 15));
		gender.setBounds(273, 102, 98, 31);
		panel_2.add(gender);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(273, 133, 73, 26);
		panel_2.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(603, 60, 292, 28);
		panel_2.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Active");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(new Color(221, 255, 255));
		rdbtnNewRadioButton.setBounds(603, 131, 103, 27);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnInActive = new JRadioButton("In - Active");
		rdbtnInActive.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnInActive.setForeground(new Color(0, 0, 0));
		rdbtnInActive.setBackground(new Color(221, 255, 255));
		rdbtnInActive.setBounds(733, 129, 103, 27);
		panel_2.add(rdbtnInActive);
		
		address_input = new JTextField();
		address_input.setColumns(10);
		address_input.setBounds(608, 195, 307, 28);
		panel_2.add(address_input);
		
		JButton update = new JButton("update information");
		update.setBackground(new Color(0, 0, 128));
		update.setForeground(new Color(255, 255, 255));
	
		update.setFont(new Font("Tahoma", Font.BOLD, 16));
		update.setBounds(384, 440, 212, 33);
		panel_2.add(update);
		
		JButton back = new JButton("back");
		back.setBackground(new Color(255, 0, 0));
		
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setForeground(new Color(255, 255, 255));
		back.setBounds(883, 468, 73, 21);
		panel_2.add(back);
		
		salary_input = new JTextField();
		salary_input.setColumns(10);
		salary_input.setBounds(608, 266, 307, 28);
		panel_2.add(salary_input);
		
		JLabel lblBasicSalary = new JLabel("Salary");
		lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBasicSalary.setBounds(608, 241, 98, 23);
		panel_2.add(lblBasicSalary);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Update_view.class.getResource("/icon/user1.png")));
		lblNewLabel_1.setBounds(49, 32, 146, 127);
		panel_2.add(lblNewLabel_1);
		
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(update, "Updated Successfully!!! ");
		
			}
		});
		
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
}