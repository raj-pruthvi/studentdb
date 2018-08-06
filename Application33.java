package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Application33 {

	private JFrame frmAdministater;
	static int r=0,pa=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application33 window = new Application33();
					window.frmAdministater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application33() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministater = new JFrame();
		frmAdministater.setTitle("Administater");
		frmAdministater.setBounds(100, 100, 555, 402);
		frmAdministater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministater.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 83, 519, 2);
		frmAdministater.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 270, 519, 2);
		frmAdministater.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Create New Record");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministater.dispose();
				Application55.main(null);
			}
		});
		btnNewButton.setBounds(195, 112, 185, 23);
		frmAdministater.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View record");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r=1;
				frmAdministater.dispose();
				Application44.main(null);
				
			}
		});
		btnNewButton_1.setBounds(195, 161, 185, 23);
		frmAdministater.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Change Password");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pa=1;
				frmAdministater.dispose();
				Aplication77.main(null);
			}
		});
		btnNewButton_2.setBounds(24, 314, 171, 23);
		frmAdministater.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(429, 314, 89, 23);
		frmAdministater.getContentPane().add(btnNewButton_3);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministater.dispose();
				Application1.main(null);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		button.setBackground(Color.BLACK);
		button.setBounds(0, 112, 21, 117);
		frmAdministater.getContentPane().add(button);
		
		JButton btnNewButton_4 = new JButton("Delete Record");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministater.dispose();
				Application331.main(null);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setBounds(195, 212, 185, 23);
		frmAdministater.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel.setBounds(0, 0, 539, 363);
		frmAdministater.getContentPane().add(lblNewLabel);
	}
}
