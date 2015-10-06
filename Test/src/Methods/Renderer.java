package Methods;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



public class Renderer 
{
	public static Renderer renderer;
	
	static
	{	
		Renderer.renderer = new Renderer();
	}
	
	private Renderer() 
	{
		
	}
	
	public BufferedImage GetSprite(String path) throws IOException
	{
		File file= new File(path);
		BufferedImage image= ImageIO.read(file);
		new JLabel(new ImageIcon(image));
		return image;
	}
}