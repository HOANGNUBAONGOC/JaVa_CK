package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class AdminForm_view extends JFrame  {

    JFrame frame;
    JLabel user;
    JLabel NVname;
    JLabel NVposition;
    JPanel xemtt;
    JPanel controllP;
    JPanel NhanVienP;
    JTable table;
    JTextField textField;
    JButton out;



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AdminForm_view();
			}
		});
    }




    public AdminForm_view() {

        frame = new JFrame();
        frame.setSize(1189, 625);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.setBackground(new Color(0, 0, 64));
        panel.setBounds(0, 0, 195, 588);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        Logo user = new Logo("icon/user_1.png");
        user.setBounds(62, 10, 72, 87);
        user.setLogo();
        panel.add(user);

        NVname = new JLabel("ADMIN");
        NVname.setHorizontalAlignment(SwingConstants.CENTER);
        NVname.setForeground(new Color(0, 255, 64));
        NVname.setBackground(new Color(0, 255, 64));
        NVname.setFont(new Font("Tahoma", Font.BOLD, 14));
        NVname.setBounds(43, 93, 106, 36);
        panel.add(NVname);

        NVposition = new JLabel("boss");
        NVposition.setForeground(new Color(255, 255, 255));
        NVposition.setFont(new Font("Tahoma", Font.BOLD, 13));
        NVposition.setBackground(new Color(0, 255, 64));
        NVposition.setBounds(76, 124, 46, 29);
        panel.add(NVposition);

        xemtt = new JPanel();
        xemtt.setForeground(new Color(255, 255, 255));
        xemtt.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
        xemtt.setBackground(new Color(0, 0, 0));
        xemtt.setBounds(23, 163, 146, 36);
        panel.add(xemtt);
        xemtt.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Profile");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(0, 0, 146, 36);
        xemtt.add(lblNewLabel);

        controllP = new JPanel();
        controllP.setBackground(new Color(0, 0, 0));
        controllP.setBounds(0, 226, 195, 76);
        panel.add(controllP);
        controllP.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Dashboard");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBounds(65, 50, 83, 16);
        controllP.add(lblNewLabel_1);

        Logo logo = new Logo("icon/dashboard.png");
        logo.setBounds(77, 10, 53, 33);
        controllP.add(logo);
        logo.setLogo();



        NhanVienP = new JPanel();
        NhanVienP.setLayout(null);
        NhanVienP.setBackground(Color.BLACK);
        NhanVienP.setBounds(0, 299, 195, 76);
        panel.add(NhanVienP);

        JLabel lblNewLabel_1_1 = new JLabel("Employee");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1_1.setBounds(62, 50, 73, 16);
        NhanVienP.add(lblNewLabel_1_1);

        Logo employ = new Logo("/icon/employee.png");
        employ.setBounds(76, 10, 45, 41);
        NhanVienP.add(employ);
        employ.setLogo();

        out = new JButton("LOG OUT");
        out.setBackground(new Color(255, 255, 255));
        out.setFont(new Font("Tahoma", Font.BOLD, 14));
        out.setBounds(49, 506, 100, 36);
        panel.add(out);

        JPanel CenterPanel = new JPanel();
        CenterPanel.setBounds(195, 0, 980, 588);
        frame.getContentPane().add(CenterPanel);
        CenterPanel.setLayout(new CardLayout(0, 0));

        final JPanel dashboard_P = new JPanel();
        dashboard_P.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
        dashboard_P.setBackground(new Color(225, 255, 255));
        CenterPanel.add(dashboard_P, "name_88282446278000");
        dashboard_P.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("EMPLOYEE MANAGEMENT");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
        lblNewLabel_2.setBounds(166, 23, 719, 66);
        dashboard_P.add(lblNewLabel_2);

        JPanel addP = new JPanel();
        addP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
        addP.setBackground(new Color(255, 255, 255));
        addP.setBounds(66, 194, 176, 124);
        dashboard_P.add(addP);
        addP.setLayout(null);

        Logo addimg = new Logo("icon/add.png");
        addimg.setBounds(0, 2, 176, 84);
        NhanVienP.add(addimg);
        addimg.setLogo();

        JLabel lblNewLabel_4 = new JLabel("Add Employee");
        lblNewLabel_4.setForeground(new Color(0, 255, 0));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4.setBounds(29, 86, 137, 39);
        addP.add(lblNewLabel_4);

        JPanel updateP = new JPanel();
        updateP.setLayout(null);
        updateP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
        updateP.setBackground(Color.WHITE);
        updateP.setBounds(290, 194, 176, 124);
        dashboard_P.add(updateP);

        Logo lblNewLabel_3_1 = new Logo("icon/update.png");
        lblNewLabel_3_1.setIcon(new ImageIcon(AdminForm_view.class.getResource("/icon/update.png")));
        lblNewLabel_3_1.setBounds(0, 0, 173, 84);
        lblNewLabel_3_1.setLogo();
        updateP.add(lblNewLabel_3_1);

        JLabel lblNewLabel_4_1 = new JLabel("Update information");
        lblNewLabel_4_1.setForeground(new Color(0, 0, 255));
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4_1.setBounds(10, 94, 163, 27);
        updateP.add(lblNewLabel_4_1);

        JPanel deleteP = new JPanel();
        deleteP.setLayout(null);
        deleteP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
        deleteP.setBackground(Color.WHITE);
        deleteP.setBounds(517, 194, 176, 124);
        dashboard_P.add(deleteP);

        Logo deleteimg = new Logo("/icon/delete.png");
        deleteimg.setBounds(0, 2, 176, 84);
        NhanVienP.add(deleteimg);
        deleteimg.setLogo();

        JLabel lblNewLabel_4_2 = new JLabel("Delete Employee");
        lblNewLabel_4_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_4_2.setBounds(21, 94, 145, 30);
        deleteP.add(lblNewLabel_4_2);

        final JPanel employee_P = new JPanel();
        CenterPanel.add(employee_P, "name_88290729116700");
        employee_P.setLayout(null);

        table = new JTable();
        table.setRowSelectionAllowed(false);
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "ID", "Full name", "Gender", "Day of birth", "Position", "Status", "Email", "Phone number", "Address", "Salary"
                }
        ) {
            Class[] columnTypes = new Class[] {
                    Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(7).setPreferredWidth(83);
        table.getColumnModel().getColumn(8).setResizable(false);
        table.setBounds(0, 0, 980, 523);
        employee_P.add(table);

        JPanel menu = new JPanel();
        menu.setBackground(new Color(222, 222, 222));
        menu.setBounds(0, 522, 980, 66);
        employee_P.add(menu);
        menu.setLayout(null);

        JLabel lblNewLabel_5 = new JLabel("Input ID");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_5.setBounds(32, 22, 61, 22);
        menu.add(lblNewLabel_5);

        textField = new JTextField();
        textField.setBounds(117, 25, 140, 19);
        menu.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setBackground(new Color(0, 255, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(778, 23, 78, 21);
        menu.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Delete");
        btnNewButton_1.setBackground(new Color(255, 0, 0));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton_1.setBounds(866, 23, 89, 21);
        menu.add(btnNewButton_1);

        // sự kiện click chuột
        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(xemtt);
                onLeaveClick(controllP);
                onLeaveClick(NhanVienP);
            }
        });

        controllP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(controllP);
                onLeaveClick(xemtt);
                onLeaveClick(NhanVienP);

                dashboard_P.setVisible(true);
                employee_P.setVisible(false);
            }
        });

        NhanVienP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(NhanVienP);
                onLeaveClick(controllP);
                onLeaveClick(xemtt);

                employee_P.setVisible(true);
                dashboard_P.setVisible(false);
            }
        });

        out.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
    }

    // click chuột
    public void onClick(JPanel panel) {
        panel.setBackground(new Color(0, 0, 205));
    }

    public void onLeaveClick(JPanel panel) {
        panel.setBackground(Color.black);
    }

}
