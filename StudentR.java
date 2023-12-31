import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File; // Add this import statement
import java.io.FileWriter;
import java.io.IOException;


public class StudentR extends JFrame implements ActionListener{
    JPanel panel;
    JLabel vReg, vrMsg, fName, lName, gender, sId, vId, pass, games, payment, txtSign;
    JTextField txt1, txt2, txt3, txt4;
    JPasswordField p1;
    JComboBox cShift, cPayment;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bt1;
	JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	JButton b1, btnSubmit, btnLogIn;
	JTextArea a1;
	ImageIcon i1;
	Color color, color2;
	Font f1, f2, f3;

    public StudentR() {
        super("Student Registration");
        super.setBounds(450, 175, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color = new Color(10, 220, 255);

        //step 4(b)
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(color);

        f1 = new Font("Segoe UI", Font.BOLD, 36);
        f2 = new Font("Segoe UI", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        b1 = new JButton();
        b1.setIcon(new ImageIcon("img/step-back.png"));
        b1.setBounds(15, 8, 35, 40);
        b1.setForeground(Color.white);
        b1.setFont(f3);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
		b1.addActionListener(this);
        panel.add(b1);

        // the title section: 

        vReg = new JLabel("Student Registration");
        vReg.setBounds(200, 0, 400, 50);
        vReg.setFont(f1);
        vReg.setForeground(Color.WHITE);
        panel.add(vReg);


        vrMsg = new JLabel("Explore the amazing events!");
        vrMsg.setBounds(220, 30, 400, 50);
        vrMsg.setFont(f3);
        vrMsg.setForeground(Color.WHITE);
        panel.add(vrMsg);


        // the name section: 

        fName = new JLabel("Full Name : ");
        fName.setBounds(120, 80, 150, 40);
        fName.setForeground(Color.white);
        fName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        panel.add(fName);

        txt1 = new JTextField();
        txt1.setBounds(270, 90, 180, 30);
        txt1.setForeground(Color.BLUE);
        txt1.setBackground(Color.white);
        txt1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txt1.setCaretColor(Color.BLUE);
        txt1.setBorder(null);
        txt1.setOpaque(true);
        panel.add(txt1);


        lName = new JLabel("User Name : ");
        lName.setBounds(120, 120, 150, 40);
        lName.setForeground(Color.white);
        lName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        panel.add(lName);

        txt2 = new JTextField();
        txt2.setBounds(270, 130, 180, 30);
        txt2.setForeground(Color.BLUE);
        txt2.setBackground(Color.white);
        txt2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        txt2.setCaretColor(Color.BLUE);
        txt2.setBorder(null);
        txt2.setOpaque(true);
        panel.add(txt2);

        // Choose gender:   

        gender = new JLabel("Select Gender : ");
        gender.setBounds(120, 170, 180, 40);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(gender);

        bt1 = new ButtonGroup();

        rb1 = new JRadioButton("Male");
        rb1.setBounds(300, 180, 100, 30);
        rb1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        rb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rb1.setForeground(Color.white);
        rb1.setBorderPainted(false);
        rb1.setContentAreaFilled(false);
        rb1.setFocusPainted(false);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(420, 180, 100, 30);
        rb2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        rb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rb2.setForeground(Color.white);
        rb2.setBorderPainted(false);
        rb2.setContentAreaFilled(false);
        rb2.setFocusPainted(false);

        rb3 = new JRadioButton("Others");
        rb3.setBounds(530, 180, 180, 30);
        rb3.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        rb3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rb3.setForeground(Color.white);
        rb3.setBorderPainted(false);
        rb3.setContentAreaFilled(false);
        rb3.setFocusPainted(false);

        bt1.add(rb1);
        bt1.add(rb2);
        bt1.add(rb3);

        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);

        // Credentials 
        sId = new JLabel("Student Id : ");
        sId.setBounds(120, 230, 150, 40);
        sId.setForeground(Color.white);
        sId.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(sId);

        txt3 = new JTextField();
        txt3.setBounds(270, 240, 180, 30);
        txt3.setForeground(Color.BLUE);
        txt3.setBackground(Color.white);
        txt3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txt3.setCaretColor(Color.BLUE);
        txt3.setBorder(null);
        txt3.setOpaque(true);
        panel.add(txt3);

        pass = new JLabel("Password: ");
        pass.setBounds(120, 280, 150, 40);
        pass.setForeground(Color.white);
        pass.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(pass);

        p1 = new JPasswordField();
        p1.setBounds(270, 290, 180, 30);
        p1.setEchoChar('*');
        p1.setForeground(Color.BLUE);
        p1.setBackground(Color.white);
        p1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p1.setCaretColor(Color.BLUE);
        p1.setBorder(null);
        p1.setOpaque(true);
        panel.add(p1);

        // Interests:
        games = new JLabel("Events of interest:");
        games.setForeground(Color.white);
        games.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		games.setBounds(120,320,200,50);
		panel.add(games);
		
		cb1 = new JCheckBox("Volleyball");
        cb1.setBounds(300, 320, 130, 50);
        cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb1.setForeground(Color.white);
        cb1.setFocusPainted(false);
        cb1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb1.setContentAreaFilled(false);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Badminton");
        cb2.setBounds(420, 320, 130, 50);
        cb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb2.setForeground(Color.white);
        cb2.setFocusPainted(false);
        cb2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb2.setContentAreaFilled(false);
		panel.add(cb2);
		
		cb3 = new JCheckBox("BasketBall");
        cb3.setBounds(550, 320, 130, 50);
        cb3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb3.setForeground(Color.white);
        cb3.setFocusPainted(false);
        cb3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb3.setContentAreaFilled(false);
		panel.add(cb3);
		
		cb4 = new JCheckBox("FutSal");
        cb4.setBounds(680, 320, 130, 50);
        cb4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb4.setForeground(Color.white);
        cb4.setFocusPainted(false);
        cb4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb4.setContentAreaFilled(false);
        panel.add(cb4);
        
		cb5 = new JCheckBox("Handball");
        cb5.setBounds(300, 360, 130, 60);
        cb5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb5.setForeground(Color.white);
        cb5.setFocusPainted(false);
        cb5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb5.setContentAreaFilled(false);
        panel.add(cb5);
        
		cb6 = new JCheckBox("Table tennis");
        cb6.setBounds(420, 360, 130, 60);
        cb6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb6.setForeground(Color.white);
        cb6.setFocusPainted(false);
        cb6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        cb6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb6.setContentAreaFilled(false);
        panel.add(cb6);
        
		cb7 = new JCheckBox("Chess");
        cb7.setBounds(555, 360, 80, 60);
        cb7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb7.setForeground(Color.white);
        cb7.setFocusPainted(false);
        cb7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb7.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb7.setContentAreaFilled(false);
        panel.add(cb7);
        
		cb8 = new JCheckBox("Carom");
        cb8.setBounds(680, 360, 80, 60);
        cb8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb8.setForeground(Color.white);
        cb8.setFocusPainted(false);
        cb8.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cb8.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb8.setContentAreaFilled(false);
        panel.add(cb8);

        // Choose your duty:
        payment = new JLabel("Payment Options: ");
        payment.setBounds(120, 410,200, 40);
        payment.setForeground(Color.white);
        payment.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(payment);

        String payments[] = new String[]
		{"On Spot", "Digital", "Bank"};
		
		
		cPayment = new JComboBox(payments);
        cPayment.setBounds(320, 410, 130, 35);
        cPayment.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cPayment.setForeground(Color.BLUE);
		panel.add(cPayment);
        
        // submission and login
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(140, 470, 400, 40);
        btnSubmit.setFont(f2);
        btnSubmit.setForeground(new Color(25, 118, 211));
        btnSubmit.setBackground(new Color(255, 255, 255));
        btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSubmit.setFocusPainted(false);
		btnSubmit.addActionListener(this);
        panel.add(btnSubmit);

        txtSign = new JLabel("Already have registered?");
        txtSign.setBounds(200, 510, 240, 40);
        txtSign.setForeground(Color.white);
        txtSign.setFont(f3);
        panel.add(txtSign);

        btnLogIn = new JButton("LogIn");
        btnLogIn.setBounds(405, 510, 90, 40);
        btnLogIn.setForeground(Color.white);
        btnLogIn.setFont(f3);
        btnLogIn.setForeground(new Color(255, 255, 255));
        btnLogIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogIn.setFocusPainted(false);
        btnLogIn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnLogIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogIn.setContentAreaFilled(false);
		btnLogIn.addActionListener(this);
        panel.add(btnLogIn);

        super.add(panel);
        setResizable(false);
		setLocationRelativeTo(null);
    }
	
	private boolean areAllFieldsFilled() {
        // Check if all text fields and checkboxes are filled/selected
        return !txt1.getText().isEmpty() &&
                !txt2.getText().isEmpty() &&
                (rb1.isSelected() || rb2.isSelected() || rb3.isSelected()) &&
                !txt3.getText().isEmpty() &&
                !p1.getText().isEmpty() &&
                (cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected() ||
                        cb5.isSelected() || cb6.isSelected() || cb7.isSelected() || cb8.isSelected());
    }
	
	private void saveUserData() {
    String username = txt2.getText(); // Assuming the username is the first name
    String fileName = "student/" + username + ".txt";

    try {
        File folder = new File("student");
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter writer = new FileWriter(fileName);
        writer.write("Full Name: " + txt1.getText() + "\n");
        writer.write("User Name: " + txt2.getText() + "\n");

        // Gender
        String genderText = rb1.isSelected() ? "Male" : (rb2.isSelected() ? "Female" : "Others");
        writer.write("Gender: " + genderText + "\n");

        // Student ID and Password
        writer.write("Student ID: " + txt3.getText() + "\n");
        writer.write("Password: " + new String(p1.getPassword()) + "\n");

        // Events of interest
        writer.write("Interest: ");
        if (cb1.isSelected()) writer.write("Volleyball\n");
        if (cb2.isSelected()) writer.write("Badminton\n");
        if (cb3.isSelected()) writer.write("Basketball\n");
        if (cb4.isSelected()) writer.write("FutSal\n");
        if (cb5.isSelected()) writer.write("Handball\n");
        if (cb6.isSelected()) writer.write("Table tennis\n");
        if (cb7.isSelected()) writer.write("Chess\n");
        if (cb8.isSelected()) writer.write("Carom\n");

        // Payment Option
        writer.write("Payment: " + cPayment.getSelectedItem() + "\n");

        // Add more fields as needed

        writer.close();

        JOptionPane.showMessageDialog(this, "successfully Registered!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Cannot Registered", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1) 
		{
			Login obj = new Login();
			obj.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btnLogIn){
			Login obj = new Login();
			obj.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btnSubmit){
			if (areAllFieldsFilled()) {
                saveUserData();
				this.setVisible(false);
			   new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
		}
	}
    
    public static void main(String[] args) {
        //StudentR vr = new StudentR();
        //vr.setVisible(true);
    }
}

