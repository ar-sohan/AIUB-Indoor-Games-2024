import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class VolunteerMeeting extends JFrame implements ActionListener {
    private String name,id,uName;
    private JPanel panel;
    private JLabel title1, text1, title2, text2;
    private JButton button1, button2, button3, button4, claim;

    public VolunteerMeeting(String name,String id, String uName) {
        super("Your Duties Today");
		this.name= name;
		this.id = id;
		this.uName= uName;
        panel = new JPanel();

        button1 = new JButton("Profile");
        Color c1 = new Color(102, 102, 102);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(Color.WHITE);
        button1.setBackground(c1);

        button2 = new JButton("Duty");
        Color c2 = new Color(102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button2.setBackground(c2);
        button2.setForeground(Color.WHITE);

        button3 = new JButton("Meetings");
        Color c3 = new Color(204, 204, 204);
        Color ct = new Color(0, 0, 0);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button3.setBackground(c3);
        button3.setForeground(ct);

        button4 = new JButton("Log Out");
        Color c4 = new Color(102, 102, 102);
        button4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button4.setBackground(c4);
        button4.setForeground(Color.WHITE);

        button1.setBounds(10, 75, 180, 40);
        button2.setBounds(10, 125, 180, 40);
        button3.setBounds(10, 175, 180, 40);
        button4.setBounds(10, 500, 180, 40);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // The Notice Board: 
        title1 = new JLabel("Meeting Notice! (IMPORTANT!!!)");
        title1.setFont(new Font("Roboto", Font.BOLD, 28));
        title1.setForeground(Color.RED);
        title1.setBounds(240, 20, 500, 50);
        panel.add(title1);

        text1 = new JLabel("<html>The tournament is going through some Changes.<br>" +
        "During current circumstances the schedule can change.<br>"
        + "Your participation is mandatory. Come to sports complex at sharp 4pm today.</html>");
        text1.setFont(new Font("Roboto", Font.PLAIN, 22));
        text1.setBounds(220, 70, 500, 150);
        panel.add(text1);

        title2 = new JLabel("Daily Meeting (Rescheduled!)");
        title2.setFont(new Font("Roboto", Font.BOLD, 28));
        title2.setForeground(Color.RED);
        title2.setBounds(270, 280, 500, 50);
        panel.add(title2);

        text2 = new JLabel("<html>The following meeting time is 11am at ground.<br>"+ "Be present for attendance and the conference of todays programs.</html>");
        text2.setFont(new Font("Roboto", Font.PLAIN, 22));
        text2.setBounds(220, 300, 500, 150);
        panel.add(text2);

        claim = new JButton("Claimed");
        claim.setBounds(340, 470, 200, 40);
        claim.setFont(new Font("Roboto", Font.PLAIN, 20));
        claim.setForeground(new Color(25, 118, 211));
        claim.setBackground(new Color(255, 255, 255));
        claim.setCursor(new Cursor(Cursor.HAND_CURSOR));
        claim.setFocusPainted(false);
        panel.add(claim);
        
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
                new VolunteerProfile(name,id,uName).setVisible(true);
            } else if (e.getSource() == button2) {
                setVisible(false);
                new VolunteerDuty(name,id,uName).setVisible(true);
            } else if (e.getSource() == button3) {
                new VolunteerMeeting(name,id,uName).setVisible(true);
            }else if (e.getSource() == button4) {
                this.setVisible(false);
				new Login().setVisible(true);
                // home page link
            }
        }
        
    public static void main(String[] args) {
       // VolunteerMeeting ad = new VolunteerMeeting();
        //ad.setVisible(true);
    }
}
