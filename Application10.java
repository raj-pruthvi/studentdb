package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Application10 {

	private JFrame frame;
	private JTextField text;
	private JPasswordField npassword;
	private JPasswordField cpassword;
	int k=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application10 window = new Application10();
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
	public Application10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		text = new JTextField();
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setBounds(267, 112, 124, 20);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		if(Application1.Sname.compareTo("oo")!=0) {
			text.setText(Application1.Sname);
		}
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k=0;
				Application1.Sname="oo";
				frame.dispose();
				Application1.main(null);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(0, 0, 0));
		button.setBounds(0, 123, 26, 93);
		frame.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("USER-ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(154, 115, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NEW PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(103, 174, 124, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONFIRM PASSWORD");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(66, 233, 161, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		npassword = new JPasswordField();
		npassword.setHorizontalAlignment(SwingConstants.CENTER);
		npassword.setBounds(267, 171, 124, 20);
		frame.getContentPane().add(npassword);
		
		cpassword = new JPasswordField();
		cpassword.setHorizontalAlignment(SwingConstants.CENTER);
		cpassword.setBounds(267, 230, 124, 20);
		frame.getContentPane().add(cpassword);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(223, 115, 16, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel(":");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(223, 174, 16, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_1.setBounds(223, 233, 16, 14);
		frame.getContentPane().add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(37, 287, 409, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(37, 42, 409, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
				npassword.setText(null);
				cpassword.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(37, 330, 89, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=0;
				
				try {
					PreparedStatement op =Application1.conn.prepareStatement("select * from studentstable where Name=?");
					op.setString(1,text.getText());
					
					ResultSet q =op.executeQuery();
					
					while(q.next()) {
						j++;
					}
					if(j>0) {
						
						if(cpassword.getText().matches(npassword.getText())) {
							PreparedStatement sp =Application1.conn.prepareStatement("Update studentstable set Password='"+npassword.getText()+"' where Name='"+text.getText()+"'");
							sp.execute();
							sp.close();
							JOptionPane.showMessageDialog(null, "PASSWORD CHANGED SUCESSFULLY");
							k=0;
							Application1.Sname="oo";
							frame.dispose();
							Application1.main(null);
						}else
						{
							JOptionPane.showMessageDialog(null, " New password field not matches with conform field");
							npassword.setText(null);
							cpassword.setText(null);
						}
						
					}else
					{
						JOptionPane.showMessageDialog(null, "USER-ID DOES NOT EXIST");
						text.setText(null);
						npassword.setText(null);
						cpassword.setText(null);
						k++;
						
						 if(k>0){
								JButton btnNewButton_2 = new JButton("SIGN-UP");
								btnNewButton_2.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										k=0;
										Application1.Sname="oo";
										frame.dispose();
										Application2.main(null);
									}
								});
								btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
								btnNewButton_2.setBounds(201, 327, 89, 23);
								frame.getContentPane().add(btnNewButton_2);
								}
					}
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(357, 330, 89, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_4.setBounds(0, 0, 484, 361);
		frame.getContentPane().add(lblNewLabel_4);
	
		
		
	}
}
