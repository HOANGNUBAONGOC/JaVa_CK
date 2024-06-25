package controller;

import view.Login_view;
import view.ViewProfile_view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPro_controller {
    private ViewProfile_view viewv;

   public ViewPro_controller (ViewProfile_view viewv){
       this.viewv = viewv;

       viewv.exit.addActionListener(e -> viewv.frame.dispose());

   }


}
