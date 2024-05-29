package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signin_view {

    private JFrame frame;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField;
    private JPanel menu;
    private CardLayout cardLayout;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Signin_view window = new Signin_view();
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
    public Signin_view() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setSize(367, 539);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        final JPanel employeeP = new JPanel();
        employeeP.setBounds(175, 0, 178, 33);
        frame.getContentPane().add(employeeP);
        employeeP.setBackground(new Color(64, 128, 128));
        employeeP.setLayout(null);

        JLabel lblNewLabel_1_1 = new JLabel("Employee");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(21, 0, 97, 28);
        employeeP.add(lblNewLabel_1_1);

        final JPanel adminP = new JPanel();
        adminP.setBounds(0, 0, 176, 33);
        frame.getContentPane().add(adminP);
        adminP.setBackground(new Color(64, 128, 128));
        adminP.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Admin");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(99, 0, 77, 28);
        adminP.add(lblNewLabel_1);

        menu = new JPanel();
        menu.setBounds(0, 33, 357, 469);
        frame.getContentPane().add(menu);
        cardLayout = new CardLayout(0, 0);
        menu.setLayout(cardLayout);

        JPanel employee = new JPanel();
        employee.setLayout(null);
        employee.setBackground(Color.WHITE);
        menu.add(employee, "employee");

        JLabel user_1 = new JLabel("UserName/ID");
        user_1.setForeground(new Color(23, 111, 111));
        user_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        user_1.setBounds(30, 144, 102, 26);
        employee.add(user_1);

        JLabel pass_1 = new JLabel("Password");
        pass_1.setForeground(new Color(23, 111, 111));
        pass_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        pass_1.setBounds(30, 243, 102, 26);
        employee.add(pass_1);

        JButton login_1 = new JButton("LOG IN");
        login_1.setForeground(new Color(64, 128, 128));
        login_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        login_1.setBackground(new Color(179, 217, 217));
        login_1.setBounds(86, 381, 182, 33);
        employee.add(login_1);

        TextField user_input_1 = new TextField();
        user_input_1.setFont(new Font("Arial", Font.PLAIN, 16));
        user_input_1.setBackground(new Color(235, 235, 235));
        user_input_1.setBounds(40, 186, 280, 33);
        employee.add(user_input_1);

        passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField_1.setBackground(new Color(235, 235, 235));
        passwordField_1.setBounds(40, 295, 280, 33);
        employee.add(passwordField_1);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(new Color(64, 128, 128));
        panel_1_1.setBounds(0, 0, 357, 118);
        employee.add(panel_1_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Signin_view.class.getResource("/icon/profile.png")));
        lblNewLabel_2.setBounds(142, 10, 69, 84);
        panel_1_1.add(lblNewLabel_2);

        JPanel admin = new JPanel();
        admin.setLayout(null);
        admin.setBackground(Color.WHITE);
        menu.add(admin, "admin");

        JLabel pass_1_1 = new JLabel("Password");
        pass_1_1.setForeground(new Color(23, 111, 111));
        pass_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        pass_1_1.setBounds(28, 153, 102, 26);
        admin.add(pass_1_1);

        JButton login_1_1 = new JButton("LOG IN");
        login_1_1.setForeground(new Color(64, 128, 128));
        login_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        login_1_1.setBackground(new Color(179, 217, 217));
        login_1_1.setBounds(86, 381, 182, 33);
        admin.add(login_1_1);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setBackground(new Color(235, 235, 235));
        passwordField.setBounds(44, 201, 280, 33);
        admin.add(passwordField);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(64, 128, 128));
        panel_1_1_1.setBounds(0, 0, 357, 123);
        admin.add(panel_1_1_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Signin_view.class.getResource("/icon/boss.png")));
        lblNewLabel.setBounds(109, 0, 135, 123);
        panel_1_1_1.add(lblNewLabel);

        adminP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onclick(adminP);
                onLeaveclick(employeeP);
                cardLayout.show(menu, "admin");
            }
        });

        employeeP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onclick(employeeP);
                onLeaveclick(adminP);
                cardLayout.show(menu, "employee");
            }
        });
    }

    public void onclick(JPanel panel) {
        panel.setBackground(new Color(43, 85, 85));
    }

    public void onLeaveclick(JPanel panel) {
        panel.setBackground(new Color(64, 128, 128));
    }
}
