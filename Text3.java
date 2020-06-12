import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text3 extends JFrame implements ActionListener
{
	JPanel m1, m2;
	JLabel m3,m4,m5;
	JButton m6,m7;
	JTextField m8,m9,m10;

	public Text3(){

			super("Mass Calculation");
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	     m1=new JPanel();
	 	 	 m1.setLayout(new GridLayout(3,2));
	 	 	 m1.setBackground(new Color(211, 196, 248));

	 	 	 m3=new JLabel("Enter the Force (N): ");
	 	 	 m1.add(m3);
	 	 	 m3.setForeground(Color.white);
	 	 	 m8=new JTextField(30);
	 	 	 m1.add(m8);

	 	 	 m4=new JLabel("Enter the Acceleration (m/s):");
	 	 	 m1.add(m4);
	 	 	 m4.setForeground(Color.white);
	 	 	 m9=new JTextField(30);
	 	 	 m1.add(m9);

	 	 	 m5=new JLabel("Result");
	 	 	 m1.add(m5);
	 	 	 m5.setForeground(Color.white);
	 	 	 m10=new JTextField(30);
             m1.add(m10);
             m10.setEditable(false);

             m2=new JPanel();
	 	 	 m2.setLayout(new FlowLayout());
	 	 	 m2.setBackground(new Color(211, 196, 248));

             m6=new JButton("Submit");
	 	 	 m2.add(m6);
             m6.addActionListener(this);
             m7=new JButton("Clear");
             m2.add(m7);
             m7.addActionListener(this);
             add(m1,BorderLayout.CENTER);
             add(m2,BorderLayout.SOUTH);
             setVisible(true);

}
public void actionPerformed(ActionEvent e)
    {
    	String k=e.getActionCommand();
    	if(k.equals("Submit"))
    	{

         double force =Double.parseDouble(m8.getText());
         double Acceleration=Double.parseDouble(m9.getText());
         double mass=( force/Acceleration);
         m10.setText(Double.toString(mass) + " Kg");
    	}

	if(k.equals("Clear"))
	 	{
	 		m8.setText("");
	 	    m9.setText("");
	 		m10.setText("");
	 	}

    }


}

