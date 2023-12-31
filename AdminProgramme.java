
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class AdminProgramme extends JFrame implements ActionListener {
    
    private JPanel panel;
	private String name,fid,uName;
    private JLabel table1Title, table2Title;
    public JTextField  R1C4,  R2C4,  R3C4,  R4C4, bR1C4,  bR2C4,  bR3C4,  bR4C4,  tR4C4, tR1C4,  tR2C4,  tR3C4;
    private JButton button1, button2, button3, button4, button5, button6, button7;

    public AdminProgramme(String name, String fid, String uName) {
        super("Your programs Today");
		this.name= name;
		this.fid = fid;
		this.uName= uName;
        panel = new JPanel();

        button1 = new JButton("Profile");
        Color c1 = new Color(102, 102, 102);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(Color.WHITE);
        button1.setBackground(c1);

        button2 = new JButton("Programs");
        Color c2 = new Color(204, 204, 204);
        Color ct = new Color(0, 0, 0);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button2.setBackground(c2);
        button2.setForeground(ct);

        button3 = new JButton("Volunteers");
        Color c3 = new Color(102, 102, 102);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button3.setBackground(c3);
        button3.setForeground(Color.WHITE);

        button4 = new JButton("Students");
        Color c4 = new Color(102, 102, 102);
        button4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button4.setBackground(c4);
        button4.setForeground(Color.WHITE);

        button5 = new JButton("Log Out");
        Color c5 = new Color(102, 102, 102);
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button5.setBackground(c5);
        button5.setForeground(Color.WHITE);

        button6 = new JButton("Update Notice");
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button6.setBackground(Color.decode("#477977"));
        button6.setForeground(Color.WHITE);
		
		button7=new JButton("Update Rechecked");
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button7.setBackground(Color.decode("#477977"));
        button7.setForeground(Color.WHITE);

        button1.setBounds(10, 75, 180, 40);
        button2.setBounds(10, 125, 180, 40);
        button3.setBounds(10, 175, 180, 40);
        button4.setBounds(10, 225, 180, 40);
        button5.setBounds(10, 500, 180, 40);
        button6.setBounds(250, 410, 200, 40);
        button7.setBounds(500, 410, 200, 40);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);

        // meeting table
        table1Title = new JLabel("Meetings Schedule Today");
        table1Title.setBounds(350, 30, 400, 30);
        table1Title.setFont(new Font("Roboto", Font.BOLD, 22));
        panel.add(table1Title);
		
		
		JLabel Place= new JLabel("Place");
		Place.setBounds(250, 90,90,30);
		Top_Make_UP(Place);
		panel.add(Place);
		
		
		JLabel Date= new JLabel("Date");
		Date.setBounds(340, 90,90,30);
		Top_Make_UP(Date);
		panel.add(Date);
		
		
		JLabel Time= new JLabel("Time");
		Time.setBounds(430, 90,90,30);
		Top_Make_UP(Time);
		panel.add(Time);
		
		
		
		JLabel Notice= new JLabel("Importance");
		Notice.setBounds(520, 90,90,30);
		Top_Make_UP(Notice);
		panel.add(Notice);
		
		
		
		JLabel Importance= new JLabel("Notice");
		Importance.setBounds(610, 90,90,30);
		Top_Make_UP(Importance);
		panel.add(Importance);
		
		
		//Table Row 1 Contents 
		
		JLabel R1C1= new JLabel("University");
		R1C1.setBounds(250, 120,90,30);
		Bottom_Make_UP(R1C1);
		panel.add(R1C1);
	
		
		JLabel R1C2= new JLabel("20th");
		R1C2.setBounds(340, 120,90,30);
		Bottom_Make_UP(R1C2);
		panel.add(R1C2);
		
		
		JLabel R1C3= new JLabel("6pm");
		R1C3.setBounds(430, 120,90,30);
		Bottom_Make_UP(R1C3);
		panel.add(R1C3);
		
		
		JLabel R1C5= new JLabel("Medium");
		R1C5.setBounds(520, 120,90,30);
		Top_Make_UP(R1C5);
		add(R1C5);
		
		
		R1C4 = new JTextField();
		R1C4.setBounds(610, 120,90,30);
		R1C4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		
		//Table Row 2 Contents 
		
		JLabel  R2C1= new JLabel("Online");
		R2C1.setBounds(250, 150,90,30);
		Bottom_Make_UP(R2C1);
		add(R2C1);
	
		
		JLabel  R2C2= new JLabel("21th");
		R2C2.setBounds(340, 150,90,30);
		Bottom_Make_UP(R2C2);
		add(R2C2);
		
		
		JLabel  R2C3= new JLabel("11am");
		R2C3.setBounds(430, 150,90,30);
		Bottom_Make_UP(R2C3);
		add(R2C3);
		
		
		JLabel R2C5= new JLabel("Important");
		R2C5.setBounds(520, 150,90,30);
		Top_Make_UP(R2C5);
		add(R2C5);


		R2C4 = new JTextField();
		R2C4.setBounds(610, 150,90,30);
		R2C4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        // report submission table
		table2Title = new JLabel("Report Submission");
        table2Title.setBounds(350, 250, 400, 30);
        table2Title.setFont(new Font("Roboto", Font.BOLD, 22));
        panel.add(table2Title);
		
		//Table top
		
		JLabel Type= new JLabel("Type");
		Type.setBounds(250, 300,90,30);
		Top_Make_UP(Type);
		panel.add(Type);
		
		
		JLabel Office= new JLabel("Office");
		Office.setBounds(340, 300,90,30);
		Top_Make_UP(Office);
		panel.add(Office);
		
		
		JLabel Due= new JLabel("Due");
		Due.setBounds(430, 300,90,30);
		Top_Make_UP(Due);
		add(Due);
		
		
		JLabel Rechecked= new JLabel("Progress");
		Rechecked.setBounds(520, 300,90,30);
		Top_Make_UP(Rechecked);
		panel.add(Rechecked);		
		
		JLabel Progress= new JLabel("Rechecked");
		Progress.setBounds(610, 300,90,30);
		Top_Make_UP(Progress);
		panel.add(Progress);		
		
		//Table Row 1 Contents 
		JLabel bR1C1= new JLabel("Participation");
		bR1C1.setBounds(250, 330,90,30);
		Bottom_Make_UP(bR1C1);
		add(bR1C1);
		
		JLabel bR1C2= new JLabel("VC");
		bR1C2.setBounds(340, 330,90,30);
		Bottom_Make_UP(bR1C2);
		add(bR1C2);
			
		JLabel bR1C3= new JLabel("23rd");
		bR1C3.setBounds(430, 330,90,30);
		Bottom_Make_UP(bR1C3);
		add(bR1C3);
			
		JLabel bR1C5= new JLabel("Complete");
		bR1C5.setBounds(520, 330,90,30);
		Top_Make_UP(bR1C5);
		add(bR1C5);	
		
		bR1C4 = new JTextField();
		bR1C4.setBounds(610, 330,90,30);
		bR1C4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		//Table Row 2 Contents 
		
		JLabel  bR2C1= new JLabel("Performance");
		bR2C1.setBounds(250, 360,90,30);
		Bottom_Make_UP(bR2C1);
		add(bR2C1);
	
		
		JLabel  bR2C2= new JLabel("OSA");
		bR2C2.setBounds(340, 360,90,30);
		Bottom_Make_UP(bR2C2);
		add(bR2C2);
		
		JLabel  bR2C3= new JLabel("24th");
		bR2C3.setBounds(430, 360,90,30);
		Bottom_Make_UP(bR2C3);
		add(bR2C3);
		
		
		JLabel bR2C5= new JLabel("Incomplete");
		bR2C5.setBounds(520, 360,90,30);
		Top_Make_UP(bR2C5);
		add(bR2C5);


		bR2C4 = new JTextField();
		bR2C4.setBounds(610, 360,90,30);
        bR2C4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        add(R1C4);
		add(R2C4);
		add(bR1C4);
		add(bR2C4);

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
            new AdminProfile(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button2) {
           AdminProgramme obj= new AdminProgramme(name,fid,uName);
		   this.setVisible(false);		
		   obj.setVisible(true);
        } else if (e.getSource() == button3) {
            setVisible(false);
           AdminVolunteer obj = new AdminVolunteer(name,fid,uName);
		   obj.setVisible(true);
        } else if (e.getSource() == button4) {
            setVisible(false);
           new AdminPlayer(name,fid,uName);
        } else if (e.getSource() == button5) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
        
    public static void main(String[] args) {
       // AdminProgramme ad = new AdminProgramme();
       // ad.setVisible(true);
    }
}