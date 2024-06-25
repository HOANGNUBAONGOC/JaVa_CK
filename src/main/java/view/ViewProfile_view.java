package view;

import com.toedter.calendar.JDateChooser;
import controller.ViewPro_controller;

import javax.swing.*;
import java.awt.*;

public class ViewProfile_view extends JFrame {
    private ViewPro_controller viewProController;

    public JFrame frame;
    public JDateChooser birth_input;
    public JTextField name_input;
    public JTextField mail_input;
    public JTextField phone_input;
    public JTextField id_input;
    public JTextField pos_input;
    public JTextField add_input;
    public JTextField salary_input;
    public JButton exit;
    public JButton update;

    public static void main(String[] args) {
        new ViewProfile_view();
    }

    public ViewProfile_view() {


        JLabel lblBasicSalary = new JLabel("Salary");
        lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblBasicSalary.setBounds(537, 268, 59, 23);

        birth_input = new JDateChooser();
        birth_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        birth_input.setBounds(343, 160, 96, 23);

        JLabel lblId = new JLabel("ID");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblId.setBounds(43, 43, 59, 23);
        JLabel name = new JLabel("Full Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 12));
        name.setBounds(43, 103, 98, 23);

        JLabel birth = new JLabel("Date of Birth");
        birth.setFont(new Font("Tahoma", Font.BOLD, 12));
        birth.setBounds(248, 157, 88, 23);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Tahoma", Font.BOLD, 12));
        address.setBounds(537, 209, 73, 23);

        JLabel phone = new JLabel("Phone Number");
        phone.setFont(new Font("Tahoma", Font.BOLD, 12));
        phone.setBounds(43, 265, 98, 28);

        JLabel position = new JLabel("Position");
        position.setFont(new Font("Tahoma", Font.BOLD, 12));
        position.setBounds(537, 103, 73, 23);

        JLabel status = new JLabel("Status");
        status.setFont(new Font("Tahoma", Font.BOLD, 12));
        status.setBounds(537, 157, 59, 23);

        JLabel mail = new JLabel("Email");
        mail.setFont(new Font("Tahoma", Font.BOLD, 12));
        mail.setBounds(43, 209, 59, 23);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.BOLD, 12));
        gender.setBounds(43, 157, 43, 23);

        name_input = new JTextField();
        name_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        name_input.setColumns(10);
        name_input.setBounds(165, 103, 274, 23);

        mail_input = new JTextField();
        mail_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        mail_input.setColumns(10);
        mail_input.setBounds(165, 209, 274, 23);

        phone_input = new JTextField();
        phone_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        phone_input.setColumns(10);
        phone_input.setBounds(165, 268, 274, 23);

        id_input = new JTextField();
        id_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        id_input.setColumns(10);
        id_input.setBounds(165, 43, 73, 23);

        salary_input = new JTextField();
        salary_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        salary_input.setColumns(10);
        salary_input.setBounds(620, 271, 250, 23);

        JComboBox gen_input = new JComboBox();
        gen_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        gen_input.setBounds(165, 157, 73, 23);

        pos_input = new JTextField();
        pos_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        pos_input.setColumns(10);
        pos_input.setBounds(620, 103, 250, 23);

        add_input = new JTextField();
        add_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        add_input.setColumns(10);
        add_input.setBounds(620, 209, 250, 23);

        JComboBox sta_input = new JComboBox();
        sta_input.setModel(new DefaultComboBoxModel(new String[] {"Active", "In - active"}));
        sta_input.setFont(new Font("Tahoma", Font.BOLD, 12));
        sta_input.setBounds(620, 158, 250, 23);

        update = new JButton("Update");
        update.setFont(new Font("Tahoma", Font.BOLD, 12));
        update.setBackground(Color.GREEN);
        update.setBounds(440, 339, 78, 23);

        exit = new JButton("Exit");
        exit.setFont(new Font("Tahoma", Font.BOLD, 12));
        exit.setBackground(Color.pink);
        exit.setBounds(800, 350, 70, 15);


        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 0, 917, 394);
        panel_2.setLayout(null);
        panel_2.add(lblBasicSalary);
        panel_2.add(birth_input);
        panel_2.add(lblId);
        panel_2.add(name);
        panel_2.add(birth);
        panel_2.add(address);
        panel_2.add(phone);
        panel_2.add(position);
        panel_2.add(status);
        panel_2.add(mail);
        panel_2.add(gender);
        panel_2.add(name_input);
        panel_2.add(mail_input);
        panel_2.add(phone_input);
        panel_2.add(id_input);
        panel_2.add(gen_input);
        panel_2.add(pos_input);
        panel_2.add(add_input);
        panel_2.add(sta_input);
        panel_2.add(update);
        panel_2.add(exit);
        panel_2.add(salary_input);

        frame = new JFrame("View Profile");
        frame.setSize(920, 430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(panel_2);

       viewProController = new ViewPro_controller(this);

    }
}