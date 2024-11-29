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
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Myframe1 extends JFrame{
	JButton no1 = new JButton("Kothrud");
	JButton no2 = new JButton("Baner");
	JButton no3 = new JButton("Deccan");
	JButton no4 = new JButton("Wakad");
	JButton no5 = new JButton("Chinchwad");
	public ArrayList<String> pickup = new ArrayList<>();
	public ArrayList<String> dropoff = new ArrayList<>();

	Myframe1(){
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
		panel5.setLayout(new GridLayout(3,3,0,0));

		
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
        
        JLabel label1 = new JLabel("Press to choose your current Location:");
		panel5.add(label1);
		panel5.add(no1);
		panel5.add(no2);
		panel5.add(no3);
		panel5.add(no4);
		panel5.add(no5);



		ButtonGroup buttonGroup = new ButtonGroup();        
            no1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String current = "Kothrud";
                	pickup.add(current);
                	myframe2 obj=new myframe2(current,pickup,dropoff);
                	frame.dispose();
                }   
            });
            no2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String current = "Baner";
                	pickup.add(current);
                	myframe2 obj=new myframe2(current,pickup,dropoff);
                	frame.dispose();
                }   
            });
            no3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String current = "Deccan";
                	pickup.add(current);
                	myframe2 obj=new myframe2(current,pickup,dropoff);
                	frame.dispose();
                }   
            });
            no4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String current = "Wakad";
                	pickup.add(current);
                	myframe2 obj=new myframe2(current,pickup,dropoff);
                	frame.dispose();
                }   
            });
            no5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	String current = "Chinchwad";
                	pickup.add(current);
                	myframe2 obj=new myframe2(current,pickup,dropoff);
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