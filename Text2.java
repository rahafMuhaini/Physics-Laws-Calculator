

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text2 extends JFrame implements ActionListener
{
	JPanel j5, j6;
	JLabel u1,u2,u3,u4;
	JButton n1,n2;
	JTextField t22,t33,t44,t55;

    public Text2() {

    	super("Acceleration Calculation");
	 	 setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	             j5= new JPanel();
	             j5.setLayout(new GridLayout(4,3));
                 j5.setBackground(new Color(211, 196, 248));



	 	 		 u1= new JLabel("Enter the final velocity:");
	 	 		 j5.add(u1);
	 	 		 u1.setForeground(Color.white);
	 	 		 t22= new JTextField(30);
                 j5.add(t22);

	 	 		 u2= new JLabel("Enter the initial velocity:");
	 	 		 j5.add(u2);
	 	 	     u2.setForeground(Color.white);
	 	 		 t33=new JTextField(30);
                 j5.add(t33);


	 	 		 u3 = new JLabel("Enter the time taken:");
	 	 		 j5.add(u3);
	 	 		 u3.setForeground(Color.white);
	 	 		 t44=new JTextField(30);
	 	 		 j5.add(t44);

	 	 		 u4= new JLabel("Result:");
	 	 		 j5.add(u4);
	 	 		 u4.setForeground(Color.white);
	 	 		 t55=new JTextField(30);
	 	 		 j5.add(t55);
	 	 		 t55.setEditable(false);


	 	 		 j6 = new JPanel();
	             j6.setLayout(new FlowLayout());
                 j6.setBackground(new Color(211, 196, 248));

	 	 		 n1 = new JButton("Submit");
                 n1.addActionListener(this);
                 j6.add(n1);

	 	 		 n2 = new JButton("Clear");
                 n2.addActionListener(this);
                 j6.add(n2);



                 add(j5, BorderLayout.CENTER);
	 	 		 add(j6,BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
    	String k = e.getActionCommand();
    	if(k.equals("Submit"))
    	{

    	 double f1=Double.parseDouble(t22.getText());
	 	      double f2 =Double.parseDouble(t33.getText());
              double f3=Double.parseDouble(t44.getText());
              double f4 =((f1-f2)/f3);
              t55.setText(Double.toString(f4) +  " m/s"); }

        if(k.equals("Clear"))
        {
        	 t22.setText(" ");
        	 t33.setText(" ");
        	 t44.setText(" ");
        	 t55.setText(" ");
        	 
        }
    }

}