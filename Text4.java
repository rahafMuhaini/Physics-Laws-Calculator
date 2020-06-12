import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text4 extends JFrame implements ActionListener

{
	JPanel d1,d2;
	JLabel d3,d4,d5;
	JButton d6,d7;
	JTextField d8,d9,d10;

	    public Text4(){

		super(" Density Calculation");
    	setLayout(new BorderLayout());
    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	     d1=new JPanel();
	 	 	 d1.setLayout(new GridLayout(3,2));
	 	 	 d1.setBackground(new Color(211, 196, 248));

	 	 	 d3=new JLabel("Enter the Mass (kg):");
	 	 	 d1.add(d3);
	 	 	 d3.setForeground(Color.white);
	 	 	 d8=new JTextField(30);
	 	 	 d1.add(d8);

	 	 	 d4=new JLabel("Enter the Volume (m^3):");
	 	 	 d1.add(d4);
	 	 	 d4.setForeground(Color.white);
	 	 	 d9=new JTextField(30);
	 	 	 d1.add(d9);

	 	 	 d5=new JLabel("Result");
	 	 	 d1.add(d5);
	 	 	 d5.setForeground(Color.white);
	 	 	 d10=new JTextField(30);
	 	 	 d1.add(d10);
	 	 	 d10.setEditable(false);

	 	 	 d2=new JPanel();
	 	 	 d2.setLayout(new FlowLayout());
	 	 	 d2.setBackground(new Color(211, 196, 248));

	 	 	 d6=new JButton("Submit");
	 	 	 d2.add(d6);
	 	 	 d6.addActionListener(this);
	 	 	 d7=new JButton("Clear");
	 	 	 d2.add(d7);
	 	 	 d7.addActionListener(this);
	 	 	 add(d1,BorderLayout.CENTER);
	 	 	 add(d2,BorderLayout.SOUTH);
	 	 	  setVisible(true);}



    public void actionPerformed(ActionEvent e)
    {
    	String k=e.getActionCommand();
    	if(k.equals("Submit"))
    	{
    		double m=Double.parseDouble(d8.getText());
    		double v=Double.parseDouble(d9.getText());
    		double d=(m/v);
    		 d10.setText(Double.toString(d)+" kg/m^3");
    	}


    			if(k.equals("Clear"))
	 	{


	 	 	 d8.setText("");
	 	 	 d9.setText("");
	 	 	 d10.setText("");
	 	}

    }
    }







