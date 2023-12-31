import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Events extends JFrame implements ActionListener {
    
    private JPanel panel;
    private JButton b1;
    private ImageIcon img1;
    private JLabel backgroundImage;

    public Events() {
        super("Our Events");
        panel = new JPanel();

        b1 = new JButton();
        b1.setIcon(new ImageIcon("img/step-back.png"));
        b1.setBounds(15, 8, 35, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
		b1.addActionListener(this);
        panel.add(b1);

        img1 = new ImageIcon("img/events.jpg");
        backgroundImage = new JLabel(img1);
        backgroundImage.setBounds(0, 0, 1000, 800);
        panel.add(backgroundImage);
        
        super.setBounds(450, 200, 1000, 800);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        panel.setLayout(null);
        super.add(panel);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1) 
		{
			Home obj = new Home();
			obj.setVisible(true);
			this.setVisible(false);
		
	}
	}
        
    public static void main(String[] args) {
        Events ad = new Events();
        ad.setVisible(true);
    }
}

