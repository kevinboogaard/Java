package Main;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import Mathf.Vector2;
import Methods.Renderer;

public class Stage
{
	public static Stage stage;
	
	private JFrame _frame;
	private Canvas cnvs;

	static
	{	
		Stage.stage = new Stage(1280, 800);
	}
	
	private Stage(int _width , int _height)
	{
		_frame = new JFrame();
		_frame.setSize(_width, _height);
		_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Canvas cnvs = new Canvas();
		cnvs.setSize(_width,_height);
		
		_frame.getContentPane().add(cnvs);
		_frame.setVisible(true);
	}
	public void ChangeFrame(Vector2 size, String title)
	{
		_frame.setTitle(title);
		_frame.setSize(1280, 800);
	}
	
	public void AddChild(String path) throws IOException
	{
		BufferedImage image = Renderer.renderer.GetSprite(path);		
	}
}
