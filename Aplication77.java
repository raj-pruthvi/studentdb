package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Aplication77 {

	private JFrame frame;
	private JTextField ntext1;
	private JPasswordField npassword1;
	private JPasswordField npassword2;
	private JTextField otext;
	private JPasswordField opassword1;
	private int j=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplication77 window = new Aplication77();
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
	public Aplication77() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if(npassword1.getText().matches(npassword2.getText())) {  
						
						try {
					         if(otext.getText().toUpperCase().matches("ROOT")) {
									PreparedStatement sp =Application1.conn.prepareStatement("Update studentstable set Password='"+npassword1.getText()+"', Name='"+otext.getText()+"' where Name='"+otext.getText()+"'");
									sp.execute();
									sp.close();
								
							 }
					         else
							{
							       PreparedStatement sp =Application1.conn.prepareStatement("Update studentstable set Password='"+npassword1.getText()+"', Name='"+ntext1.getText()+"' where Name='"+otext.getText()+"'");
							       sp.execute();
								   sp.close();
							}
							
							
						} catch(Exception e1) {
						
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "RECORD MODIFIED ");
						if(Application33.pa==1) {
							frame.dispose();
							Application33.main(null);
							}
							if(Application33.pa==2) {
								frame.dispose();
							Application44.main(null);
							}
							
						
			}
						else
			{
							JOptionPane.showMessageDialog(null, " New password field not matches with conform field");
							npassword1.setText(null);
							npassword2.setText(null);
							
			}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 10));
		button.setBounds(433, 355, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("Old Information");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(252, 11, 115, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("User id");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(156, 62, 78, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(156, 102, 67, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New Information");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(252, 167, 115, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("User id");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(176, 223, 58, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Password");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(156, 258, 78, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Confirm Password");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(104, 294, 132, 14);
		frame.getContentPane().add(label_6);
		
		ntext1 = new JTextField();
		ntext1.setHorizontalAlignment(SwingConstants.CENTER);
		ntext1.setColumns(10);
		ntext1.setBounds(281, 220, 86, 20);
		frame.getContentPane().add(ntext1);
		
		
		npassword1 = new JPasswordField();
		npassword1.setHorizontalAlignment(SwingConstants.CENTER);
		npassword1.setBounds(281, 255, 86, 20);
		frame.getContentPane().add(npassword1);
		
		npassword2 = new JPasswordField();
		npassword2.setHorizontalAlignment(SwingConstants.CENTER);
		npassword2.setBounds(281, 291, 86, 20);
		frame.getContentPane().add(npassword2);
		
		otext = new JTextField();
		otext.setHorizontalAlignment(SwingConstants.CENTER);
		otext.setColumns(10);
		otext.setBounds(281, 59, 86, 20);
		frame.getContentPane().add(otext);
		
		opassword1 = new JPasswordField();
		opassword1.setHorizontalAlignment(SwingConstants.CENTER);
		opassword1.setBounds(281, 99, 86, 20);
		frame.getContentPane().add(opassword1);
		
		JButton button_1 = new JButton("Proceed");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement op =Application1.conn.prepareStatement("select * from studentstable where Name=? and Password=?");
					op.setString(1,otext.getText());
					op.setString(2,opassword1.getText());
					ResultSet q =op.executeQuery();
					
					while(q.next()) {
						j++;
					}
					
					if(j==0) {
						JOptionPane.showMessageDialog(null,"userid and password mismatch");
						otext.setText(null);
						opassword1.setText(null);
					}
					if(j!=0) {
						JOptionPane.showMessageDialog(null,"Record match");
						ntext1.setText(otext.getText());
						
					}
					
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_1.setBounds(412, 120, 89, 23);
		frame.getContentPane().add(button_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(36, 154, 465, 2);
		frame.getContentPane().add(separator);
		
		JButton button_2 = new JButton("Clear");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otext.setText(null);
				opassword1.setText(null);
				ntext1.setText(null);
				npassword1.setText(null);
				npassword2.setText(null);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_2.setBounds(10, 355, 89, 23);
		frame.getContentPane().add(button_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(44, 36, 465, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(44, 332, 465, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Application33.pa==1) {
				frame.dispose();
				Application33.main(null);
				}
				if(Application33.pa==2) {
					frame.dispose();
				Application44.main(null);
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(0, 120, 26, 117);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(0, 191, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel.setBounds(0, 0, 532, 389);
		frame.getContentPane().add(lblNewLabel);
	}
}
