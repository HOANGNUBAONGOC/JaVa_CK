package view;

import com.toedter.calendar.JDateChooser;
import controller.Admin_controller;
import controller.conn;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;


public class AdminForm_view extends JFrame {
    private Admin_controller adminController;


    public JFrame frame;
    public JLabel NVname;
    public JLabel NVposition;
    public JPanel xemtt;
    public JPanel NhanVienP;
    public JPanel employee_P;
    public JButton out, search, delete, update;
    public JTable table;
    public JTextField name_input;
    public JDateChooser birth_input;
    public JTextField mail_input;
    public JTextField phone_input;
    public JTextField id_input;
    public JTextField pos_input;
    public JTextField address_input;
    public JTextField salary_input;
    public JComboBox gen_input, sta_input;
    public JButton add;
    public Choice choiceEmp;

    public AdminForm_view() {

        table = new JTable();
        table.setBounds(0, 0, 980, 367);
        JScrollPane p = new JScrollPane(table);
        p.setBounds(0, 0, 1091, 366);

        try {
            conn c = new conn();
            Connection connection  = c.con;
            ResultSet resultSet = connection.createStatement().executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblNewLabel = new JLabel("Add Employee");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(26, 10, 170, 33);

        JLabel id = new JLabel("ID");
        id.setFont(new Font("Tahoma", Font.BOLD, 12));
        id.setBounds(76, 21, 35, 23);

        id_input = new JTextField();
        id_input.setBounds(176,10,150,20);


        JLabel name = new JLabel("Full Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 12));
        name.setBounds(76, 54, 98, 23);

        JLabel birth = new JLabel("Date of Birth");
        birth.setFont(new Font("Tahoma", Font.BOLD, 12));
        birth.setBounds(265, 87, 88, 23);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Tahoma", Font.BOLD, 12));
        address.setBounds(620, 124, 73, 23);

        JLabel phone = new JLabel("Phone Number");
        phone.setFont(new Font("Tahoma", Font.BOLD, 12));
        phone.setBounds(76, 157, 98, 28);

        JLabel position = new JLabel("Position");
        position.setFont(new Font("Tahoma", Font.BOLD, 12));
        position.setBounds(620, 54, 73, 23);
        JLabel status = new JLabel("Status");
        status.setFont(new Font("Tahoma", Font.BOLD, 12));
        status.setBounds(620, 87, 59, 23);

        JLabel mail = new JLabel("Email");
        mail.setFont(new Font("Tahoma", Font.BOLD, 12));
        mail.setBounds(76, 124, 59, 23);

        name_input = new JTextField();
        name_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        name_input.setColumns(10);
        name_input.setBounds(185, 54, 322, 23);
        birth_input = new JDateChooser();
        birth_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        birth_input.setBounds(351, 87, 156, 23);

        mail_input = new JTextField();
        mail_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        mail_input.setColumns(10);
        mail_input.setBounds(185, 124, 322, 23);

        phone_input = new JTextField();
        phone_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        phone_input.setColumns(10);
        phone_input.setBounds(185, 160, 322, 23);

        id_input = new JTextField();
        id_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        id_input.setColumns(10);
        id_input.setBounds(185, 21, 73, 23);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.BOLD, 12));
        gender.setBounds(76, 87, 43, 23);

        gen_input = new JComboBox();
        gen_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        gen_input.setModel(new DefaultComboBoxModel(new String[]{"Male", "Female"}));
        gen_input.setBounds(185, 88, 73, 21);

        pos_input = new JTextField();
        pos_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        pos_input.setColumns(10);
        pos_input.setBounds(703, 54, 307, 23);

        address_input = new JTextField();
        address_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        address_input.setColumns(10);
        address_input.setBounds(703, 127, 307, 23);

        sta_input = new JComboBox();
        sta_input.setModel(new DefaultComboBoxModel(new String[] {"Active", "In - Active"}));
        sta_input.setFont(new Font("Tahoma", Font.BOLD, 12));
        sta_input.setBounds(703, 89, 173, 21);

        salary_input = new JTextField();
        salary_input.setFont(new Font("Tahoma", Font.PLAIN, 12));
        salary_input.setColumns(10);
        salary_input.setBounds(703, 160, 307, 23);

        JLabel lblBasicSalary = new JLabel("Salary");
        lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblBasicSalary.setBounds(620, 160, 59, 23);

        NVname = new JLabel("ADMIN");
        NVname.setHorizontalAlignment(SwingConstants.CENTER);
        NVname.setForeground(new Color(0, 255, 64));
        NVname.setFont(new Font("Tahoma", Font.BOLD, 14));
        NVname.setBounds(43, 93, 106, 36);

        NVposition = new JLabel("boss");
        NVposition.setForeground(Color.WHITE);
        NVposition.setFont(new Font("Tahoma", Font.BOLD, 13));
        NVposition.setBounds(76, 124, 46, 29);

        xemtt = new JPanel();
        xemtt.setForeground(Color.WHITE);
        xemtt.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
        xemtt.setBackground(Color.BLACK);
        xemtt.setBounds(23, 163, 146, 36);
        xemtt.setLayout(null);

        JLabel lblViewProfile = new JLabel("View Profile");
        lblViewProfile.setHorizontalAlignment(SwingConstants.CENTER);
        lblViewProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblViewProfile.setForeground(Color.WHITE);
        lblViewProfile.setBounds(0, 0, 146, 36);
        xemtt.add(lblViewProfile);

        JLabel lblEmployee = new JLabel("Employee");
        lblEmployee.setForeground(Color.WHITE);
        lblEmployee.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblEmployee.setBounds(62, 50, 73, 16);

        out = new JButton("LOG OUT");
        out.setBackground(Color.WHITE);
        out.setFont(new Font("Tahoma", Font.BOLD, 14));
        out.setBounds(49, 506, 100, 36);

        System.out.println(getClass().getResource("/icon/user.png"));
        ImageIcon userimg1 = new ImageIcon("src/main/resources/icon/user.png");
        Image userimg2 = userimg1.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
        ImageIcon userimg3 = new ImageIcon(userimg2);
        JLabel img = new JLabel(userimg3);
        img.setBounds(65, 19, 64, 64);
        img.setIcon(userimg3);
        img.setVisible(true);

//        System.out.println(getClass().getResource("/icon/profile.png"));
//        ImageIcon profile1 = new ImageIcon("src/main/resources/icon/profile.png");
//        Image profile2 = profile1.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
//        ImageIcon profile3 = new ImageIcon(profile2);
//        JLabel profileimg = new JLabel(profile3);
//        profileimg.setBounds(62, 19, 64, 64);
//        profileimg.setIcon(profile3);
//        profileimg.setVisible(true);

        System.out.println(getClass().getResource("/icon/employee.png"));
        ImageIcon e1 = new ImageIcon("src/main/resources/icon/employee.png");
        Image e2 = e1.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT);
        ImageIcon e3 = new ImageIcon(e2);
        JLabel eimg = new JLabel(e3);
        eimg.setBounds(80, 10, 32, 32);
        eimg.setIcon(e3);
        eimg.setVisible(true);

        search = new JButton("Search");
        search.setBackground(new Color(0, 255, 0));
        search.setFont(new Font("Tahoma", Font.BOLD, 12));
        search.setBounds(38, 11, 78, 21);

        delete = new JButton("Delete");
        delete.setBackground(new Color(255, 0, 0));
        delete.setFont(new Font("Tahoma", Font.BOLD, 12));
        delete.setBounds(981, 11, 89, 21);

        add = new JButton("Add");
        add.setFont(new Font("Tahoma", Font.BOLD, 12));
        add.setBackground(new Color(255, 255, 0));
        add.setBounds(779, 11, 78, 21);

        update = new JButton("Update");
        update.setFont(new Font("Tahoma", Font.BOLD, 12));
        update.setBackground(new Color(0, 0, 255));
        update.setBounds(878, 11, 78, 21);

        NhanVienP = new JPanel();
        NhanVienP.setBackground(Color.BLACK);
        NhanVienP.setBounds(0, 246, 195, 76);
        NhanVienP.setLayout(null);
        NhanVienP.add(lblEmployee);
        NhanVienP.add(eimg);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.setBackground(new Color(0, 0, 64));
        panel.setBounds(0, 0, 195, 609);
        panel.setLayout(null);
        panel.add(NVname);
        panel.add(NVposition);
        panel.add(xemtt);
        panel.add(out);
        panel.add(NhanVienP);
        panel.add(img);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(222, 222, 222));
        panel_1.setBounds(0, 565, 1091, 44);
        panel_1.setLayout(null);
        panel_1.add(delete);
        panel_1.add(search);
        panel_1.add(update);
        panel_1.add(add);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 364, 1091, 202);
        panel_2.setLayout(null);

        panel_2.add(lblBasicSalary);
        panel_2.add(salary_input);
        panel_2.add(id);
        panel_2.add(name);
        panel_2.add(birth);
        panel_2.add(address);
        panel_2.add(phone);
        panel_2.add(position);
        panel_2.add(status);
        panel_2.add(mail);
        panel_2.add(gender);
        panel_2.add(name_input);
        panel_2.add(birth_input);
        panel_2.add(mail_input);
        panel_2.add(phone_input);
        panel_2.add(id_input);
        panel_2.add(gen_input);
        panel_2.add(pos_input);
        panel_2.add(address_input);
        panel_2.add(sta_input);

        employee_P = new JPanel();
        employee_P.setLayout(null);
        employee_P.add(panel_1);
        employee_P.add(p);
        employee_P.add(panel_2);

        JPanel CenterPanel = new JPanel();
        CenterPanel.setBounds(195, 0, 1091, 609);
        CenterPanel.setLayout(new CardLayout(0, 0));
        CenterPanel.add(employee_P, "name_88290729116700");

        frame = new JFrame();
        frame.setSize(1300, 646);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().add(panel);
        frame.getContentPane().add(CenterPanel);

        adminController = new Admin_controller(this);

    }
}