package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.AdminForm_view;
import view.EmployeeForm_view;
import view.Login_view;

public class Login_controller {
    private Login_view logview;
    conn c;
    Employee_controller emContr;
    public Login_controller(Login_view logview) {
        this.logview = logview;
        this.c = c;
        this.emContr = emContr;

        logview.employee.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(logview.employee);
                onLeaveClick(logview.admin);

                logview.empimg.setVisible(true);
                logview.admin_img.setVisible(false);
            }
        });

        logview.admin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(logview.admin);
                onLeaveClick(logview.employee);

                logview.admin_img.setVisible(true);
                logview.empimg.setVisible(false);
            }
        });

        logview.login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    authenticateUser();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    // Đăng nhập
    private void authenticateUser() throws IOException {
        String id = logview.ID.getText();
        String username = logview.user.getText();
        String password = new String(logview.pass.getPassword());

        if (id.isEmpty() || username.isEmpty() || password.isEmpty()) {
            showMessage("Please enter ID, username, and password");
            return;
        }

        try {
            // Đăng ký driver
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useUnicode=yes&characterEncoding=UTF-8", "root", "");\
            String data = FunctionClient.FC().LoginUser(id, username, password);

            if (data != null) {

                if ("admin".equals(data)) {
                    AdminForm_view adview = new AdminForm_view();
                    adview.setVisible(true);
                } else if ("employee".equals(data)) {
                    EmployeeForm_view empView = new EmployeeForm_view();
                    empView.setVisible(true);
                    emContr = new Employee_controller(empView);
                    emContr.authenticateUser(id);
                }

                logview.frame.setVisible(false);
            } else {
                showMessage("Invalid ID, username, or password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onClick(JPanel panel) {
        panel.setBackground(new Color(43, 85, 85));
    }

    public void onLeaveClick(JPanel panel) {
        panel.setBackground(new Color(64, 128, 128));
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(logview.frame, message);
    }
}

