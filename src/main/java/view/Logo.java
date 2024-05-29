package view;

import javax.swing.*;
import java.awt.*;

public class Logo extends JLabel {
    ImageIcon img;
    public Logo(String imgPath){ // cú pháp Logo tên_biến_ảnh_muốn_tạo(link ảnh) -- link này là link thư mục không phải link web
        img = new ImageIcon(this.getClass().getResource(imgPath));
    }
    //    public void scale(int width, int height){ //Scale dùng để chỉnh kích thước ảnh
//        Image modifier = img.getImage();
//        img = new ImageIcon(modifier.getScaledInstance(width,height,Image.SCALE_SMOOTH));
//    }
    public void setLogo(){
        this.setIcon(img);
    } //setLogo dùng để hiện ảnh lên (bắt buộc có sau khi tạo)
}
