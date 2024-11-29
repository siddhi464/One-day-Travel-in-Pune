package minipro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class myframe4 extends JFrame{
	JButton no1 = new JButton("Continue the ride");
	JButton no2 = new JButton("Wait");
	JButton no3 = new JButton("Stop the ride");
	
	myframe4(){
		
	}
	myframe4(double total,int tm,String current, int wait, ArrayList pickup, ArrayList dropoff){
		try {
		ImageIcon image = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\tr.png");
		ImageIcon I1 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I1.jpg");
		ImageIcon I2 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I2.jpg");
		ImageIcon I3 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I3.jpg");
		ImageIcon I4 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I4.jpg");
		ImageIcon I5 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I5.jpg");
		ImageIcon I6 = new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\I6.jpg");
		
		JLabel label = new JLabel(); 
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 700);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(new Color(255,175,175));
		panel2.setBackground(new Color(255,175,175));
		panel3.setBackground(new Color(255,175,175));
		panel4.setBackground(new Color(255,175,175));
		panel5.setBackground(Color.WHITE);
		
		panel5.setLayout(new BorderLayout());
				
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(150,100));
		panel3.setPreferredSize(new Dimension(150,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		panel5.setLayout(new GridLayout(2,3,0,0));

		
		JLabel label11 = new JLabel("<html><div style='text-align: center;'>Welcome to Daily Tour Planner,<br>where planning is just a click away!<br>Pune Awaits! Are You Tour-Ready?</div></html>");
        label11.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label11.setHorizontalTextPosition(JLabel.CENTER);
        label11.setVerticalTextPosition(JLabel.TOP);
        panel1.add(label11);
        
        panel2.setLayout(new GridLayout(3,1));
        JLabel label_I1 = new JLabel(I1);
        panel2.add(label_I1);
        JLabel label_I2 = new JLabel(I2);
        panel2.add(label_I2);
        JLabel label_I6 = new JLabel(I6);
        panel2.add(label_I6);
        
        panel3.setLayout(new GridLayout(3,1));
        JLabel label_I3 = new JLabel(I3);
        panel3.add(label_I3);
        JLabel label_I5 = new JLabel(I5);
        panel3.add(label_I5);
        JLabel label_I4 = new JLabel(I4);
        panel3.add(label_I4);
        

        JLabel label5 = new JLabel("Would you like to:");
		panel5.add(label5);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(no1);
        buttonGroup.add(no2);
        buttonGroup.add(no3);

        panel5.add(no1);
      panel5.add(no2);
        panel5.add(no3);
		
            no1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String cont = "Continue";
                	ArrayList<String> places = new ArrayList<>();
                	myframe5_c obj=new myframe5_c(total, tm, current,wait,pickup,dropoff);
              
    				
                	frame.dispose();
                	
                }   
            });
            no2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String cont = "Wait";
                	
                	myfram5_w obj=new myfram5_w(total, tm, current, wait,pickup,dropoff);
                	frame.dispose();
                	
                }   
            });
            no3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String cont = "Stop";
                	myframe5_b obj=new myframe5_b( total, tm, wait,pickup, dropoff);
                	frame.dispose();
                	
                }   
            });
            
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.WEST);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
		frame.setTitle("Daily Planner"); 
		
		frame.setIconImage(image.getImage());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}