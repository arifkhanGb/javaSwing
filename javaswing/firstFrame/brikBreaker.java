package firstFrame;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.Timer;

 class gamePlay  extends JFrame implements ActionListener, KeyListener{

	private boolean play=false;//game auto. band na ho
	private int totalBrick=21;
	private Timer timer;
	private int delay=8;
	private int ballposX=120;
	private int ballposY=350;
	
	private int ballXdir=-1;
	private int ballYdir=-2;
	private int playerX=350;
	
	public gamePlay()
	{
		
		setSize(700, 600);
		setLocationRelativeTo(null);
	setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
		
		timer=new Timer(delay, this);
		timer.start();
		
	}
	public void paint(Graphics g)
	{
	g.setColor(Color.black);
	g.fillRect(1,1,692 ,592);
	
	g.setColor(Color.yellow);
	g.fillRect(0,0,692,3);
	g.fillRect(0,3,3,592);
	g.fillRect(691,3,3,590);
	
	//padal
	g.setColor(Color.green);
	g.fillRect(playerX, 550, 100, 8);
	
	g.setColor(Color.red);
	g.fillOval(ballposX,ballposY,20,20);
	
	
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void moveLeft()
	{
		playerX-=20;
	}
	private void moveRight()
	{
		playerX+=20;
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			moveLeft();
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			moveRight();
		
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class brikBreaker {

	public static void main(String[] args) {
		
		gamePlay game=new gamePlay();
		
		
		
		
		

	}

}
