import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text5 extends JFrame implements ActionListener
{
	JPanel k1,k2;
	JLabel k3,k4,k5;
	JButton k6,k7;
	JTextField k8,k9,k10;

	public Text5()
		{

		super("Kinetic Energy  Calculation");

		setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	     k1=new JPanel();
	 		 k1.setLayout(new GridLayout(3,2));
	 		 k1.setBackground(new Color(211, 196, 248));


	 		 k3=new JLabel("Enter the Mass (kg):");
	 		 k1.add(k3);
	 		 k3.setForeground(Color.white);

	 		 k8=new JTextField(30);
	 		 k1.add(k8);

	 		 k4=new JLabel("Enter the velocity (m/s): ");
	 		 k1.add(k4);
	 		 k4.setForeground(Color.white);
	 		 k9=new JTextField(30);
	 		 k1.add(k9);

	 		 k5=new JLabel("Result");
	 		 k1.add(k5);
	 		 k5.setForeground(Color.white);

	 		 k10=new JTextField(30);
	 		 k1.add(k10);
	 		 k10.setEditable(false);

	 		 k2=new JPanel();
	 		 k2.setLayout(new FlowLayout());
	 		 k2.setBackground(new Color(211, 196, 248));

	 		 k6=new JButton ("Submit");
	 		 k2.add(k6);
	 		 k6.addActionListener(this);
	 		 k7=new JButton("Clear");
	 		 k2.add(k7);
	 		 k7.addActionListener(this);
	 		 add(k1,BorderLayout.CENTER);
	 		 add(k2,BorderLayout.SOUTH);

	 		 setVisible(true);

	}

	 public void actionPerformed(ActionEvent e)
    {
    	String k=e.getActionCommand();
    	if(k.equals("Submit"))
    	{

    		double mass=Double.parseDouble(k8.getText());
    		double velocity =Double.parseDouble(k9.getText());
    		double kinticEnergy=((0.5)*mass*(velocity*velocity));
    		k10.setText(Double.toString(kinticEnergy)+" J");

    	}


    		if(k.equals("Clear"))
	 	{
	 		k8.setText("");
	 		k9.setText("");
	 		k10.setText("");
	 	}

    }


}
