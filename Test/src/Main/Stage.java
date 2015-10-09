package Main;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Mathf.Vector2;
import Methods.Renderer;

public class Stage 
{
	private static JFrame _frame;
	
	public Stage(int _width , int _height)
	{
		_frame = new JFrame();	
		_frame.setLocationRelativeTo(null);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);

	}
	public void ChangeFrame(Vector2 size, String title)
	{
		_frame.setTitle(title);
		_frame.setSize(1280, 800);
	}
	
	public void AddChild(String path, Renderer renderer)
	{
		@SuppressWarnings("unused")
		BufferedImage image = renderer.GetSprite(path);
		_frame.add(new JLabel(new ImageIcon(path)));
	}
}
