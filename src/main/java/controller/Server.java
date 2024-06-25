package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.OutputStreamWriter;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(new ClientHandler(clientSocket));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    public ClientHandler(Socket clientSocket) throws IOException  {

        this.clientSocket = clientSocket;
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
    }

    @Override
    public void run() {
        try {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                String parts []= inputLine.split("//");
                String key = parts[0];
                if (key.equals("Login")) {
                    String role = null;
                    String id = parts[1];
                    String username = parts[2];
                    String password = parts[3];
                    conn c = new conn();
                    Connection connection  = c.con;
                    String query = "SELECT role FROM signin WHERE ID = ? AND NAME = ? AND PASS = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, id);
                    preparedStatement.setString(2, username);
                    preparedStatement.setString(3, password);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        role = resultSet.getString("role");
                        }
                    connection.close();
                    out.println(role);

                } else if (key.equals("NamePosition") ){
                    String id = parts[1];
                    conn c = new conn();
                    Connection connection  = c.con;
                    String query = "SELECT FullName, Position FROM employee WHERE ID = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    String name = null;
                    String position = null;
                    if (resultSet.next()) {
                        name = resultSet.getString("FullName");
                        position = resultSet.getString("Position");
                    }
                    connection.close();
                    out.println(name + "//" + position);
                }   else if(key.equals("AddEmployee")) {
                    String id = parts[1];
                    String name = parts[2];
                    String gen = parts[3];
                    String dob = parts[4];
                    String pos = parts[5];
                    String sta = parts[6];
                    String mail = parts[7];
                    String phone = parts[8];
                    String addr = parts[9];
                    String salary = parts[10];
                    conn c = new conn();
                    c.addEmployee(id, name, gen, dob, pos, sta, mail, phone, addr, salary);
                    out.println("Successfully added");
                } else if(key.equals("DeleteEmployee")) {
                    String id = parts[1];
                    conn c = new conn();
                    c.deleteEmployee(id);
                } else if(key.equals("EditEmployee")) {
                    String id = parts[1];
                    String name = parts[2];
                    String gen = parts[3];
                    String dob = parts[4];
                    String pos = parts[5];
                    String sta = parts[6];
                    String mail = parts[7];
                    String phone = parts[8];
                    String addr = parts[9];
                    String salary = parts[10];
                    conn c = new conn();
                    c.editEmployee(id, name, gen, dob, pos, sta, mail, phone, addr, salary);
                } else if(key.equals("SearchEmployee")) {
                    String id = parts[1];
                    conn c = new conn();
                    String rs = c.searchEmployee(id);
                    out.println(rs);

                } else if (key.equals("check")){
                    String id = parts[1];
                    conn c = new conn();
                    boolean check = c.check(id);
                    out.println(check);
                }




                else {
                    System.out.println("Invalid key: " + key);
                }
            }
        } catch (IOException | SQLException e) {
            System.err.println("Error reading from client: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeEverything();
        }
    }

    private void closeEverything() {
        System.out.println("Closing connection to client");
        try {
            if (out != null)
                out.close();
            if (in != null)
                in.close();
            if (clientSocket != null)
                clientSocket.close();
        } catch (IOException e) {
            System.err.println("Error closing streams or socket: " + e.getMessage());
        }
    }
}
