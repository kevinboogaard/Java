package Methods;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Renderer extends Canvas
{
	private static final long serialVersionUID = 1L;
	
	protected Renderer() 
	{
		
	}
	
	public BufferedImage GetSprite(String path)
	{
		File file= new File(path);
		BufferedImage image = null; 
		try {
			System.out.println("Read");
			image = ImageIO.read(file);
		} catch (IOException e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		new JLabel(new ImageIcon(image));
		return image;
	}

}