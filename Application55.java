package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Application55 {

	private JFrame frame;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	static char[] usn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application55 window = new Application55();
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
	public Application55() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Region");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(128, 96, 63, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(132, 127, 105, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Collegename");
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		label_2.setBounds(92, 158, 90, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Branch");
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		label_3.setBounds(125, 189, 90, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Register No");
		label_4.setFont(new Font("Dialog", Font.BOLD, 12));
		label_4.setBounds(101, 220, 90, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Sem");
		label_5.setFont(new Font("Dialog", Font.BOLD, 12));
		label_5.setBounds(145, 250, 70, 17);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Exam Year");
		label_6.setFont(new Font("Dialog", Font.BOLD, 12));
		label_6.setBounds(112, 282, 70, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Enter  Student Detail");
		label_7.setForeground(Color.BLACK);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(28, 20, 214, 14);
		frame.getContentPane().add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(249, 280, 121, 20);
		frame.getContentPane().add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(249, 247, 121, 20);
		frame.getContentPane().add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(249, 214, 121, 20);
		frame.getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(249, 185, 121, 20);
		frame.getContentPane().add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(249, 150, 121, 20);
		frame.getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(249, 119, 121, 20);
		frame.getContentPane().add(textField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setBounds(249, 92, 121, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("1.BANGALORE");
		comboBox.addItem("2.MYSORE");
		comboBox.addItem("3.BALGAVI");
		comboBox.addItem("4.KASHI");
		comboBox.setSelectedItem(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(28, 61, 448, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(28, 337, 448, 2);
		frame.getContentPane().add(separator_1);
		
		usn= new char[10];
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int i=0;
					PreparedStatement sp =Application1.conn1.prepareStatement("insert into Stdtable(Name,Collegename,Branch,RegisterNo,Sem,ExamYear,Usn) values (?,?,?,?,?,?,?)");
					sp.setString(1,textField.getText().toUpperCase());
					sp.setString(2,textField_1.getText().toUpperCase());
					String c=textField_1.getText().toUpperCase();
					sp.setString(3,textField_2.getText().toUpperCase());
					String b=textField_2.getText().toUpperCase();
					b=b.toString().toUpperCase();
					sp.setString(4,textField_3.getText());
					String r=textField_3.getText();
					sp.setString(5,textField_4.getText());
					String spp=textField_4.getText();
					sp.setString(6,textField_5.getText());
					String ex=textField_5.getText();
					String s=comboBox.getSelectedItem().toString();
					
					
					
					usn[i++]=s.charAt(0);
					usn[i++]=c.charAt(0);
			        usn[i++]=c.charAt(1);
			        usn[i++]=ex.charAt(2);
			        usn[i++]=ex.charAt(3);
			        usn[i++]=b.charAt(0);
			        usn[i++]=b.charAt(1);
			        usn[i++]=r.charAt(0);
			        usn[i++]=r.charAt(1);
			        usn[i++]=r.charAt(2);
			        
			        sp.setString(7,new String(usn));
					
					sp.execute();
					sp.close();
					
					
					frame.dispose();
					Application66.main(null);
					
					
					
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(55, 372, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem(null);
				textField_5.setText(null);
				textField_4.setText(null);
				textField_3.setText(null);
				textField_2.setText(null);
				textField_1.setText(null);
				textField.setText(null);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(319, 372, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Application33.main(null);
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(0, 129, 21, 117);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel.setBounds(0, 0, 506, 420);
		frame.getContentPane().add(lblNewLabel);
	}
}
