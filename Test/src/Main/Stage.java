package Main;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

import Mathf.Vector2;
import Methods.GameObject;

public class Stage extends JPanel
{
	public List<GameObject> spritesToRender = new ArrayList<>();

	public Vector2 screenSize;
	
	private static final long serialVersionUID = 1L;
	private static JFrame _frame;
	
	public Stage() { _frame = new JFrame(); _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
	public Stage(Vector2 size, String title)
	{
		_frame = new JFrame(title);
		_frame.setSize((int)size.x, (int)size.y);
		_frame.setResizable(false);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setVisible(true);
		
		screenSize = size;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(Object _gObject : spritesToRender) 
		{
			GameObject gObject = (GameObject) _gObject;
			g.drawImage(gObject.GetSprite(), (int)gObject.position.x, (int)gObject.position.y, null);
		}
	}
	
	public void Render()
	{
		_frame.validate();
		_frame.repaint();
	}
	
	public Image GetSprite(String path)
	{		
		Image image = null;
		try {
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return image;
	}
	
	public void ChangeFrame(Vector2 size, String title, boolean visible, boolean resizable, Stage stage)
	{
		_frame.setTitle(title);
		_frame.setSize((int)size.x, (int)size.y);
		_frame.setResizable(resizable);
		_frame.setContentPane(stage);
		_frame.setVisible(visible);
		
		screenSize = size;
	}
	
	public void AddChild(GameObject child)
	{
		spritesToRender.add(child);
	}
}
