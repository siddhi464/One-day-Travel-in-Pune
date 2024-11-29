package minipro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class myframe5_b extends JFrame implements ActionListener{
	JButton no1 = new JButton("Exit");
	JSlider slider;
	
	myframe5_b(){
		//default
	}

	myframe5_b(double total,int tm, int wait, ArrayList pickup, ArrayList dropoff){
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
		panel5.setLayout(new GridLayout(10,0,0,0));

		
		JLabel label11 = new JLabel("<html><div style='text-align: center;'>Thank you for travelling with us!,<br>Hope to see you again!<br>Don't forget : Pune Always Awaits! Are You Tour-Ready?</div></html>");
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
        

        JLabel label5 = new JLabel("***Bill***");
        label5.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label5.setHorizontalTextPosition(JLabel.CENTER);
		panel5.add(label5);
		no1.setBounds(460,65,300,40);
		no1.setFocusable(false);
		no1.addActionListener(this);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS)); // Use BoxLayout for vertical arrangement

        // Create a spacer component and add it to the panel before the button
        Component verticalSpacer = Box.createVerticalStrut(300); // This adds 20 pixels of vertical space
        buttonPanel.add(verticalSpacer);
        panel5.add(label5);
		JLabel c = new JLabel("Journey :");
		JLabel r1 = new JLabel("Dropoff locations: "+dropoff);
		panel5.add(c);
		panel5.add(r1);
		

        total = total + wait;
        String formatted = String.format("%.2f", total);
        JLabel label6 = new JLabel("Your total is : Rs."+formatted);
        JLabel label7 = new JLabel("Your waiting charges are: Rs."+wait);
        
        panel5.add(label7);
       
        panel5.add(label6);
		
        // Add the button to the panel
        buttonPanel.add(no1);

        //print total + waiting charges
		
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(no1);
        panel5.add(no1);
     
    
		
            no1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
              //      String selectedOption = ; // Update selectedOption with the chosen option
                	frame.dispose();
                	
                }   
            });

            slider = new JSlider(0,5,4);
            
            slider.setPreferredSize(new Dimension(200,60));
            
            slider.setPaintTicks(true);
            slider.setMinorTickSpacing(10);
            
            slider.setPaintTrack(true);
            slider.setMajorTickSpacing(25);
            
            slider.setPaintLabels(true);
            slider.setFont(new Font("MV Boli",Font.PLAIN,7));
            label.setFont(new Font("MV Boli",Font.PLAIN,20));
            
            slider.setOrientation(SwingConstants.HORIZONTAL); 
            label.setText("Please rate us!  "+ slider.getValue());
            
           // slider.addChangeListener(this);
            panel4.add(label);
            panel4.add(slider);
            
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


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}