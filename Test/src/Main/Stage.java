package Main;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Mathf.Vector2;
import Methods.GameObject;

public class Stage extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JFrame _frame;
	public List<GameObject> spritesToRender = new ArrayList<>();
	
	public Stage()
	{
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		/*
		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		path.moveTo(0.50f, 0.0f);
		path.lineTo(0.0f, 125.0f);
		path.quadTo(100.0f,100.0f,225.0f,125.0f);
		path.curveTo(260.0f,100.0f,130.0f,50.0f,225.0f,0.0f);
		path.closePath();
		
		AffineTransform at = new AffineTransform();
		at.setToRotation(-Math.PI/8.0);
		g2.transform(at);
		at.setToTranslation(0.0f,150.0f);
		g2.transform(at);
		
		g2.setColor(Color.green);
		g2.fill(path);
		*/
		g2.drawImage(GetSprite("lib/BAL.jpg"), 0, 0, null);

		for(Object _gObject : spritesToRender) 
		{
			GameObject gObject = (GameObject) _gObject;
			g2.drawImage(gObject.GetSprite(), (int)gObject.position.x, (int)gObject.position.y, null);
		}
	}
	
	public Image GetSprite(String path)
	{
		File file= new File(path);
		Image image = null;
		try {
			image = ImageIO.read(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return image;
	}
	
	public void ChangeFrame(Vector2 size, String title)
	{
		_frame.setTitle(title);
		_frame.setSize((int)size.x, (int)size.y);
	}
	
	public void AddChild(GameObject child)
	{
		//@SuppressWarnings("unused")
		//JLabel image = renderer.GetSprite(path);
		//image.setSize(1000, 1000);
		//image.setLocation(0, 0);
		//_frame.add(image);
		
	}
}
