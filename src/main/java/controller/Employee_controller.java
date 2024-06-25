package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.EmployeeForm_view;
import view.Login_view;
import view.ViewProfile_view;

public class Employee_controller {
    EmployeeForm_view emView;
    conn c;

    public Employee_controller(final EmployeeForm_view emView) {
        this.emView = emView;
        this.c = new conn();

        try {
            // Khởi tạo kết nối đến server
            Client.ClientConnection();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot connect to the server.");
            return;
        }

        // Sự kiện click chuột
        emView.out.addActionListener(e -> {
            emView.frame.setVisible(false);
            Login_view.frame.setVisible(true);
        });

        emView.xemtt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(emView.xemtt);
                onLeaveClick(emView.NhanVienP);

                new ViewProfile_view().setVisible(true);
                emView.employee_P.setVisible(false);
            }
        });

        emView.NhanVienP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(emView.NhanVienP);
                onLeaveClick(emView.xemtt);

                emView.employee_P.setVisible(true);
            }
        });

        emView.search.addActionListener(e -> {
            try {
                searchEmployee();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
    }

    private void searchEmployee() throws IOException {
        String id = emView.id_input.getText();
        String data = FunctionClient.FC().SearchEmployee(id);
        
            if (data != null) {
                String[] parts = data.split("//");
                emView.name_input.setText(parts[0]);
                emView.gen_input.setSelectedItem(parts[1]);
                ((JTextField) emView.birth_input.getDateEditor().getUiComponent()).setText(parts[2]);
                emView.pos_input.setText(parts[3]);
                emView.sta_input.setSelectedItem(parts[4]);
                emView.mail_input.setText(parts[5]);
                emView.phone_input.setText(parts[6]);
                emView.address_input.setText(parts[7]);
                emView.salary_input.setText(parts[8]);
            } else {
                JOptionPane.showMessageDialog(null, "Employee not found");
            }
        }
    

    private void onClick(JPanel panel) {
        panel.setBackground(new Color(0, 0, 205));
    }

    private void onLeaveClick(JPanel panel) {
        panel.setBackground(Color.BLACK);
    }

    public void authenticateUser(String id) throws SQLException, IOException {
        String data = FunctionClient.FC().GetNamePosition(id);
        String[] parts = data.split("//");
        String name = parts[0];
        String position = parts[1];
        updateEmployeeInfo(name, position);
        emView.frame.setVisible(true);
        
    }

    public void updateEmployeeInfo(String name, String position) {
        emView.NVname.setText(name);
        emView.NVposition.setText(position);
    }
}
