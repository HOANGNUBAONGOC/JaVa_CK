package view;


import controller.Login_controller;

import java.awt.*;
import javax.swing.*;

public class Login_view {

    private Login_controller logcon;
    public JPanel admin, employee, panel;
    public static JFrame frame;
    public CardLayout cardLayout;
    public JTextField user;
    public JPasswordField pass;
    public JLabel admin_img;
    public JLabel empimg;
    public JTextField ID;
    public JButton login;


    public Login_view(){
        JLabel lblNewLabel_1_1 = new JLabel("Employee");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(34, 10, 118, 41);

        JLabel lblNewLabel_1 = new JLabel("Admin");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(62, 10, 77, 41);

        cardLayout = new CardLayout(0, 0);

        System.out.println(getClass().getResource("/icon/employee.png"));
        ImageIcon userimg1 = new ImageIcon("src/main/resources/icon/employee.png");
        Image userimg2 = userimg1.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
        ImageIcon userimg3 = new ImageIcon(userimg2);
        empimg = new JLabel(userimg3);
        empimg.setBounds(0, 58, 128, 128);
        empimg.setIcon(userimg3);
        empimg.setVisible(true);

        System.out.println(getClass().getResource("/icon/boss.png"));
        ImageIcon admin1 = new ImageIcon("src/main/resources/icon/boss.png");
        Image admin2 = admin1.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
        ImageIcon admin3 = new ImageIcon(admin2);
        admin_img = new JLabel(admin3);
        admin_img.setBounds(0, 58, 128, 128);
        admin_img.setIcon(userimg3);
        admin_img.setVisible(true);

        System.out.println(getClass().getResource("/icon/img.jpg"));
        ImageIcon img1 = new ImageIcon("src/main/resources/icon/img.jpg");
        Image img2 = img1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel img = new JLabel(img3);
        img.setBounds(352, 0, 501, 502);
        img.setIcon(img3);
        img.setVisible(true);

        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(31, 94, 93, 25);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPassword.setBounds(31, 129, 93, 25);

        user = new JTextField();
        user.setFont(new Font("Tahoma", Font.PLAIN, 13));
        user.setColumns(10);
        user.setBounds(142, 95, 173, 25);

        pass = new JPasswordField();
        pass.setFont(new Font("Tahoma", Font.PLAIN, 13));
        pass.setColumns(10);
        pass.setBounds(142, 130, 173, 25);

        JLabel id = new JLabel("ID");
        id.setFont(new Font("Tahoma", Font.BOLD, 15));
        id.setBounds(31, 59, 93, 25);


        ID = new JTextField();
        ID.setFont(new Font("Tahoma", Font.PLAIN, 13));
        ID.setColumns(10);
        ID.setBounds(142, 59, 173, 25);

        login = new JButton("LOG IN");
        login.setFont(new Font("Tahoma", Font.BOLD, 20));
        login.setBackground(new Color(64, 128, 128));
        login.setBounds(112, 224, 118, 40);

        JPanel form = new JPanel();
        form.setLayout(null);
        form.setBounds(0, 211, 353, 291);
        form.add(login);
        form.add(pass);
        form.add(user);
        form.add(lblPassword);
        form.add(lblNewLabel);
        form.add(id);
        form.add(ID);

        employee = new JPanel();
        employee.setBounds(175, 0, 178, 61);
        employee.setBackground(new Color(64, 128, 128));
        employee.setLayout(null);
        employee.add(lblNewLabel_1_1);

        admin = new JPanel();
        admin.setBounds(0, 0, 176, 61);
        admin.setBackground(new Color(64, 128, 128));
        admin.setLayout(null);
        admin.add(lblNewLabel_1);

        panel = new JPanel();
        panel.setBounds(0, 58, 353, 152);
        panel.setLayout(new CardLayout(0, 0));
        panel.setBackground(new Color(64, 128, 128));
        panel.add(admin_img, "name_14050283342500");
        panel.add(empimg, "name_14065731589500");

        frame = new JFrame();
        frame.setSize(867, 539);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(employee);
        frame.getContentPane().add(admin);;
        frame.getContentPane().add(panel);
        frame.getContentPane().add(img);
        frame.getContentPane().add(form);

        logcon = new Login_controller(this);
    }
}