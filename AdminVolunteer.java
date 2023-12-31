
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class AdminVolunteer extends JFrame implements ActionListener {

    private JPanel panel;
    private String name, fid, uName;
    JLabel tableTitle;
    private JButton button1, button2, button3, button4, button5;
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private String[] column = { "Names", "VolunteerId", "Phones", "Duty", "Shift" };
    public String[] Names = new String[5];
    public String[] Phones = new String[5];
    public String[] VolunteerId = new String[5];
    public String[] Duty = new String[5];
    public String[] Shift = new String[5];
    public String[] rows = new String[5];

    public AdminVolunteer(String name, String fid, String uName) {
        super("Welcome to Volunteer List");
        this.name = name;
        this.fid = fid;
        this.uName = uName;
        panel = new JPanel();

        button1 = new JButton("Profile");
		Color c1 = new Color(102, 102, 102);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(Color.WHITE);
        button1.setBackground(c1);
		
		button2=new JButton("Programs");
        Color c2 = new Color(102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Volunteers");
        Color c3 = new Color(204,204,204);
        Color ct = new Color(0, 0, 0);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button3.setBackground(c3);
        button3.setForeground(ct);
		
		button4=new JButton("Students");
        Color c4 = new Color(102, 102, 102);
        button4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button4.setBackground(c4);
        button4.setForeground(Color.WHITE);
		
		button5=new JButton("Log Out");
        Color c5 = new Color(102, 102, 102);
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);

		button1.setBounds(10,75,180,40);
		button2.setBounds(10,125,180,40);
		button3.setBounds(10,175,180,40);
		button4.setBounds(10,225,180,40);
        button5.setBounds(10,500,180,40);
        
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

        // volunteer table:
        tableTitle = new JLabel("List Of Volunteers For This Event");
        tableTitle.setBounds(310, 20, 400, 50);
        tableTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
        tableTitle.setForeground(Color.BLUE);
        panel.add(tableTitle);


        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(new Color(0, 210, 255));
        table.setRowHeight(40);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.setForeground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(240, 100, 500, 360);
        scroll.setBackground(Color.WHITE);

        /*/
		for (int i = 0; i < 5; i++)
		{
            rows[0] = Names[i];
            rows[1] = VolunteerId[i];
            rows[2] = Phones[i];
            rows[3] = Duty[i];
            rows[4] = Shift[i]; 
            model.addRow(rows);
        }
		*/
		
		File folder = new File("Volunteer");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    readVolunteerFromFile(file);
                }
            }
        }

		
		
        add(scroll);

        

        // final touch
        super.setBounds(450, 200, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        panel.setLayout(null);
        super.add(panel);
    }
	// Read volunteer information from the text file and populate the table
	
	private void readVolunteerFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            String[] volunteerInfo = new String[5];

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Full Name:")) {
                    volunteerInfo[0] = line.split(": ")[1];
                } else if (line.startsWith("Volunteer ID:")) {
                    volunteerInfo[1] = line.split(": ")[1];
                } else if (line.startsWith("Phone Number:")) {
                    volunteerInfo[2] = line.split(": ")[1];
                } else if (line.startsWith("Duty:")) {
                    volunteerInfo[3] = line.split(": ")[1];
                } else if (line.startsWith("Shift:")) {
                    volunteerInfo[4] = line.split(": ")[1];
                }
            }

            model.addRow(volunteerInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            this.setVisible(false);
            new AdminProfile(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button2) {
            this.setVisible(false);
            new AdminProgramme(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button3) {
            this.setVisible(false);
            new AdminVolunteer(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button4) {
            this.setVisible(false);
            new AdminPlayer(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button5) {
            this.setVisible(false);
             new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        // AdminVolunteer ad = new AdminVolunteer();
        // ad.setVisible(true);
    }
}









/*
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class AdminVolunteer extends JFrame implements ActionListener {
    
    private JPanel panel;
	private String name,fid,uName;
    JLabel tableTitle;
    private JButton button1, button2, button3, button4, button5;
    private JTable table;
	private JScrollPane scroll;
    private DefaultTableModel model;
    private String[] column = { "Names", "VolunteerId", "Phones", "Duty", "Shift"};
    public String[] Names = {"Prottoy", "Sudipta", "Kumar", "Shahriar", "Sohan"};
    public String[] Phones = {"10734", "10734", "10734", "10734", "10734"};
    public String[] VolunteerId = {"10734", "10734", "10734", "10734", "10734"};
    public String[] Duty = {"Direction", "Direction", "Direction", "Direction", "Direction"};
    public String[] Shift = {"Morning", "Morning", "Day", "Day", "Night"};
	public String[] rows = new String[10000];

    public AdminVolunteer(String name, String fid, String uName) {
        super("Welcome to Volunteer List");
		this.name= name;
		this.fid = fid;
		this.uName= uName;
        panel = new JPanel();

        button1 = new JButton("Profile");
		Color c1 = new Color(102, 102, 102);
        button1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        button1.setForeground(Color.WHITE);
        button1.setBackground(c1);
		
		button2=new JButton("Programs");
        Color c2 = new Color(102, 102, 102);
        button2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button2.setBackground(c2);
        button2.setForeground(Color.WHITE);
		
		button3=new JButton("Volunteers");
        Color c3 = new Color(204,204,204);
        Color ct = new Color(0, 0, 0);
        button3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button3.setBackground(c3);
        button3.setForeground(ct);
		
		button4=new JButton("Students");
        Color c4 = new Color(102, 102, 102);
        button4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button4.setBackground(c4);
        button4.setForeground(Color.WHITE);
		
		button5=new JButton("Log Out");
        Color c5 = new Color(102, 102, 102);
        button5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		button5.setBackground(c5);
        button5.setForeground(Color.WHITE);

		button1.setBounds(10,75,180,40);
		button2.setBounds(10,125,180,40);
		button3.setBounds(10,175,180,40);
		button4.setBounds(10,225,180,40);
        button5.setBounds(10,500,180,40);
        
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

        // volunteer table:
        tableTitle = new JLabel("List Of Volunteers For This Event");
        tableTitle.setBounds(310, 20, 400, 50);
        tableTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
        tableTitle.setForeground(Color.BLUE);
        panel.add(tableTitle);


        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setBackground(new Color(0, 210, 255));
        table.setRowHeight(40);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);
		table.setForeground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(240, 100, 500, 360);
        scroll.setBackground(Color.WHITE);

        for (int i = 0; i < 5; i++)
		{
            rows[0] = Names[i];
            rows[1] = VolunteerId[i];
            rows[2] = Phones[i];
            rows[3] = Duty[i];
            rows[4] = Shift[i]; 
            model.addRow(rows);
        }
		
		
        add(scroll);
        
        // final touch
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
            new AdminProfile(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button2) {
            this.setVisible(false);
            new AdminProgramme(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button3) {
            this.setVisible(false);
            new AdminVolunteer(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button4) {
            this.setVisible(false);
            new AdminPlayer(name,fid,uName).setVisible(true);
        } else if (e.getSource() == button5) {
            this.setVisible(false);
             new Login().setVisible(true);
        }
    }
        
    public static void main(String[] args) {
       // AdminVolunteer ad = new AdminVolunteer();
       // ad.setVisible(true);
    }
}
*/
