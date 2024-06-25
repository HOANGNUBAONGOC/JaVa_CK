package view;
import java.io.IOException;
import controller.Client;
import view.Login_view;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() throws IOException {
        Client.ClientConnection();
        System.out.println(getClass().getResource("/icon/plash.gif"));
        ImageIcon i1 = new ImageIcon("src/main/resources/icon/plash.gif");
        Image i2 = i1.getImage().getScaledInstance(1152, 648, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1152, 648);
        add(image);
        setSize(1170,650);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login_view().frame.setVisible(true);
        }catch (Exception a){
            Client.close();
            a.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        new Splash();
    }
}
