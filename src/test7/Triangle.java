package test7;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

class Triangle  extends JPanel{
	private int[] x;
	private int[] y;
	private int width,height;
	public Triangle(int w,int h){
		width=w;
		height=h;
	}
	//画三角形
	public void drawTriangle(){
		int[] p={width/2,width/2-100,width/2};
		x=p;
		int[] k={height/4,height/4+90,height/4+50};
		y=k;
		repaint();
	}
	//画等腰三角形
	public void drawIsoscelesTriangle(){
		int[] p={width/2,width/2-100,width/2};
		x=p;
		int[] k={height/4,height/4,height/4+100};
		y=k;
		repaint();
	}
	//画等边三角形
	public void draweQuilateralTriangle(){
		int[] p={width/2,width/2-100,width/2-50};
		x=p;
		int[] k={height/4,height/4,(int) (height/4+Math.sqrt(Math.pow(100, 2.0)-Math.pow(50, 2.0)))};
		y=k;
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(x!=null){
			Graphics2D g2=(Graphics2D) g;
			g2.fillPolygon(x,y,3);
		}
	}
}
