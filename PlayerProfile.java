import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PlayerProfile extends JFrame implements ActionListener {
	String fullName_display, sid,mail_display,skill,rec_display;
    
    private JPanel panel;
    private Font f1, f2, f3;
    private ImageIcon img;
    private JLabel picture, fullName, fName, Id, tId, phone, number, expertise, field, records, winning, line1, line2, line3, line4, line5;
    private JButton button1, button2, button3, button4, button5, edit;

    public PlayerProfile(String fnd,String sid,String skill, String mail) {
        super("Welcome "+fnd);
		this.fullName_display = fnd;
		this.sid=sid;
		this.mail_display = mail;
		this.rec_display=skill;
        panel = new JPanel();

        f1 = new Font("Segoe UI", Font.BOLD, 36);
        f2 = new Font("Segoe UI", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        button1 = new JButton("Profile");
		Color c1 = new Color(204,204,204);
        Color ct = new Color(0, 0, 0);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(ct);
        button1.setBackground(c1);
		
		button2=new JButton("Matches");
        Color c2 = new Color(102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Upcoming");
        Color c3 = new Color(102, 102, 102);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button3.setBackground(c3);
        button3.setForeground(Color.WHITE);
		
		
		button5=new JButton("Log Out");
        Color c5 = new Color(102, 102, 102);
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);

		button1.setBounds(10,75,180,40);
		button2.setBounds(10,125,180,40);
		button3.setBounds(10,175,180,40);
		//button4.setBounds(10,225,180,40);
        button5.setBounds(10,500,180,40);
        
        button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		//button4.addActionListener(this);
        button5.addActionListener(this);

        panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		//panel.add(button4);
        panel.add(button5);

        // designing the profile
        img = new ImageIcon(getClass().getResource("img/profile.jpg"));
        picture = new JLabel(img);
        picture.setBounds(180, -20, 100, 200);
        panel.add(picture);

        // name section: 
        fullName = new JLabel("Full Name : ");
        fullName.setBounds(240, 150, 200, 50);
        fullName.setFont(new Font("Segoe UI", Font.BOLD, 24));
        fullName.setForeground(Color.BLACK);
        panel.add(fullName);

        fName = new JLabel(fnd);
        fName.setBounds(450, 150, 400, 50);
        fName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        fName.setForeground(Color.BLACK);
        panel.add(fName);

        line1 = new JLabel("_________________________________________________________");
        line1.setBounds(240, 180, 500, 40);
        line1.setForeground(Color.BLUE);
        line1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line1);

        // faculty id
        Id = new JLabel("Student Id : ");
        Id.setBounds(240, 220, 200, 50);
        Id.setFont(new Font("Segoe UI", Font.BOLD, 24));
        Id.setForeground(Color.BLACK);
        panel.add(Id);

        tId = new JLabel(sid);
        tId.setBounds(450, 220, 400, 50);
        tId.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        tId.setForeground(Color.BLACK);
        panel.add(tId);

        line2 = new JLabel("_________________________________________________________");
        line2.setBounds(240, 240, 500, 40);
        line2.setForeground(Color.BLUE);
        line2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line2);
        // email
        Id = new JLabel("Email : ");
        Id.setBounds(240, 280, 200, 50);
        Id.setFont(new Font("Segoe UI", Font.BOLD, 24));
        Id.setForeground(Color.BLACK);
        panel.add(Id);

        tId = new JLabel(sid+"@student.aiub" );
        tId.setBounds(450, 280, 400, 50);
        tId.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        tId.setForeground(Color.BLACK);
        panel.add(tId);

        line2 = new JLabel("_________________________________________________________");
        line2.setBounds(240, 300, 500, 40);
        line2.setForeground(Color.BLUE);
        line2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line2);

        // phone number:
        phone = new JLabel("Phone Number: ");
        phone.setBounds(240, 340, 200, 50);
        phone.setFont(new Font("Segoe UI", Font.BOLD, 24));
        phone.setForeground(Color.BLACK);
        panel.add(phone);

        number = new JLabel("013067676769");
        number.setBounds(450, 340, 400, 50);
        number.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        number.setForeground(Color.BLACK);
        panel.add(number);

        line3 = new JLabel("_________________________________________________________");
        line3.setBounds(240, 360, 500, 40);
        line3.setForeground(Color.BLUE);
        line3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line3);

        // expertise:
        expertise = new JLabel("Skillful In: ");
        expertise.setBounds(240, 400, 200, 50);
        expertise.setFont(new Font("Segoe UI", Font.BOLD, 24));
        expertise.setForeground(Color.BLACK);
        panel.add(expertise);

        field = new JLabel(skill);
        field.setBounds(450, 400, 400, 50);
        field.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        field.setForeground(Color.BLACK);
        panel.add(field);

        line4 = new JLabel("_________________________________________________________");
        line4.setBounds(240, 420, 500, 40);
        line4.setForeground(Color.BLUE);
        line4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line4);
        // Records in:
        records = new JLabel("Records : ");
        records.setBounds(240, 460, 200, 50);
        records.setFont(new Font("Segoe UI", Font.BOLD, 24));
        records.setForeground(Color.BLACK);
        panel.add(records);

        winning = new JLabel("0 Times Winner");
        winning.setBounds(450, 460, 400, 50);
        winning.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        winning.setForeground(Color.BLACK);
        panel.add(winning);

        line5 = new JLabel("_________________________________________________________");
        line5.setBounds(240, 480, 500, 40);
        line5.setForeground(Color.BLUE);
        line5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line5);

        // edit button:
        edit = new JButton("Edit");
        edit.setBounds(320, 520, 200, 40);
        edit.setFont(f2);
        edit.setForeground(new Color(25, 118, 211));
        edit.setBackground(new Color(255, 255, 255));
        edit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        edit.setFocusPainted(false);
        panel.add(edit);

        super.setBounds(450, 200, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        panel.setLayout(null);
        super.add(panel);
    }
    
    public void actionPerformed(ActionEvent e) {
        
		if (e.getSource() == button1) {
            this.setVisible(false);
            new AdminProfile(fullName_display,sid,mail_display).setVisible(true);
        } else if (e.getSource() == button2) {
            
            PlayerMatches obj = new PlayerMatches(fullName_display,sid,mail_display);
			obj.setVisible(true);
			this.setVisible(false);
        } else if (e.getSource() == button3) {
            setVisible(false);
            new PlayerUpcoming(fullName_display,sid,mail_display).setVisible(true);
        } else if (e.getSource() == button5) {
            this.setVisible(false);
            new Login().setVisible(true);
        }
		
    }
        
    public static void main(String[] args) {
        //PlayerProfile ad = new PlayerProfile();
        //ad.setVisible(true);
    }
}
