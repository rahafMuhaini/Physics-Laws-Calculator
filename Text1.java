

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text1 extends JFrame implements ActionListener
{

	JPanel pp1,pp2;
	JLabel ll1,l22,l33;
	JTextField t1,t2,t3;
	JButton b11,b22;



    public Text1()
    	{

    	super("Speed Calculation");
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	     pp1=new JPanel();
	 	 	 pp1.setLayout(new GridLayout(3,2));
	 	 	 pp1.setBackground(new Color(211, 196, 248));



	 	 	  ll1= new JLabel("Enter the distance (km): ");
              pp1.add(ll1);
              ll1.setForeground(Color.white);

              t1 = new JTextField(30);
	 	 	  pp1.add(t1);

	 	 	  l22 = new JLabel("Enter the time taken (h): ");
	 	 	  pp1.add(l22);
	 	 	  l22.setForeground(Color.white);

	 	 	  t2 = new JTextField(30);
	 	 	  pp1.add(t2);


	 	 	  l33= new JLabel("Result");
	 	 	  pp1.add(l33);
	 	 	  l33.setForeground(Color.white);


              t3 = new JTextField(30);
	 	      pp1.add(t3);
              t3.setEditable(false);

	 	 	  pp2=new JPanel();
	 	 	  pp2.setLayout(new FlowLayout());
	 	 	  pp2.setBackground(new Color(211, 196, 248));


	 	 	  b11= new JButton("Submit");
              pp2.add(b11);
	 	 	  b11.addActionListener(this);


	 	 	 b22 = new JButton("Clear");
             pp2.add(b22);
	 	 	 b22.addActionListener(this);

             add(pp1,BorderLayout.CENTER);
	 	 	 add(pp2,BorderLayout.SOUTH);
	 	 	 setVisible(true);



    }

    public void actionPerformed(ActionEvent e)
    {
    	String k=e.getActionCommand();
    	if(k.equals("Submit"))
    	{

    		 double a= Double.parseDouble(t1.getText());
	 	 	 double b =Double.parseDouble(t2.getText());
	 	 	 double c= a/b;
    		 t3.setText(Double.toString(c)+ "km/h");
    	}

	 	if(k.equals("Clear"))
	 	{
	 		t1.setText("");
	 		t2.setText("");
	 		t3.setText("");
	 	}




    }


}