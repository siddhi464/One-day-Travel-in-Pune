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

public class myframe5_c2 extends JFrame{
	ArrayList<String> places = new ArrayList<>();
	float accessed_d=0;
	String dest_place, curr;
	
	myframe5_c2(){
		//default
	}
	

	myframe5_c2(char choice,double total,int tm, String current, int wait, ArrayList pickup, ArrayList dropoff){
		curr = current;
		try {
			if(choice == 1) {
				
				Ride_continuation rc= new Ride_continuation(current,choice);
				places = rc.display();
				
				
			}
			else if(choice==2){
				Ride_continuation rc= new Ride_continuation(current,choice);
				places = rc.display();
//				
			}
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
        

        JLabel label5 = new JLabel("Where are you headed next?:");
		panel5.add(label5);
		
		
	JButton no1 = new JButton(places.get(0));
	JButton no2 = new JButton(places.get(1));
	JButton no3 = new JButton(places.get(2));
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
        	dest_place = places.get(0);
        	GEG obj2 = new GEG();
        	accessed_d = obj2.distance(current, dest_place); 
        	pickup.add(curr);
        	transport t=new transport(accessed_d, tm);
        	t.input();
        	curr=dest_place;
        	dropoff.add(dest_place);

        	myframe4 obj=new myframe4(total, tm, current, wait,pickup,dropoff);
        	//current=dest_place;
        	frame.dispose();
        }   
    });
    no2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
      //      String selectedOption = ; // Update selectedOption with the chosen option
        	dest_place = places.get(1);
        	GEG obj2 = new GEG();
        	accessed_d = obj2.distance(current, dest_place); 
        	pickup.add(curr);
        	transport t=new transport(accessed_d, tm);
        	t.input();
        	curr=dest_place;
        	dropoff.add(dest_place);

        	myframe4 obj=new myframe4(total, tm, current, wait,pickup,dropoff);
        	frame.dispose();
        }   
    });
    no3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
      //      String selectedOption = ; // Update selectedOption with the chosen option
        	dest_place = places.get(2);
        	GEG obj2 = new GEG();
        	accessed_d = obj2.distance(current, dest_place); 
        	pickup.add(curr);
        	curr=dest_place;
        	dropoff.add(dest_place);
        	transport t=new transport(accessed_d, tm);
        	t.input();
        	//curr=dest_place;
        	
        	myframe4 obj=new myframe4(total, tm, current, wait,pickup,dropoff);
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
		frame.setVisible(true);
		
		}
		
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}
