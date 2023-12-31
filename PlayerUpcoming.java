import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PlayerUpcoming extends JFrame implements ActionListener {
	
    private String name,id,uName;
    private JPanel panel;
    private JLabel title, image1, image2, image3;
    private ImageIcon img1, img2, img3;
    private JButton button1, button2, button3, button4;

    public PlayerUpcoming(String name,String id, String uName) {
        super("The Upcoming Tournaments");
		this.name= name;
		this.id = id;
		this.uName= uName;
        panel = new JPanel();

        button1 = new JButton("Profile");
        Color c1 = new Color(102, 102, 102);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(Color.WHITE);
        button1.setBackground(c1);

        button2 = new JButton("Matches");
        Color c2 = new Color( 102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button2.setBackground(c2);
        button2.setForeground(Color.WHITE);

        button3 = new JButton("Upcoming!");
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

        // Upcoming Tournaments :
        title = new JLabel("Amazing Tournaments On Way");
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setBounds(250, 5, 500, 50);
        panel.add(title);

        img1 = new ImageIcon("img/upcoming.jpg");
        image1 = new JLabel(img1);
        image1.setBounds(240, 70, 220, 240);
        panel.add(image1);

        img2 = new ImageIcon("img/upcoming2.jpg");
        image2 = new JLabel(img2);
        image2.setBounds(500, 70, 220, 240);
        panel.add(image2);

        img3 = new ImageIcon("img/upcoming3.jpg");
        image3 = new JLabel(img3);
        image3.setBounds(210, 300, 500, 300);
        panel.add(image3);

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
            new PlayerProfile(name,id,id,uName).setVisible(true);
        } else if (e.getSource() == button2) {
            this.setVisible(false);
            new PlayerMatches(name,id,uName).setVisible(true);
        } else if (e.getSource() == button3) {
            this.setVisible(false);
            new PlayerUpcoming(name,id,uName).setVisible(true);
        } else if (e.getSource() == button4) {
            this.setVisible(false);
			new Login().setVisible(true);
            // home page link
        }
    }
        
    public static void main(String[] args) {
       // PlayerUpcoming ad = new PlayerUpcoming();
       // ad.setVisible(true);
    }
}


