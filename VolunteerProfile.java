import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class VolunteerProfile extends JFrame implements ActionListener {
    
    private JPanel panel;
	private String fNameDisp,idDisp,uNameDisp;
    private Font f1, f2, f3;
    private ImageIcon img;
    private JLabel picture, fullName, fName, Id, sId, phone, number, expertise, field, position, operator, line1, line2, line3, line4, line5;
    private JButton button1, button2, button3, button4, button5, edit;

    public VolunteerProfile( String fn,String id,String uName) {
        super("Welcome " +fn);
		this.fNameDisp=fn;
		this.idDisp= id;
		this.uNameDisp = uName;
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
		
		button2=new JButton("Meeting");
        Color c2 = new Color(102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Duty");
        Color c3 = new Color(102, 102, 102);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button3.setBackground(c3);
        button3.setForeground(Color.WHITE);
		
		/*
		button4=new JButton("Students");
        Color c4 = new Color(102, 102, 102);
        button4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button4.setBackground(c4);
        button4.setForeground(Color.WHITE);
		*/
		
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

        fName = new JLabel(fNameDisp);
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
        Id = new JLabel(" Id : " + idDisp);
        Id.setBounds(240, 220, 200, 50);
        Id.setFont(new Font("Segoe UI", Font.BOLD, 24));
        Id.setForeground(Color.BLACK);
        panel.add(Id);

        sId = new JLabel("");
        sId.setBounds(450, 220, 400, 50);
        sId.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        sId.setForeground(Color.BLACK);
        panel.add(sId);

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

        sId = new JLabel(idDisp+"@student.aiub");
        sId.setBounds(450, 280, 400, 50);
        sId.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        sId.setForeground(Color.BLACK);
        panel.add(sId);

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

        // Position:
        position = new JLabel("Working As : ");
        position.setBounds(240, 400, 200, 50);
        position.setFont(new Font("Segoe UI", Font.BOLD, 24));
        position.setForeground(Color.BLACK);
        panel.add(position);

        operator = new JLabel("Operator");
        operator.setBounds(450, 400, 400, 50);
        operator.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        operator.setForeground(Color.BLACK);
        panel.add(operator);

        line4 = new JLabel("_________________________________________________________");
        line4.setBounds(240, 420, 500, 40);
        line4.setForeground(Color.BLUE);
        line4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line4);
        // Expertise in:
        expertise = new JLabel("Experience : ");
        expertise.setBounds(240, 460, 200, 50);
        expertise.setFont(new Font("Segoe UI", Font.BOLD, 24));
        expertise.setForeground(Color.BLACK);
        panel.add(expertise);

        field = new JLabel("3 Months & 2 Events");
        field.setBounds(450, 460, 400, 50);
        field.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        field.setForeground(Color.BLACK);
        panel.add(field);

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
           new VolunteerProfile(fNameDisp,idDisp,uNameDisp).setVisible(true);
        } else if (e.getSource() == button2) {
            this.setVisible(false);
            new VolunteerMeeting(fNameDisp,idDisp,uNameDisp).setVisible(true);
        } else if (e.getSource() == button3) {
            this.setVisible(false);
            new VolunteerDuty(fNameDisp,idDisp,uNameDisp).setVisible(true);
        } else if (e.getSource() == button5) {
            this.setVisible(false);
			new Login().setVisible(false);
            // home page link
        }
		
    }
        
    public static void main(String[] args) {
        //VolunteerProfile ad = new VolunteerProfile();
        //ad.setVisible(true);
    }
}
