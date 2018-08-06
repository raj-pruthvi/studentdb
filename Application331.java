package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Application331 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application331 window = new Application331();
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
	public Application331() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Application33.main(null);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(Color.BLACK);
		button.setBounds(0, 102, 23, 111);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(232, 134, 221, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter USN:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(80, 137, 120, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setForeground(Color.BLACK);
		separator.setBounds(34, 51, 479, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 258, 479, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					 int i=0;
					PreparedStatement sp1= Application1.conn1.prepareStatement("select * from Stdtable where Usn='"+textField.getText().toUpperCase()+"'");
					ResultSet p =sp1.executeQuery();
					while(p.next()) {
						i++;
					}
					sp1.close();
					
					if(i!=0) {
					PreparedStatement sp= Application1.conn1.prepareStatement("delete from Stdtable where Usn='"+textField.getText().toUpperCase()+"'");
					sp.execute();
					sp.close();
					
					PreparedStatement sq= Application1.conn1.prepareStatement("delete from Mark where USN='"+textField.getText().toUpperCase()+"'");
					sq.execute();
					sq.close();
					
					int j=0;
					PreparedStatement sp2= Application1.conn1.prepareStatement("select * from Stdtable where Usn='"+textField.getText().toUpperCase()+"'");
					ResultSet p1 =sp2.executeQuery();
					while(p1.next()) {
						j++;
					}
					
					if(j==0) {
					JOptionPane.showMessageDialog(null,"Particular record deleted");
					textField.setText(null);
					}
					if(j!=0){
						JOptionPane.showMessageDialog(null,"Particular record not deleted");
						textField.setText(null);
						}
					
					
					
					}
					
					if(i==0) {
						JOptionPane.showMessageDialog(null,"Particular USN does not exist");
						frame.dispose();
						Application33.main(null);
					}
					
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(220, 282, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Record");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(114, 11, 323, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_2.setBounds(0, 0, 557, 340);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
