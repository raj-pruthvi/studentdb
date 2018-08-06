package Prop;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Application8 {

	private JFrame frmMarksCard;
	public static String s[]=new String[7];
	JTextArea t=null;
	public static String sp[]=new String[12];
	JTextField p;
	private JTextField text1;
	private JTextField text3;
	private JTextField text2;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	private JTextField text11;
	private JTextField text13;
	private JTextField text15;
	private JTextField text17;
	private JTextField text19;
	private JTextField text111;
	private JTextField text12;
	private JTextField text14;
	private JTextField text16;
	private JTextField text18;
	private JTextField text110;
	private JTextField text112;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JButton btnPrint;
	int sum=0;
	int div=0;
	int cgpa;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application8 window = new Application8();
					window.frmMarksCard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application8() {
		initialize();
		display();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarksCard = new JFrame();
		frmMarksCard.setTitle("Marks Card");
		frmMarksCard.setBounds(100, 100, 692, 519);
		frmMarksCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMarksCard.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Music\\white-arrow-to-the-right-with-black-background_318-34473.jpg"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMarksCard.dispose();
				Application44.main(null);
			}
			
		});
		btnNewButton.setBounds(0, 148, 23, 111);
		frmMarksCard.getContentPane().add(btnNewButton);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setBounds(170, 45, 123, 20);
		frmMarksCard.getContentPane().add(text1);
		text1.setColumns(10);
		
		text3 = new JTextField();
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setColumns(10);
		text3.setBounds(170, 76, 123, 20);
		frmMarksCard.getContentPane().add(text3);
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setColumns(10);
		text2.setBounds(418, 45, 123, 20);
		frmMarksCard.getContentPane().add(text2);
		
		text4 = new JTextField();
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setColumns(10);
		text4.setBounds(418, 76, 123, 20);
		frmMarksCard.getContentPane().add(text4);
		
		text5 = new JTextField();
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setColumns(10);
		text5.setBounds(170, 107, 123, 20);
		frmMarksCard.getContentPane().add(text5);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 48, 65, 14);
		frmMarksCard.getContentPane().add(lblNewLabel);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBranch.setHorizontalAlignment(SwingConstants.CENTER);
		lblBranch.setBounds(76, 79, 65, 14);
		frmMarksCard.getContentPane().add(lblBranch);
		
		JLabel lblCollegeName = new JLabel("College :");
		lblCollegeName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCollegeName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollegeName.setBounds(64, 110, 84, 14);
		frmMarksCard.getContentPane().add(lblCollegeName);
		
		JLabel lblRegNo = new JLabel("Sem:");
		lblRegNo.setForeground(Color.WHITE);
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegNo.setBounds(327, 48, 81, 14);
		frmMarksCard.getContentPane().add(lblRegNo);
		
		JLabel lblRegno = new JLabel("Reg.No.");
		lblRegno.setForeground(Color.WHITE);
		lblRegno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegno.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegno.setBounds(327, 79, 81, 14);
		frmMarksCard.getContentPane().add(lblRegno);
		
		text6 = new JTextField();
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setColumns(10);
		text6.setBounds(418, 107, 123, 20);
		frmMarksCard.getContentPane().add(text6);
		
		text7 = new JTextField();
		text7.setHorizontalAlignment(SwingConstants.CENTER);
		text7.setColumns(10);
		text7.setBounds(282, 148, 123, 20);
		frmMarksCard.getContentPane().add(text7);
		
		JLabel lblNewLabel_1 = new JLabel(" Year of Exam");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(327, 110, 81, 14);
		frmMarksCard.getContentPane().add(lblNewLabel_1);
		
		text11 = new JTextField();
		text11.setHorizontalAlignment(SwingConstants.CENTER);
		text11.setBounds(170, 211, 123, 20);
		frmMarksCard.getContentPane().add(text11);
		text11.setColumns(10);
		
		text13 = new JTextField();
		text13.setHorizontalAlignment(SwingConstants.CENTER);
		text13.setBounds(170, 242, 123, 20);
		frmMarksCard.getContentPane().add(text13);
		text13.setColumns(10);
		
		text15 = new JTextField();
		text15.setHorizontalAlignment(SwingConstants.CENTER);
		text15.setBounds(170, 273, 123, 20);
		frmMarksCard.getContentPane().add(text15);
		text15.setColumns(10);
		
		text17 = new JTextField();
		text17.setHorizontalAlignment(SwingConstants.CENTER);
		text17.setBounds(170, 304, 123, 20);
		frmMarksCard.getContentPane().add(text17);
		text17.setColumns(10);
		
		text19 = new JTextField();
		text19.setHorizontalAlignment(SwingConstants.CENTER);
		text19.setBounds(170, 332, 123, 20);
		frmMarksCard.getContentPane().add(text19);
		text19.setColumns(10);
		
		text111 = new JTextField();
		text111.setHorizontalAlignment(SwingConstants.CENTER);
		text111.setBounds(170, 363, 123, 20);
		frmMarksCard.getContentPane().add(text111);
		text111.setColumns(10);
		
		text12 = new JTextField();
		text12.setHorizontalAlignment(SwingConstants.CENTER);
		text12.setColumns(10);
		text12.setBounds(418, 211, 123, 20);
		frmMarksCard.getContentPane().add(text12);
		
		text14 = new JTextField();
		text14.setHorizontalAlignment(SwingConstants.CENTER);
		text14.setColumns(10);
		text14.setBounds(418, 242, 123, 20);
		frmMarksCard.getContentPane().add(text14);
		
		text16 = new JTextField();
		text16.setHorizontalAlignment(SwingConstants.CENTER);
		text16.setColumns(10);
		text16.setBounds(418, 273, 123, 20);
		frmMarksCard.getContentPane().add(text16);
		
		text18 = new JTextField();
		text18.setHorizontalAlignment(SwingConstants.CENTER);
		text18.setColumns(10);
		text18.setBounds(418, 304, 123, 20);
		frmMarksCard.getContentPane().add(text18);
		
		text110 = new JTextField();
		text110.setHorizontalAlignment(SwingConstants.CENTER);
		text110.setColumns(10);
		text110.setBounds(418, 332, 123, 20);
		frmMarksCard.getContentPane().add(text110);
		
		text112 = new JTextField();
		text112.setHorizontalAlignment(SwingConstants.CENTER);
		text112.setColumns(10);
		text112.setBounds(418, 363, 123, 20);
		frmMarksCard.getContentPane().add(text112);
		
		label = new JLabel("1.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(122, 211, 18, 14);
		frmMarksCard.getContentPane().add(label);
		
		label_1 = new JLabel("2.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(122, 242, 18, 14);
		frmMarksCard.getContentPane().add(label_1);
		
		label_2 = new JLabel("3.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(123, 273, 18, 14);
		frmMarksCard.getContentPane().add(label_2);
		
		label_3 = new JLabel("4.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(123, 304, 18, 14);
		frmMarksCard.getContentPane().add(label_3);
		
		label_4 = new JLabel("5.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(123, 335, 18, 14);
		frmMarksCard.getContentPane().add(label_4);
		
		label_5 = new JLabel("6.");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(122, 366, 18, 14);
		frmMarksCard.getContentPane().add(label_5);
		
		label_6 = new JLabel(":");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(350, 211, 18, 14);
		frmMarksCard.getContentPane().add(label_6);
		
		label_7 = new JLabel(":");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(350, 242, 18, 14);
		frmMarksCard.getContentPane().add(label_7);
		
		label_8 = new JLabel(":");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(350, 273, 18, 14);
		frmMarksCard.getContentPane().add(label_8);
		
		label_9 = new JLabel(":");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(350, 366, 18, 14);
		frmMarksCard.getContentPane().add(label_9);
		
		label_10 = new JLabel(":");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(350, 335, 18, 14);
		frmMarksCard.getContentPane().add(label_10);
		
		label_11 = new JLabel(":");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(350, 304, 18, 14);
		frmMarksCard.getContentPane().add(label_11);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(51, 186, 615, 2);
		frmMarksCard.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 32, 656, 2);
		frmMarksCard.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 433, 656, 2);
		frmMarksCard.getContentPane().add(separator_2);
		
		btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application9.main(null);
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPrint.setBounds(564, 446, 89, 23);
		frmMarksCard.getContentPane().add(btnPrint);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(306, 402, 99, 20);
		frmMarksCard.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SGPA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(199, 405, 46, 14);
		frmMarksCard.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Yashvanth pai\\Downloads\\63bc18a6af4afe785911c9ae035c3e0f.jpg"));
		lblNewLabel_3.setBounds(0, 0, 676, 480);
		frmMarksCard.getContentPane().add(lblNewLabel_3);
		
		
	}
	
	private int markgenarater(int x) {
		div=div+4;
		if(x>=90)
			return 10;
		else if(x>=80 && x<90)
			return 9;
		else if(x>=70 && x<80)
			return 8;
		else if(x>=60 && x<70)
			return 7;
		else if(x>=50 && x<60)
			return 6;
		else if(x>=40 && x<50)
			return 5;
		else if(x>=30 && x<40)
			return 4;
		else
			return 3;
		
		
		
	}
	
	private void display() {
		try{
			PreparedStatement op =Application1.conn1.prepareStatement("select * from Stdtable where Usn='"+Application44.s+"'");
			
			ResultSet q =op.executeQuery();
			
			while(q.next()) {
				int i=0;
				s[i++]=q.getString("Name");
				s[i++]=q.getString("Collegename");
				s[i++]=q.getString("Branch");
				s[i++]=q.getString("RegisterNo");
				s[i++]=q.getString("Sem");
				s[i++]=q.getString("ExamYear");
				s[i++]=q.getString("Usn");
				
				
				
			}
			op.close();
			q.close();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
			try{
				PreparedStatement kp =Application1.conn1.prepareStatement("select * from Mark where USN='"+Application44.s+"'");
				
				ResultSet p =kp.executeQuery();
				
				while(p.next()) {
				
					int i=0;
					sp[i++]=p.getString("sub1");
					sp[i++]=p.getString("mark1");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark1")))*4);
					sp[i++]=p.getString("sub2");
					sp[i++]=p.getString("mark2");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark2")))*4);
					sp[i++]=p.getString("sub3");
					sp[i++]=p.getString("mark3");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark3")))*4);
					sp[i++]=p.getString("sub4");
					sp[i++]=p.getString("mark4");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark4")))*4);
					sp[i++]=p.getString("sub5");
					sp[i++]=p.getString("mark5");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark5")))*4);
					sp[i++]=p.getString("sub6");
					sp[i++]=p.getString("mark6");
					sum=sum+(markgenarater(Integer.parseInt(p.getString("mark6")))*4);
					
					cgpa=sum/div;
					
					
					kp.close();
					p.close();
				}
			
		}catch(Exception ee) {
			ee.printStackTrace();
		}
			text1.setText(s[0]);
			text2.setText(s[4]);
			text3.setText(s[2]);
			text4.setText(s[3]);
			text5.setText(s[1]);
			text6.setText(s[5]);
			text7.setText(s[6]);
			
			                       
			
			
			text11.setText(sp[0]);
			text12.setText(sp[1]);
			text13.setText(sp[2]);
			text14.setText(sp[3]);
			text15.setText(sp[4]);
			text16.setText(sp[5]);
			text17.setText(sp[6]);
			text18.setText(sp[7]);
			text19.setText(sp[8]);
			text110.setText(sp[9]);
			text111.setText(sp[10]);
			text112.setText(sp[11]);
			textField.setText(Integer.toString(cgpa));
			
			
		}
}


