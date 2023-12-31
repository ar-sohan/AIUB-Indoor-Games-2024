import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.*;

public class Home extends JFrame implements  ActionListener {
    JPanel panel;
	JButton btn,btnAbout,btnEvent;
	Color clr1;
    
	public Home() {
		super("Welcome to The Playground");
		setBounds(450, 175, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		// Load the background image
		BufferedImage backgroundImage = loadImage("img/homebgFinal.jpg");
		
		clr1 = new Color(53,51,205);
		
		btn =  new JButton("LET'S EXPLORE");
		btn.setBounds(550, 450, 150,50);
		btn.setForeground(Color.white);
		btn.setBackground(clr1);
		btn.addActionListener(this);
		add(btn);
		
		btnAbout =  new JButton("About Us");
		btnAbout.setBounds(40, 500, 150,40);
		btnAbout.setForeground(Color.white);
		btnAbout.setBackground(clr1);
		btnAbout.addActionListener(this);
		add(btnAbout);
		
		btnEvent =  new JButton("Our Events");
		btnEvent.setBounds(200, 500, 150,40);
		btnEvent.setForeground(Color.white);
		btnEvent.setBackground(clr1);
		btnEvent.addActionListener(this);
		add(btnEvent);
		

		//BufferedImage image = loadImage("logo.png");

		// Create a custom JPanel with a transparent foreground color
		JPanel transparentPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// Draw the background image
				g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

				// Set a transparent color for the foreground
				g.setColor(new Color(240, 240, 250, 0)); // R, G, B, Alpha (transparency)
				g.fillRect(0, 0, getWidth(), getHeight());


				//if (image != null) {
                 //   g.drawImage(image, 300, 0, this);
                //}
				
				
				// Add additional information or drawing on top of the transparent overlay
				/*
				g.setColor(Color.black);
				g.setFont(new Font("Roboto", Font.BOLD, 32));
				g.drawString("Are You READY!!!", 240, 210);
				g.setFont(new Font("Roboto", Font.BOLD, 32));
				g.drawString("AIUB Indoor Tournament 2023", 175, 350);
				g.setFont(new Font("Serif", Font.ITALIC, 26));
                String bodyDescription1 = "For the most awaited and thrilling programme of the year.\n" +
				"This year is it going to set a new height? Let's see.\n";
                drawMultilineString(g, bodyDescription1, 90, 250, 30);
				g.setFont(new Font("Serif", Font.ITALIC, 26));
                String bodyDescription2 = "Don't miss out the opportunity to feel the excitement. Make your\n" +
						"team and prepare to join the only biggest indoor event.\n";
                drawMultilineString(g, bodyDescription2, 90, 380, 30);

				// Add buttons
				drawButton(g, "Events", 150, 430);
				drawButton(g, "LogIn", 320, 430);
				drawButton(g, "Register", 500, 430);
				drawButton(g, "Contribution", 320, 510);
				*/
				
			}
		};

		//Set layout manager and add the custom JPanel to the frame
		setLayout(new BorderLayout());
		add(transparentPanel, BorderLayout.CENTER);
	}

	
	private void drawButton(Graphics g, String text, int x, int y) {
		// g.setBorder(new EmptyBorder(20, 20, 20, 20));
		g.setColor(new Color(0, 210, 255));
		g.fillRect(x, y, 130, 40);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 16));
		g.drawString(text, x + 20, y + 25);
	}
	

	
	private void drawMultilineString(Graphics g, String text, int x, int y, int lineHeight) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            g.drawString(lines[i], x, y + i * lineHeight);
        }
    }
	

    private BufferedImage loadImage(String filename) {
        try {
            return ImageIO.read(getClass().getResource(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn) 
		{
			Login obj = new Login();
			obj.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == btnAbout){
			this.setVisible(false);
			new AboutUs().setVisible(true);
			
		}
		else if( ae.getSource() == btnEvent){
			this.setVisible(false);
			new Events().setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
	//Home example = new Home();
	//example.setVisible(true);
}

}
