import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.FileReader;
import java.io.IOException;



public class Login extends JFrame  implements ActionListener {
	String fullName,fid,uName,sid,skill;
    JPanel panel;
	JLabel login, lgMsg, name, pass, line1, line2, icon1, txtSign;
	JTextField txt1, txt2;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bt1;
	JCheckBox cb1;
	JPasswordField p1;
	JButton b1, icon2, icon3, btnLogIn, btnSignup, btnForgotten;
	JTextArea a1;
	ImageIcon i1;
	Color color, color2 ,color3;
	Font f1, f2, f3;

    public Login() {
        super("Login");
        super.setBounds(450, 175, 800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color = new Color(10, 220, 255);
		

        //step 4(b)
		
		// Load the background image
		
		
        BufferedImage backgroundImage = loadImage("img/bgLogin.jpg");


        // Create a custom JPanel with a transparent overlay
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw the background image
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

                
            }
        };
		panel.setLayout(null);
        panel.setBackground(new Color(0, 0, 0, 0));
		

		
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

        
		login = new JLabel("Log In");
        login.setBounds(330, 0, 200, 50);
        login.setFont(f1);
        login.setForeground(Color.WHITE);
        panel.add(login);
		

         
		 
        lgMsg = new JLabel("Let's begin the exiting journey!");
        lgMsg.setBounds(220, 55, 400, 50);
        lgMsg.setFont(f2);
        lgMsg.setForeground(Color.WHITE);
        panel.add(lgMsg);
		

        // The optional login for students, volunteers and admins 

        bt1 = new ButtonGroup();

        rb1 = new JRadioButton("Admin Log In");
        rb1.setBounds(100, 105, 180, 30);
        rb1.setFont(f3);
        rb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rb1.setForeground(Color.white);
        rb1.setBorderPainted(false);
        rb1.setContentAreaFilled(false);
        rb1.setFocusPainted(false);

        rb2 = new JRadioButton("Volunteer Log In");
        rb2.setBounds(280, 105, 180, 30);
        rb2.setFont(f3);
        rb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rb2.setForeground(Color.white);
        rb2.setBorderPainted(false);
        rb2.setContentAreaFilled(false);
        rb2.setFocusPainted(false);

        rb3 = new JRadioButton("Student Log In");
        rb3.setBounds(460, 105, 180, 30);
        rb3.setFont(f3);
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

        name = new JLabel("User Name");
        name.setBounds(125, 160, 300, 40);
        name.setForeground(Color.white);
        name.setFont(f2);
        panel.add(name);
		
		color3 = new Color(12,11,87,100);
		
		txt1 = new JTextField();
        txt1.setBounds(125, 200,400,40);
		txt1.setBackground(color);
		txt1.setForeground(Color.white);
		txt1.setBorder(null);
        panel.add(txt1);

        line1 = new JLabel("________________________________________________________");
        line1.setBounds(125, 220, 400, 40);
        line1.setForeground(Color.white);
        line1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line1);

        icon1 = new JLabel();
        icon1.setIcon(new ImageIcon("img/icon.png"));
        icon1.setBounds(540, 180, 80, 80);
        icon1.setForeground(Color.white);
        icon1.setFont(f2);
        panel.add(icon1);

        pass = new JLabel("Password");
        pass.setBounds(125, 250, 300, 40);
        pass.setForeground(Color.white);
        pass.setFont(f2);
        panel.add(pass);
		
		p1 = new JPasswordField();
        p1.setBounds(125, 280,300,40);
		p1.setBackground(color);
		p1.setBorder(null);
        panel.add(p1);

        line2 = new JLabel("________________________________________________________");
        line2.setBounds(125, 300, 400, 40);
        line2.setForeground(Color.white);
        line2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        panel.add(line2);

        icon2 = new JButton();
        icon2.setIcon(new ImageIcon("img/icon2.png"));
        icon2.setBounds(540, 290, 25, 20);
        icon2.setForeground(Color.white);
        icon2.setFont(f2);
        icon2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        icon2.setFocusPainted(false);
        icon2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        icon2.setContentAreaFilled(false);
		icon2.addActionListener(this);
        panel.add(icon2);

        icon3 = new JButton();
        icon3.setIcon(new ImageIcon("img/icon3.png"));
        icon3.setBounds(540, 290, 25, 20);
        icon3.setForeground(Color.white);
        icon3.setFont(f2);
        icon3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        icon3.setFocusPainted(false);
        icon3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        icon3.setContentAreaFilled(false);
        icon3.setVisible(false);
        panel.add(icon3);


        cb1 = new JCheckBox("Remember me");
        cb1.setBounds(130, 330, 180, 40);
        cb1.setFont(f3);
        cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb1.setForeground(Color.white);
        cb1.setFocusPainted(false);
        cb1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cb1.setContentAreaFilled(false);
        panel.add(cb1);

        btnForgotten = new JButton("Forgot Password?");
        btnForgotten.setBounds(350, 330, 170, 40);
        btnForgotten.setForeground(Color.white);
        btnForgotten.setFont(f3);
        btnForgotten.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnForgotten.setFocusPainted(false);
        btnForgotten.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btnForgotten.setContentAreaFilled(false);
        panel.add(btnForgotten);

        btnLogIn = new JButton("Login");
        btnLogIn.setBounds(140, 390, 400, 40);
        btnLogIn.setFont(f2);
        btnLogIn.setForeground(new Color(25, 118, 211));
        btnLogIn.setBackground(new Color(255, 255, 255));
        btnLogIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogIn.setFocusPainted(false);
		btnLogIn.addActionListener(this);
        panel.add(btnLogIn);

        txtSign = new JLabel("Don't have an account?");
        txtSign.setBounds(200, 440, 240, 40);
        txtSign.setForeground(Color.white);
        txtSign.setFont(f3);
        panel.add(txtSign);

        btnSignup = new JButton("Sign Up");
        btnSignup.setBounds(400, 440, 90, 40);
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
	
	private BufferedImage loadImage(String filename) {
        try {
            return ImageIO.read(getClass().getResource(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public void actionPerformed(ActionEvent ae) {
	  if(ae.getSource() == b1){ //back button
		  Home obj = new Home();
		  obj.setVisible(true);
		  this.setVisible(false);
	  }
	 else if (ae.getSource() == icon2){ //show password button
		 p1.setEchoChar((char) 0);
	 }
		
    else if (ae.getSource() == btnSignup) {
		
		//System.out.println("Sign Up button clicked");
        // Create an array of radio buttons
        JRadioButton adminButton = new JRadioButton("Sign up as Admin");
        JRadioButton volunteerButton = new JRadioButton("Sign up as Volunteer");
        JRadioButton studentButton = new JRadioButton("Sign up as Player");

        // Create a button group
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(adminButton);
        radioButtonGroup.add(volunteerButton);
        radioButtonGroup.add(studentButton);

        // Create an array of objects to show in the option pane
        Object[] options = {adminButton, volunteerButton, studentButton};

        // Show the option pane
        int result = JOptionPane.showOptionDialog(
                this,
                options,
                "Sign Up Options",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                null
        );

        // Process the user's choice
        if (result == JOptionPane.YES_OPTION) {
            if (adminButton.isSelected()) {
                // Handle admin signup
                AdminR adminRegistration = new AdminR();
                adminRegistration.setVisible(true);
            } else if (volunteerButton.isSelected()) {
                // Handle volunteer signup
                VolunteerR volunteerRegistration = new VolunteerR();
                volunteerRegistration.setVisible(true);
            } else if (studentButton.isSelected()) {
                // Handle student signup
                StudentR studentRegistration = new StudentR();
                studentRegistration.setVisible(true);
            }
        }
    }
	else if(ae.getSource() == btnLogIn){
		
		//System.out.println("Login");
		if (rb3.isSelected()) { // Student Log In
                String username = txt1.getText();
                String password = new String(p1.getPassword());
                if (validateStudentLogin(username, password)) {
                    //JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
					PlayerProfile obj = new PlayerProfile(fullName,sid,skill,uName);
					this.setVisible(false);
					obj.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
	}
	  else if (rb1.isSelected()){
		   String username = txt1.getText();
           String password = new String(p1.getPassword());

        if (validateAdminLogin(username, password)) {
			AdminProfile obj = new AdminProfile(fullName,fid,uName);
			this.setVisible(false);
			obj.setVisible(true);
           // JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Perform further actions if needed upon successful login
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
		  
	  }
	  else if (rb2.isSelected()){
		  String username = txt1.getText();
        String password = new String(p1.getPassword());

        if (validateVolunteerLogin(username, password)) {
            //JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Perform further actions if needed upon successful login
			VolunteerProfile obj = new VolunteerProfile(fullName,fid,uName);
			this.setVisible(false);
			obj.setVisible(true);
			
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
	  }
	  else{
		  JOptionPane.showMessageDialog(this, "Please select login type first", "Error", JOptionPane.ERROR_MESSAGE);
	  }
	  //this.setVisible(false);
   }
}

//validation for admin login
private boolean validateAdminLogin(String username, String password) {
    File adminFile = new File("admin/" + username + ".txt");

    if (adminFile.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(adminFile))) {
            // Read the first line (User Name)
            String firstLine = reader.readLine();
            String savedUsername = firstLine.substring(firstLine.indexOf(":") + 2).trim();
			this.uName=savedUsername;

            // Read the second line (Full Name)
            this.fullName = reader.readLine().substring(firstLine.indexOf(":") + 2).trim();

            // Read the third line (Gender)
            reader.readLine();

            // Read the fourth line (Faculty ID)
            this.fid = reader.readLine().substring(firstLine.indexOf(":") + 2).trim();
			

            // Read the password line and extract the saved password
            String passwordLine = reader.readLine();
            String savedPassword = passwordLine.substring(passwordLine.indexOf(":") + 2).trim();

            // Check if the entered username and password match the saved values
            if (username.equals(savedUsername) && password.equals(savedPassword)) {
                return true;
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    return false;
}
//validation for student login
	
private boolean validateStudentLogin(String username, String password) {
    File studentFile = new File("student/" + username + ".txt");

    if (studentFile.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
            // Read the first line (assuming it contains "First Name: ")
            
            reader.readLine(); 
            // Read the second line (assuming it contains "Last Name: ")
            
			String firstLine = reader.readLine();
            String savedUsername = firstLine.substring(firstLine.indexOf(":") + 2).trim();
			this.fullName = savedUsername;

            // Read the third line (assuming it contains "Gender: ")
            reader.readLine();

            // Read the fourth line (assuming it contains "Student ID: ")
            
			this.sid = reader.readLine().substring(firstLine.indexOf(":") + 2).trim();

            // Read the password line and extract the saved password
            String passwordLine = reader.readLine();
            String savedPassword = passwordLine.substring(passwordLine.indexOf(":") + 2).trim();
			reader.readLine();
			this.skill = reader.readLine();

            // Check if the entered username and password match the saved values
            if (username.equals(savedUsername) && password.equals(savedPassword)) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    return false;
}

//validation for volunteer

private boolean validateVolunteerLogin(String username, String password) {
    File volunteerFile = new File("volunteer/" + username + ".txt");

    if (volunteerFile.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(volunteerFile))) {
            // Read the first line (assuming it contains "First Name: ")
            String firstLine = reader.readLine();
            String savedUsername = firstLine.substring(firstLine.indexOf(":") + 2).trim();
			this.fullName = savedUsername;

            // Read the second line (assuming it contains "User Name: ")
            this.uName=reader.readLine();

            // Read the third line (assuming it contains "Gender: ")
            reader.readLine();

            // Read the fourth line (assuming it contains "Student ID: ")
            this.fid = reader.readLine().substring(firstLine.indexOf(":") + 2).trim();;
			

            // Read the fifth line (assuming it contains "Volunteer ID: ")
            reader.readLine();

            // Read the password line and extract the saved password
            String passwordLine = reader.readLine();
            String savedPassword = passwordLine.substring(passwordLine.indexOf(":") + 2).trim();

            // Check if the entered username and password match the saved values
            if (username.equals(savedUsername) && password.equals(savedPassword)) {
                return true;
            } else {
                System.out.println("Entered username: " + username);
                System.out.println("Entered password: " + password);
                System.out.println("Saved username: " + savedUsername);
                System.out.println("Saved password: " + savedPassword);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    return false;
}





    
    public static void main(String[] args) {
        //Login lg = new Login();
        //lg.setVisible(true);
    }
}
