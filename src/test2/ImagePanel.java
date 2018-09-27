package test2;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	Image image=null;
	private String url;
	public ImagePanel(String url){
		this.url=url;
	}
    public void paint(Graphics g){

        try {
            image=ImageIO.read(new File(url));		//Â·¾¶

            g.drawImage(image, 0, 0, 400, 200, null);

        } catch (Exception e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }
    }
    public void reSet(String url){
    	this.url=url;
    }
}
