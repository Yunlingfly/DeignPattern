package test7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

class Circular extends JPanel{
	private static final long serialVersionUID = 1L;
	Ellipse2D e =null;
	private int w,h;
    int f;
	public Circular(int w,int h){
		this.w=w;
		this.h=h;
	}
	//ª≠‘≤–Õ
	public void drawCircular(){
	e=new Ellipse2D.Double(w/2,h/4,50,50)	;
	f=1;
	repaint();
	}
	//ª≠Õ÷‘≤–Œ
	public void drawEllipse(){
		
		e=new Ellipse2D.Double(w/2,h/4,20,70)	;
		f=1;
		repaint();
	}	
	//ª≠ µ–ƒ‘≤
	public void drawSolidRound(){
		f=2;
		e=new Ellipse2D.Double(w/2,h/4,50,50)	;
		repaint();	
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(f==1){
			Graphics2D g2=(Graphics2D) g;
			g2.draw(e);
		}
		else{
			Graphics2D g2=(Graphics2D) g;
			//g2.draw(e);
			g2.setPaint(Color.RED);
			g2.fill(e);
		}
	}
}
