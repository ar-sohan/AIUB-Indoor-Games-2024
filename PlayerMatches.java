import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PlayerMatches extends JFrame implements ActionListener {
    private String name,id,uName;
    private JPanel panel;
    private JLabel table1Title;
    private JCheckBox cb1;
    private JButton button1, button2, button3, button4;

    public PlayerMatches(String name,String id, String uName) {
        super("Your Matches Today");
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
        Color c2 = new Color(204, 204, 204);
        Color ct = new Color(0, 0, 0);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button2.setBackground(c2);
        button2.setForeground(ct);

        button3 = new JButton("Upcoming!");
        Color c3 = new Color(102, 102, 102);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button3.setBackground(c3);
        button3.setForeground(Color.WHITE);

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

        // meeting table
        table1Title = new JLabel("Your Matches Today");
        table1Title.setBounds(310, 150, 400, 30);
        table1Title.setFont(new Font("Roboto", Font.BOLD, 26));
        panel.add(table1Title);
				
		JLabel Place= new JLabel("Place");
		Place.setBounds(270, 220,90,30);
		Top_Make_UP(Place);
		panel.add(Place);
				
		JLabel Game= new JLabel("Game");
		Game.setBounds(360, 220,90,30);
		Top_Make_UP(Game);
		panel.add(Game);
				
		JLabel Time= new JLabel("Time");
		Time.setBounds(450, 220,90,30);
		Top_Make_UP(Time);
		panel.add(Time);
				
		JLabel Opponent= new JLabel("Opponent");
		Opponent.setBounds(540, 220,90,30);
		Top_Make_UP(Opponent);
		panel.add(Opponent);
		
		//Table Row 1 Contents 
		
		JLabel R1C1= new JLabel("Playground");
		R1C1.setBounds(270, 250,90,30);
		Bottom_Make_UP(R1C1);
		panel.add(R1C1);	
		
		JLabel R1C2= new JLabel("Handball");
		R1C2.setBounds(360, 250,90,30);
		Bottom_Make_UP(R1C2);
		panel.add(R1C2);		
		
		JLabel R1C3= new JLabel("2pm");
		R1C3.setBounds(450, 250,90,30);
		Bottom_Make_UP(R1C3);
		panel.add(R1C3);		
		
		JLabel R1C4= new JLabel("TeamX");
		R1C4.setBounds(540, 250,90,30);
		Top_Make_UP(R1C4);
		add(R1C4);		
		
		//Table Row 2 Contents 
		
		JLabel  R2C1= new JLabel("Indoor");
		R2C1.setBounds(270, 280,90,30);
		Bottom_Make_UP(R2C1);
		add(R2C1);	
		
		JLabel  R2C2= new JLabel("Chess");
		R2C2.setBounds(360, 280,90,30);
		Bottom_Make_UP(R2C2);
		add(R2C2);		
		
		JLabel  R2C3= new JLabel("12am");
		R2C3.setBounds(450, 280,90,30);
		Bottom_Make_UP(R2C3);
		add(R2C3);
		
		JLabel R2C4= new JLabel("TeamX");
		R2C4.setBounds(540, 280,90,30);
		Top_Make_UP(R2C4);
        add(R2C4);
        
		//Table Row 3 Contents 
		
		JLabel  R3C1= new JLabel("BM Court");
		R3C1.setBounds(270, 310,90,30);
		Bottom_Make_UP(R3C1);
		add(R3C1);	
		
		JLabel  R3C2= new JLabel("Badminton");
		R3C2.setBounds(360, 310,90,30);
		Bottom_Make_UP(R3C2);
		add(R3C2);		
		
		JLabel  R3C3= new JLabel("11am");
		R3C3.setBounds(450, 310,90,30);
		Bottom_Make_UP(R3C3);
		add(R3C3);
		
		JLabel R3C4= new JLabel("TeamX");
		R3C4.setBounds(540, 310,90,30);
		Top_Make_UP(R3C4);
        add(R3C4);
		
        cb1 = new JCheckBox("I have no clash with these times!");
        cb1.setBounds(270, 350, 400, 50);
        cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        panel.add(cb1);

        super.setBounds(450, 200, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        panel.setLayout(null);
        super.add(panel);
    }
    
    public void Top_Make_UP(JLabel jLabel)
	{
		jLabel.setForeground(Color.WHITE);
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setVerticalAlignment(SwingConstants.CENTER);
        jLabel.setOpaque(true); 
        jLabel.setBackground(Color.decode("#477977"));
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	}
	
	public void Bottom_Make_UP(JLabel jLabel)
	{
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setVerticalAlignment(SwingConstants.CENTER);
        jLabel.setOpaque(true); 
        jLabel.setBackground(Color.decode("#E7F2EE"));
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
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
       // PlayerMatches ad = new PlayerMatches();
       // ad.setVisible(true);
    }
}

