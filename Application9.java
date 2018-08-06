package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Application9 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application9 window = new Application9();
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
	public Application9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 402, 239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Location:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 51, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D:\\Student\\Students_pdf\\", "D:\\Student\\Students_txt\\"}));
		comboBox.setBounds(155, 47, 177, 22);
		frame.getContentPane().add(comboBox);
		comboBox.setSelectedItem(null);
		
		JLabel lblNewLabel_1 = new JLabel("Type:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(38, 105, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {".pdf", ".txt"}));
		comboBox1.setBounds(155, 101, 177, 22);
		frame.getContentPane().add(comboBox1);
		comboBox1.setSelectedItem(null);
		
		JButton btnNewButton = new JButton("Download");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1=comboBox.getSelectedItem().toString();
				String t2=comboBox1.getSelectedItem().toString();
				String abpath=t1+Application8.s[6]+t2;
				
				
				try {
					File fp =new File(abpath);
					if(!fp.exists())
						fp.createNewFile();
					PrintWriter sp= new PrintWriter(fp);
					sp.println();
					sp.println("\t\t\t\t\t"+Application8.s[1]+"   Engineering MarksCard");
					sp.println("           -----------------------------------------------------");
					sp.println("                 Name  :        "+Application8.s[0]);
					sp.println("           -----------------------------------------------------");
					sp.println("                 Branch:        "+Application8.s[2]);
					sp.println("           -----------------------------------------------------");
					sp.println("                 Sem   :        "+Application8.s[4]);
					sp.println("           -----------------------------------------------------");
					sp.println("           -----------------------------------------------------");
					sp.println("                 USN   :        "+Application8.s[6]);
					sp.println("           -----------------------------------------------------");
					
					for(int i=0;i<11;i=i+2) {
						t1=Application8.sp[i];
						t2=Application8.sp[i+1];
					sp.println("                      "+t1+"                         "+t2 +"");	
					sp.println("           -----------------------------------------------------");
					}
					
					sp.close();
					sp.close();
					
					
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Download Sucessful");
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(38, 166, 118, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(266, 166, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_2.setBounds(0, 0, 386, 200);
		frame.getContentPane().add(lblNewLabel_2);
		
	}

}
