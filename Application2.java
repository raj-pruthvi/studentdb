package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class Application2 {

	private JFrame frmSignup;
	private JTextField text;
	private JPasswordField password;
	private JPasswordField password1;
	private JTable table;
	private JTextField textField;
	private JPasswordField passwordField;
	String ss;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application2 window = new Application2();
					window.frmSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignup = new JFrame();
		frmSignup.setTitle("SIGN-UP");
		frmSignup.setBounds(100, 100, 581, 491);
		frmSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignup.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(51, 179, 477, 2);
		frmSignup.getContentPane().add(separator);
		
		text = new JTextField();
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setBounds(309, 45, 86, 20);
		frmSignup.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User-id");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(124, 48, 86, 14);
		frmSignup.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(124, 79, 86, 14);
		frmSignup.getContentPane().add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(309, 76, 86, 20);
		frmSignup.getContentPane().add(password);
		
		password1 = new JPasswordField();
		password1.setHorizontalAlignment(SwingConstants.CENTER);
		password1.setBounds(309, 104, 86, 20);
		frmSignup.getContentPane().add(password1);
		
		JLabel lblNewLabel_2 = new JLabel("conform password");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setBounds(124, 107, 123, 14);
		frmSignup.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PreparedStatement sp =Application1.conn.prepareStatement("insert into studentstable (Name,Password) values (?,?)");
					sp.setString(1,text.getText());
					sp.setString(2, password.getText());
					
					if(password.getText().matches(password1.getText())) {
					sp.execute();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Password field incorect");
					}
					sp.close();
					
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(176, 154, 71, 14);
		frmSignup.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
				password.setText(null);
				password1.setText(null);
			}
		});
		btnNewButton_1.setBounds(287, 154, 86, 14);
		frmSignup.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("SIGN - UP");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(190, 11, 89, 14);
		frmSignup.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(44, 296, 466, 145);
		frmSignup.getContentPane().add(scroll);
		
		
		
		table = new JTable();
		scroll.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Table detail");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=0;
				try {
					PreparedStatement op =Application1.conn.prepareStatement("select * from studentstable where Name=? and Password=?");
					op.setString(1,textField.getText());
					op.setString(2,passwordField.getText());
					ResultSet q =op.executeQuery();
					
					while(q.next()) {
						j++;
					}
					
				}catch(Exception ee) {
					ee.printStackTrace();
				}
				
				
			if(	textField.getText().toUpperCase().matches("ROOT") && j>0) {
				try {
					PreparedStatement sp =Application1.conn.prepareStatement("select * from studentstable");
					
					ResultSet s =sp.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(s));
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}}
			if(	textField.getText().toUpperCase().compareTo("ROOT")!=0 && j>0) {
				try {
					PreparedStatement sp =Application1.conn.prepareStatement("select Name from studentstable");
					
					ResultSet s =sp.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(s));
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}}
			if(j==0) {
				JOptionPane.showMessageDialog(null, "Userid - password mismatch");
			}
				}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(215, 262, 123, 20);
		frmSignup.getContentPane().add(btnNewButton_2);
		
		JLabel label = new JLabel("User-id");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label.setBounds(124, 195, 86, 14);
		frmSignup.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(309, 192, 86, 20);
		frmSignup.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_1.setBounds(124, 220, 86, 14);
		frmSignup.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(309, 223, 86, 20);
		frmSignup.getContentPane().add(passwordField);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSignup.dispose();
				Application1.main(null);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		btnNewButton_3.setBounds(0, 128, 26, 93);
		frmSignup.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_4.setBounds(0, 0, 565, 452);
		frmSignup.getContentPane().add(lblNewLabel_4);
	}
}
