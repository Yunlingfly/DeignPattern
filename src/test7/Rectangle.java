package test7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

class Rectangle extends JPanel{
	Rectangle2D rec = null;
    private int w,h;
    public Rectangle(int w,int h){
    	this.w=w;
    	this.h=h;	
    }//画正方形 
    public void drawsquare(){
    	rec=new Rectangle2D.Double(w/2, h/4, 50, 50);
    	this.repaint();
    }//画长方形
    public void drawlongRectangle(){
    	rec=new Rectangle2D.Double(w/2, h/4, 100, 30);
    	this.repaint();
    }//画方形
    public void drawhighRectangle(){
    	rec=new Rectangle2D.Double(w/2, h/4, 20, 100);
    	this.repaint();
    }
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(rec!=null){
			Graphics2D g2=(Graphics2D) g;
			g2.setPaint(Color.GREEN);
			g2.fill(rec);
		}
	}
}
