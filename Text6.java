import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text6 extends JFrame implements ActionListener {

	JPanel f1,f2;
	JLabel f3,f4,f5;
	JButton f6,f7;
	JTextField f8,f9,f10;

	 public Text6()
    	{

    	super("Force Calculation");
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	     f1=new JPanel();
	 	 	 f1.setLayout(new GridLayout(3,2));
	 	 	 f1.setBackground(new Color(211, 196, 248));

	 	 	 f3=new JLabel("Enter the Mass (kg):");
	 	 	 f1.add(f3);
	 	 	 f3.setForeground(Color.white);
	 	 	 f8=new JTextField(30);
	 	 	 f1.add(f8);

	 	 	 f4=new JLabel("Enter the Acceleration (m/s):");
	 	 	 f1.add(f4);
	 	 	 f4.setForeground(Color.white);
	 	 	 f9=new JTextField(30);
	 	 	 f1.add(f9);

	 	 	 f5=new JLabel("Result");
	 	 	 f1.add(f5);
	 	 	 f5.setForeground(Color.white);
	 	 	 f10=new JTextField(30);
	 	 	 f1.add(f10);
	 	 	 f10.setEditable(false);

	 	 	 f2=new JPanel();
	 	 	 f2.setLayout(new FlowLayout());
	 	 	 f2.setBackground(new Color(211, 196, 248));

	 	 	 f6=new JButton("Submit");
	 	 	 f2.add(f6);
	 	 	 f6.addActionListener(this);

	 	 	 f7=new JButton("Clear");
	 	 	 f2.add(f7);
	 	 	 f7.addActionListener(this);

	 	 	 add(f1,BorderLayout.CENTER);
	 	 	 add(f2,BorderLayout.SOUTH);
	 	 	 setVisible(true);
    	}
    		 public void actionPerformed(ActionEvent e)
    {
    	String k=e.getActionCommand();
    	if(k.equals("Submit"))
    	{
    		double mass =Double.parseDouble(f8.getText());
    		double Acceleration=Double.parseDouble(f9.getText());
    		double force=(mass*Acceleration);
    		f10.setText(Double.toString(force)+" N");
    	}

	 	if(k.equals("Clear"))
	 	{
	 		f8.setText("");
	 		f9.setText("");
	 		f10.setText("");
	 	}

    }


}

