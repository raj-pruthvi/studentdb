package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Application44 {

	private JFrame frame;
	private JTextField textField;
	public static String s=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application44 window = new Application44();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application44() {
		
		initialize();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(34, 65, 502, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 293, 502, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel label = new JLabel("ENTER USN:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(77, 153, 95, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(291, 150, 181, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("Submit");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  int j=0;
			        char a[]=new char[10];
					s=textField.getText().toUpperCase();
					for(int i=0;i<10;i++) {
						a[i]=s.charAt(i);
						
					}
					s=new String(a);
					
					
					try {
						PreparedStatement op =Application1.conn1.prepareStatement("select * from Stdtable where Usn='"+s+"'");
						ResultSet q =op.executeQuery();
						
						while(q.next()) {
							
					
							j++;
							
					}
						op.close();
						q.close();
						
					if(j>0) {
					          frame.dispose();
						      Application8.main(null);
							}
					
					if(j==0) {
						JOptionPane.showMessageDialog(null,"usn mismatch");
						textField.setText(null);
						
					}
					
					}catch(Exception ee) {
						ee.printStackTrace();
					}
				}
			
		});
		button.setBounds(232, 259, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Change Password");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application33.pa=2;
				frame.dispose();
				Aplication77.main(null);
			}
		});
		button_1.setBounds(38, 349, 181, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Exit");
		button_2.setFont(new Font("Dialog", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(455, 349, 89, 23);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("Students Detail View");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 11, 225, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Application33.r==1) {
					frame.dispose();
					Application33.r=0;
					Application33.main(null);
				}
				else
				 {
					frame.dispose();
					Application1.main(null);
					}
					
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(0, 126, 21, 117);
		frame.getContentPane().add(button_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_1.setBounds(0, 0, 575, 383);
		frame.getContentPane().add(lblNewLabel_1);
		
		if(Application1.Rname.compareTo("ROOT")!=0) {
		JLabel label_1 = new JLabel("ALL THE BEST!!!!");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_1.setBounds(113, 208, 344, 14);
		frame.getContentPane().add(label_1);}
	}
}
