package controller;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import view.AdminForm_view;
import view.Login_view;
import view.ViewProfile_view;

public class Admin_controller {
    private AdminForm_view view;
    private conn c;

    public Admin_controller(AdminForm_view view) {
        this.view = view;
        this.c = new conn();

        try {
            // Khởi tạo kết nối đến server
            Client.ClientConnection();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot connect to the server.");
            return;
        }


        view.out.addActionListener(e -> {
            view.frame.setVisible(false);
            Login_view.frame.setVisible(true);
        });

        view.xemtt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(view.xemtt);
                onLeaveClick(view.NhanVienP);
                new ViewProfile_view().setVisible(true);
                view.employee_P.setVisible(false);
            }
        });

        view.NhanVienP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(view.NhanVienP);
                onLeaveClick(view.xemtt);
                view.employee_P.setVisible(true);
            }
        });

        view.add.addActionListener(e -> {
            try {
                addEmployee();
            } catch (HeadlessException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        view.delete.addActionListener(e -> {
            try {
                deleteEmployee();
            } catch (HeadlessException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        view.update.addActionListener(e -> {
            try {
                editEmployee();
            } catch (HeadlessException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        view.search.addActionListener(e -> {
            try {
                searchEmployee();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        updateTable();
    }

    private void onClick(JPanel panel) {
        panel.setBackground(new Color(0, 0, 205));
    }

    private void onLeaveClick(JPanel panel) {
        panel.setBackground(Color.BLACK);
    }

    private void updateTable() {

        try {
            Connection connection  = c.con;
            ResultSet resultSet = connection.createStatement().executeQuery("select * from employee");
            view.table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void clearFields() {
        view.id_input.setText("");
        view.name_input.setText("");
        view.gen_input.setSelectedItem(null);
        view.birth_input.setDate(null);
        view.pos_input.setText("");
        view.sta_input.setSelectedItem(null);
        view.mail_input.setText("");
        view.address_input.setText("");
        view.phone_input.setText("");
        view.salary_input.setText("");
    }

    private void addEmployee() throws HeadlessException, IOException {
        String id = view.id_input.getText();
        String name = view.name_input.getText();
        String gen = (String) view.gen_input.getSelectedItem();
        String dob = ((JTextField) view.birth_input.getDateEditor().getUiComponent()).getText();
        String pos = view.pos_input.getText();
        String sta = (String) view.sta_input.getSelectedItem();
        String mail = view.mail_input.getText();
        String addr = view.address_input.getText();
        String phone = view.phone_input.getText();
        String salary = view.salary_input.getText();

        if (FunctionClient.FC().check(id)) {
            JOptionPane.showMessageDialog(null, "Already have!");
        } else {
            FunctionClient.FC().AddEmployee(id, name, gen, dob, pos, sta, mail, phone, addr, salary);
            JOptionPane.showMessageDialog(null, "Successfully added");
            DefaultTableModel model = (DefaultTableModel) view.table.getModel();
            model.addRow(new Object[]{id, name, gen, dob, pos, sta, mail, phone, addr, salary});
            clearFields();
        }
    }

    private void deleteEmployee() throws HeadlessException, IOException {
        String id = view.id_input.getText();
        if (FunctionClient.FC().check(id)) {
            FunctionClient.FC().DeleteEmployee(id);
            JOptionPane.showMessageDialog(null, "Successfully deleted");
            updateTable();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Employee not found");
        }
    }

    private void editEmployee() throws HeadlessException, IOException {
        String id = view.id_input.getText();
        String name = view.name_input.getText();
        String gen = (String) view.gen_input.getSelectedItem();
        String dob = ((JTextField) view.birth_input.getDateEditor().getUiComponent()).getText();
        String pos = view.pos_input.getText();
        String sta = (String) view.sta_input.getSelectedItem();
        String mail = view.mail_input.getText();
        String addr = view.address_input.getText();
        String phone = view.phone_input.getText();
        String salary = view.salary_input.getText();

        if (FunctionClient.FC().check(id)) {
            FunctionClient.FC().EditEmployee(id, name, gen, dob, pos, sta, mail, phone, addr, salary);
            JOptionPane.showMessageDialog(null, "Successfully updated");
            updateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Employee not found");
        }
    }

    private void searchEmployee() throws IOException {
        String id = view.id_input.getText();
        String data = FunctionClient.FC().SearchEmployee(id);



            if (data != null) {
                String[] parts = data.split("//");
                view.name_input.setText(parts[0]);
                view.gen_input.setSelectedItem(parts[1]);
                ((JTextField) view.birth_input.getDateEditor().getUiComponent()).setText(parts[2]);
                view.pos_input.setText(parts[3]);
                view.sta_input.setSelectedItem(parts[4]);
                view.mail_input.setText(parts[5]);
                view.phone_input.setText(parts[6]);
                view.address_input.setText(parts[7]);
                view.salary_input.setText(parts[8]);
            }
            else {
                JOptionPane.showMessageDialog(null, "Employee not found");
            }

    }
}
