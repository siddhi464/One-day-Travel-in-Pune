package minipro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class page_1GUI  implements ActionListener {
		JButton myButton;
		JFrame frame = new JFrame();
		page_1GUI()
		{
			try
			{
			//J Frame is a GUI window to add components to
			
			myButton=new JButton("NEXT");
			//myButton.setPreferredSize(new Dimension(10,20));
			myButton.setBounds(460,65,300,40);
			myButton.setFocusable(false);
			myButton.addActionListener(this);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS)); // Use BoxLayout for vertical arrangement

	        // Create a spacer component and add it to the panel before the button
	        Component verticalSpacer = Box.createVerticalStrut(300); // This adds 20 pixels of vertical space
	        buttonPanel.add(verticalSpacer);
			
			
			
            // Add the button to the panel
            buttonPanel.add(myButton);
            // Add label to the center
	        //frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH); // Add button panel to the bottom
			frame.setTitle("Day Tour Planner");
			frame.setSize(1200,700);
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//frame.add(buttonPanel, java.awt.BorderLayout.WEST);
			JLabel label=new JLabel();
			frame.getContentPane().add(label, BorderLayout.CENTER); 
			//frame.setResizable(false);
			frame.add(myButton);
			ImageIcon image=new ImageIcon("C:\\Users\\vaidy\\eclipse-workspace\\minipro\\src\\minipro\\tr.png");
			frame.setIconImage(image.getImage());
			
			label.setText("Welcome to Daily Tour planner");
			
		
			ImageIcon image2=new ImageIcon("C:\\\\Users\\\\vaidy\\\\eclipse-workspace\\\\minipro\\\\src\\\\minipro\\\\pune.jpeg");
			Border border=BorderFactory.createLineBorder(Color.black,6);
			label.setIcon(image2);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setFont(new Font("MV Boli",Font.PLAIN,35));
			label.setIconTextGap(50);
			label.setBackground(Color.pink);
			label.setOpaque(true);
			label.setBorder(border);
			label.setVerticalAlignment(JLabel.TOP);
			label.setHorizontalAlignment(JLabel.CENTER);
			frame.add(label);
			frame.setVisible(true);
			//label.setText("About us:We are daily tour planners of Pune City /n Contact us on:9999999999");
			
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	

		private static void Icon(String string) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==myButton)
			{
				   
				Myframe1 obj=new Myframe1();
				frame.dispose();
			}
			
		}
		}