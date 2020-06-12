import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class physics extends JFrame implements ActionListener,ItemListener
{
	JLabel la1,la2,la3;
	ButtonGroup group;
	JRadioButton radi1,radi2,radi3,radi4,radi5,radi6;
	JPanel p1;
	ImageIcon f;
		Text1 t;
		Text2 i;
		Text3 r;
		Text4 y;
		Text5 u;
		Text6 p;

	 public physics()
	 {
	 	 super("Phycis Laws");
	 	 setLayout(new BorderLayout());
	 	 setSize(400,400);
	 	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f=new ImageIcon("images2.png");
           la2 = new JLabel("  ");
           la2.setIcon(new ImageIcon((f.getImage()).getScaledInstance(390, 100, java.awt.Image.SCALE_SMOOTH)));    
           add(la2, BorderLayout.NORTH);
      

		group= new ButtonGroup();

	 	 p1=new JPanel();
	 	 p1.setLayout(new GridLayout(6,1));
         p1.setBorder(BorderFactory.createTitledBorder("Phycis Law"));
         p1.setBackground(new Color(211, 196, 248));
  
  
         la1= new JLabel("Choose one physics law:");
         p1.add(la1);
         la1.setForeground(Color.white);
         la1.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));
        la3=new JLabel("    ");
         p1.add(la3);

	 	 radi1= new JRadioButton("Speed");
	 	 radi1.addActionListener(this);
         p1.add(radi1);
         radi1.setForeground(new Color(167,112, 240));
         radi1.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));

         

	 	 radi2 = new JRadioButton("Acceleration");

	 	p1.add(radi2);
        radi2.addActionListener(this);
        radi2.addItemListener(this);
         radi2.setForeground(new Color(167,112, 240));
         radi2.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));

	 	 radi3 = new JRadioButton("Mass");
	 	 p1.add(radi3);
	 	 radi3.addActionListener(this);
	 	  radi3.addItemListener(this);
	 	 radi3.setForeground(new Color(167,112, 240));
         radi3.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));

	 	 radi4 = new JRadioButton("Density");
	 	 p1.add(radi4);
	 	radi4.addItemListener(this);
	 	 radi4.addActionListener(this);
	 	 radi4.setForeground(new Color(167,112, 240));
         radi4.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));


	 	 radi5 = new JRadioButton("Kinetic Energy");
	 	p1.add(radi5);
	 	 radi5.addActionListener(this);
	 	 radi5.addItemListener(this);
	 	 radi5.setForeground(new Color(167,112, 240));
         radi5.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));

	 	 radi6 = new JRadioButton("Force");
	      p1.add(radi6);
	      radi6.addActionListener(this);
	     radi6.addItemListener(this);
	     radi6.setForeground(new Color(167,112, 240));
         radi6.setFont(new Font("Verdana Pro Light", Font.BOLD, 14));


		group.add(radi1);
		group.add(radi2);
		group.add(radi3);
		group.add(radi4);
		group.add(radi5);
		group.add(radi6);
		
		//p1.add(group);
		
	 	 add(p1,BorderLayout.CENTER);
	 	 //add(p2,BorderLayout.CENTER);
	 	 setVisible(true);
	 	 
	 	 	t= new Text1();
	 	 	i= new Text2();
	 	 	r= new Text3();
	 	 	y= new Text4();
	 	 	u=new Text5();
	 	 	p= new Text6();

	 }
	
	public void display()
	{
		t.setVisible(false);
		i.setVisible(false);
		r.setVisible(false);
		y.setVisible(false);
		u.setVisible(false);
		p.setVisible(false);
		
	}
	 public void actionPerformed(ActionEvent e)
	 {
	 	 String k=e.getActionCommand();
	
		
	 	 if(k.equals("Speed"))
	 	 {
	 	 	display();
	 	 
	 	 	t.setVisible(true);
	 	 	t.setSize(400,400);
	 	 		}
	 	 if(k.equals("Acceleration"))
	 	 		{
	 	 			display();
	 	 			i.setVisible(true);
	 	 			i.setSize(400,400);
	 	 			}
	 	if (k.equals("Mass"))
	 	 	 {
	 	 	 	display();
	 	 	 	 r.setVisible(true);
	 	 	 	 r.setSize(400,400);
	 	 	 	 }
	 	 	 if (k.equals("Density"))
	 	 	 {
	 	 	 	 display();
	 	 	 	 y.setVisible(true);
	 	 	 	 y.setSize(400,400);
	 	 	  }
	 	 	 if (k.equals("Kinetic Energy"))
	 	 	 {
	 	 	 	display();
	 	 	 	 u.setVisible(true);
	 	 	 	 u.setSize(400,400);
	 	 	 	 }
	 	 	 if (k.equals("Force"))
	 	 	 {
	 	 	 	 display();
	 	 	 	 p.setVisible(true);
	 	 	 	 p.setSize(400,400); } 



	 	 	  }

 
              		public void itemStateChanged(ItemEvent e)
		{

		}
			public class HandlerClass implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if(radi1.isSelected())
			{
				 t.setVisible(true);
		         i.setVisible(false);
		         r.setVisible(false);
		         y.setVisible(false);
		         u.setVisible(false);
	           	 p.setVisible(false);
			}
			if(radi2.isSelected())
			{
				t.setVisible(false);
		        i.setVisible(true);
				r.setVisible(false);
		        y.setVisible(false);
	        	u.setVisible(false);
	        	p.setVisible(false);
			}

			if (radi3.isSelected())
			{
				t.setVisible(false);
	        	i.setVisible(false);
				r.setVisible(true);
				y.setVisible(false);
				u.setVisible(false);
				p.setVisible(false);
			}
 			if (radi4.isSelected())
 			{
 				t.setVisible(false);
				i.setVisible(false);
				r.setVisible(false);
				y.setVisible(true);
				u.setVisible(false);
				p.setVisible(false);
 			}

 			if(radi5.isSelected())
 			{
 				t.setVisible(false);
				i.setVisible(false);
				r.setVisible(false);
				y.setVisible(false);
				u.setVisible(true);
				p.setVisible(false);

 			}

 			if(radi6.isSelected())
 			{
 			 	t.setVisible(false);
				i.setVisible(false);
				r.setVisible(false);
				y.setVisible(false);
				u.setVisible(false);
				p.setVisible(true);
 			}

              } } 
}


 


class test
{
	public static void main(String[] arg)
	{
		physics p1=new physics();
		p1.setVisible(true);
	}
}
