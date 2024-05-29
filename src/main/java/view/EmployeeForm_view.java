package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import controller.HibernateUtil;
import model.Employee;

import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeForm_view extends JFrame {

    public JFrame frame;
    public JLabel user;
    public JLabel NVname;
    public JLabel NVposition;
    public JPanel xemtt;
    public JPanel NhanVienP;
    public JTable table;
    public JTextField search_input;
    
    Employee em = new Employee();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	EmployeeForm_view window = new EmployeeForm_view();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EmployeeForm_view() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setSize(1190, 625);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.setBackground(new Color(0, 0, 64));
        panel.setBounds(-8, 0, 196, 588);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        user = new JLabel("");
        user.setHorizontalAlignment(SwingConstants.CENTER);
        user.setForeground(new Color(0, 0, 0));
        user.setIcon(new ImageIcon(EmployeeForm_view.class.getResource("/icon/user1.png")));
        user.setBounds(0, 10, 195, 87);
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
        xemtt.setBounds(28, 163, 146, 36);
        panel.add(xemtt);
        xemtt.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Profile");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(0, 0, 146, 36);
        xemtt.add(lblNewLabel);

        NhanVienP = new JPanel();

        NhanVienP.setLayout(null);
        NhanVienP.setBackground(Color.BLACK);
        NhanVienP.setBounds(0, 231, 195, 76);
        panel.add(NhanVienP);

        JLabel lblNewLabel_1_1 = new JLabel("Employee");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1_1.setBounds(62, 50, 73, 16);
        NhanVienP.add(lblNewLabel_1_1);
        
        JLabel nv_img = new JLabel("");
        nv_img.setIcon(new ImageIcon(EmployeeForm_view.class.getResource("/icon/employee.png")));
        nv_img.setBounds(76, 10, 45, 41);
        NhanVienP.add(nv_img);
        
        JButton out = new JButton("LOG OUT");
       
        out.setBackground(new Color(255, 255, 255));
        out.setFont(new Font("Tahoma", Font.BOLD, 14));
        out.setBounds(49, 506, 100, 36);
        panel.add(out);
		
		JPanel employee = new JPanel();
		employee.setLayout(null);
		employee.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		employee.setBackground(UIManager.getColor("Button.background"));
		employee.setBounds(188, 0, 988, 588);
		frame.getContentPane().add(employee);
		
		table = new JTable();
		table.setBounds(0, 0, 988, 522);
		employee.add(table);
		table.setToolTipText("");
		table.setRowSelectionAllowed(false);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setBackground(new Color(238, 238, 238));
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(222, 222, 222));
		menu.setBounds(0, 522, 988, 66);
		employee.add(menu);
		menu.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Input ID");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(32, 22, 61, 22);
		menu.add(lblNewLabel_5);
		
		search_input = new JTextField();
		search_input.setBounds(117, 25, 140, 19);
		menu.add(search_input);
		search_input.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(290, 23, 78, 21);
		menu.add(btnNewButton);
		

		
		// sự kiện click chuột
        lblNewLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(xemtt);
                onLeaveClick(NhanVienP);
                
            }
        });

        NhanVienP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                onClick(NhanVienP);
                onLeaveClick(xemtt);
            }
        });
        
        out.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		Signin_view signin = new Signin_view();
        	//	signin.setVisible(true);
        		frame.dispose();
        	}
        });

    }

    // click chuột
    public void onClick(JPanel panel) {
        panel.setBackground(new Color(0,0,205));

    }

    public void onLeaveClick(JPanel panel) {
        panel.setBackground(Color.black);

    }



}