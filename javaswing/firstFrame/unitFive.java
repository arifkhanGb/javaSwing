package firstFrame;
import java.awt.*;  
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class addition extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b;
	JLabel l;
	JProgressBar pb; 
	addition()
	{
		t1=new JTextField();
		t1.setBounds(50,50,50,30);
		t2=new JTextField();
		t2.setBounds(50,100,50,30);
		t3=new JTextField();
		t3.setBounds(50,150,50,30);
		l=new JLabel("rsult");
		l.setBounds(150,50,50,50);
		b=new JButton("add");
		b.setBounds(50,250,100,50);
		pb=new JProgressBar(0,20);
		add (pb);
		add(t1);
		add(t2);
		add(t3);
		
		add(l);
		add(b);
		 
		b.addActionListener(this);
		
		
		
		 setLayout(null);
		 setVisible(true);
		 setSize(400, 500);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int c=num1+num2;
		t3.setText(c+" ");
		
	}
	 
	 
	
}
public class unitFive extends JFrame {

public static void main(String [] args) 
{
	addition a=new addition();
	
	
}
	
}
