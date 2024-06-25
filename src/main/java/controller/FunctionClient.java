package controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class FunctionClient {
    public static FunctionClient FC(){
        return new FunctionClient();
    }

    public String LoginUser (String id , String username , String password) throws IOException {
        Client.out_to_server.println("Login" + "//" + id.trim() + "//" + username.trim() + "//" + password.trim());
        String response = Client.in_from_server.readLine();
        System.out.println("Client get response: " + "Login");
        return response;
    }

    public String GetNamePosition (String id ) throws IOException {
        Client.out_to_server.println("NamePosition" + "//" + id.trim());
        String response = Client.in_from_server.readLine();
        System.out.println("Client get response: " + "NamePosition");
        return response;
    }
    public String AddEmployee (String id , String name , String gen , String dob , String pos , String sta , String mail , String phone, String addr , String salary) throws IOException {
        Client.out_to_server.println("AddEmployee" + "//" + id.trim() + "//" + name.trim() + "//" + gen.trim() + "//" + dob.trim() + "//" + pos.trim() + "//" + sta.trim() + "//" + mail.trim() + "//" + phone.trim() + "//" + addr.trim() + "//" + salary.trim());
        String response = Client.in_from_server.readLine();
        System.out.println("Client get response: " + "AddEmployee");
        return response;
    }
    public Boolean check(String id) throws IOException {
        Client.out_to_server.println("check" + "//" + id.trim());
        String response = Client.in_from_server.readLine();
        System.out.println("Client get response: " + "check");
        return Boolean.parseBoolean(response.trim());
    }
    public void DeleteEmployee(String id) throws IOException {
        Client.out_to_server.println("DeleteEmployee" + "//" + id.trim());
        System.out.println("Client get response: " + "DeleteEmployee");
    }
    public void EditEmployee(String id, String name, String gen, String dob, String pos, String sta, String mail, String phone, String addr, String salary) throws IOException {
        Client.out_to_server.println("EditEmployee" + "//" + id.trim() + "//" + name.trim() + "//" + gen.trim() + "//" + dob.trim() + "//" + pos.trim() + "//" + sta.trim() + "//" + mail.trim() + "//" + phone.trim() + "//" + addr.trim() + "//" + salary.trim());
        System.out.println("Client get response: " + "EditEmployee");
    }
    public String SearchEmployee(String id) throws IOException {
        Client.out_to_server.println("SearchEmployee" + "//" + id.trim());
        String response = Client.in_from_server.readLine();
        System.out.println("Client get response: " + "SearchEmployee");
        return response;
    }



}

