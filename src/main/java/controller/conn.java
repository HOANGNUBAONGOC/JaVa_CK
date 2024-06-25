package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    public Statement stmt;
    public Connection con;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?useUnicode=yes&characterEncoding=UTF-8", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(String id, String name, String gen, String dob, String pos, String sta, String mail, String phone, String addr, String salary) {
        String query = "INSERT INTO employee(ID, FullName, Gender, DateOfBirth, Position, Status, Email, PhoneNumber, Address, Salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ptsm = con.prepareStatement(query);
            ptsm.setString(1, id);
            ptsm.setString(2, name);
            ptsm.setString(3, gen);
            ptsm.setString(4, dob);
            ptsm.setString(5, pos);
            ptsm.setString(6, sta);
            ptsm.setString(7, mail);
            ptsm.setString(8, phone);
            ptsm.setString(9, addr);
            ptsm.setString(10, salary);
            int rowsAffected = ptsm.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Successfully");

            } else {
                System.out.println("Error. \\nFaided!");
            }
            con.close();
        }
        catch(Exception E) {
            E.printStackTrace();

        }
    }

    public void deleteEmployee(String id) {
        String query = "DELETE FROM employee WHERE ID = ?";
        DatabaseUtils.executeSQL(ptsm -> ptsm.setString(1, id), query, con);
    }

    public void editEmployee(String id, String name, String gen, String dob, String pos, String sta, String mail, String phone, String addr, String salary) {
        String query = "UPDATE employee SET FullName = ?, Gender = ?, DateOfBirth = ?, Position = ?, Status = ?, Email = ?, PhoneNumber = ?, Address = ?, Salary = ? WHERE ID = ?";
        DatabaseUtils.executeSQL(ptsm -> {
            ptsm.setString(1, name);
            ptsm.setString(2, gen);
            ptsm.setString(3, dob);
            ptsm.setString(4, pos);
            ptsm.setString(5, sta);
            ptsm.setString(6, mail);
            ptsm.setString(7, phone);
            ptsm.setString(8, addr);
            ptsm.setString(9, salary);
            ptsm.setString(10, id);
        }, query, con);
    }

    public String searchEmployee(String id) {
        String data = null;
        String query = "SELECT * FROM employee WHERE ID = ?";
        ResultSet rs = DatabaseUtils.executeQuery(ptsm -> {
            try {
                ptsm.setString(1, id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }, query, con);
        if (rs != null) {
            try {
                if (rs.next()) { // Fixed the syntax error here
                    String name = rs.getString("FullName");
                    String gen = rs.getString("Gender");
                    String dob = rs.getString("DateOfBirth");
                    String pos = rs.getString("Position");
                    String sta = rs.getString("Status");
                    String mail = rs.getString("Email");
                    String phone = rs.getString("PhoneNumber");
                    String addr = rs.getString("Address");
                    String salary = rs.getString("Salary");
                    data = name + "//" + gen + "//" + dob + "//" + pos + "//" + sta + "//" + mail + "//" + phone + "//" + addr + "//" + salary;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
    public boolean check(String id) {
        try {
            String query = "SELECT * FROM employee WHERE ID = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet resultSet = pstmt.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
