import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VolunteerR extends JFrame implements ActionListener{
    JPanel panel;
    JLabel vReg, vrMsg, fName, lName, gender, sId, vId, pass, duty, shift, txtSign;
    JTextField txt1, txt2, txt3, txt4;
    JPasswordField p1;
    JComboBox cShift, cDuty;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bt1;
	JCheckBox cb1;
	JButton b1, btnLogIn, btnSignup;
	JTextArea a1;
	ImageIcon i1;
	Color color, color2;
	Font f1, f2, f3;

    public VolunteerR() {
        super("volunteer Registration");
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
		b1.addActionListener(this);
        b1.setContentAreaFilled(false);
        panel.add(b1);

        // the title section: 

        vReg = new JLabel("Volunteer Registration");
        vReg.setBounds(200, 0, 400, 50);
        vReg.setFont(f1);
        vReg.setForeground(Color.WHITE);
        panel.add(vReg);


        vrMsg = new JLabel("It's awesome to take responsibilities!");
        vrMsg.setBounds(220, 30, 400, 50);
        vrMsg.setFont(f3);
        vrMsg.setForeground(Color.WHITE);
        panel.add(vrMsg);


        // the name section: 

        fName = new JLabel("User Name : ");
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


        lName = new JLabel("Full Name : ");
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
        sId = new JLabel("Volunteer Id: ");
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

        vId = new JLabel("Phone Number : ");
        vId.setBounds(120, 280, 150, 40);
        vId.setForeground(Color.white);
        vId.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(vId);

        txt4 = new JTextField();
        txt4.setBounds(270, 290, 180, 30);
        txt4.setForeground(Color.BLUE);
        txt4.setBackground(Color.white);
        txt4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txt4.setCaretColor(Color.BLUE);
        txt4.setBorder(null);
        txt4.setOpaque(true);
        panel.add(txt4);

        pass = new JLabel("Password: ");
        pass.setBounds(120, 330, 150, 40);
        pass.setForeground(Color.white);
        pass.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(pass);

        p1 = new JPasswordField();
        p1.setBounds(270, 340, 180, 30);
        p1.setEchoChar('*');
        p1.setForeground(Color.BLUE);
        p1.setBackground(Color.white);
        p1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        p1.setCaretColor(Color.BLUE);
        p1.setBorder(null);
        p1.setOpaque(true);
        panel.add(p1);


        // Choose your duty:
        duty = new JLabel("Duty: ");
        duty.setBounds(120, 390, 150, 40);
        duty.setForeground(Color.white);
        duty.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(duty);

        String duties[] = new String[]
		{"Direction", "Coordination", "Disciplinary", "Volunteer"};
		
		
		cDuty = new JComboBox(duties);
        cDuty.setBounds(200, 390, 130, 35);
        cDuty.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cDuty.setForeground(Color.BLUE);
		panel.add(cDuty);

        // choose your shift: 
        shift = new JLabel("Shift: ");
        shift.setBounds(420, 390, 150, 40);
        shift.setForeground(Color.white);
        shift.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        panel.add(shift);

        String shifts[] = new String[]
		{"Morning", "Day", "Afternoon"};
		
		
		cShift = new JComboBox(shifts);
        cShift.setBounds(480, 390, 130, 35);
        cShift.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        cShift.setForeground(Color.BLUE);
        panel.add(cShift);
        
        // submission and login
        btnLogIn = new JButton("Submit");
        btnLogIn.setBounds(140, 460, 400, 40);
        btnLogIn.setFont(f2);
        btnLogIn.setForeground(new Color(25, 118, 211));
        btnLogIn.setBackground(new Color(255, 255, 255));
        btnLogIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogIn.setFocusPainted(false);
		btnLogIn.addActionListener(this);
        panel.add(btnLogIn);

        txtSign = new JLabel("Already have an account?");
        txtSign.setBounds(200, 500, 240, 40);
        txtSign.setForeground(Color.white);
        txtSign.setFont(f3);
        panel.add(txtSign);

        btnSignup = new JButton("LogIn");
        btnSignup.setBounds(415, 500, 90, 40);
        btnSignup.setForeground(Color.white);
        btnSignup.setFont(f3);
        btnSignup.setForeground(new Color(255, 255, 255));
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSignup.setFocusPainted(false);
        btnSignup.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSignup.setContentAreaFilled(false);
		btnSignup.addActionListener(this);
        panel.add(btnSignup);

        super.add(panel);
        setResizable(false);
		setLocationRelativeTo(null);
    }
	
	
	private void saveUserData() {
    String username = txt1.getText();
    String fileName = "volunteer/" + username + ".txt";

    try {
        File folder = new File("volunteer");
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter writer = new FileWriter(fileName);
        writer.write("User Name: " + txt1.getText() + "\n");
        writer.write("Full Name: " + txt2.getText() + "\n");

        // Gender
        String genderText = rb1.isSelected() ? "Male" : (rb2.isSelected() ? "Female" : "Others");
        writer.write("Gender: " + genderText + "\n");

        // Student ID and Volunteer ID
        writer.write("Volunteer ID: " + txt3.getText() + "\n");
        writer.write("Phone Number: " + txt4.getText() + "\n");

        // Password
        writer.write("Password: " + new String(p1.getPassword()) + "\n");

        // Duty
        writer.write("Duty: " + cDuty.getSelectedItem() + "\n");

        // Shift
        writer.write("Shift: " + cShift.getSelectedItem() + "\n");

        writer.close();

        JOptionPane.showMessageDialog(this, "Successfully Registered!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Registration Failed", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean areAllFieldsFilled() {
    // Check if all text fields, radio buttons, and combo boxes are filled/selected
    return !txt1.getText().isEmpty() &&
            !txt2.getText().isEmpty() &&
            (rb1.isSelected() || rb2.isSelected() || rb3.isSelected()) &&
            !txt3.getText().isEmpty() &&
            !txt4.getText().isEmpty() &&
            !new String(p1.getPassword()).isEmpty() &&
            !cDuty.getSelectedItem().toString().isEmpty() &&
            !cShift.getSelectedItem().toString().isEmpty();
}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1) 
		{
			Login obj = new Login();
			obj.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btnSignup){
			Login obj = new Login();
			obj.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == btnLogIn){
			if (areAllFieldsFilled()) {
               saveUserData();
			   this.setVisible(false);
			   new Login().setVisible(true);
    }       else {
             JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Incomplete Form", JOptionPane.WARNING_MESSAGE);
    }
		}
	}
    
    public static void main(String[] args) {
       // VolunteerR vr = new VolunteerR();
        //vr.setVisible(true);
    }
}
