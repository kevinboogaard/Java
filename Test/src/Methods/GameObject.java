package Methods;

import java.awt.Image;

import Main.Stage;
import Mathf.Vector2;

public class GameObject {
	public Vector2 position;
	public Vector2 rotation;
	public Vector2 scale;

	private Image _sprite;
	
	public GameObject(){}
	public GameObject(Vector2 _position, Vector2 _rotation, Vector2 _scale) 
	{
		position = _position;
		rotation = _rotation;
		scale = _scale;
	}
	
	public GameObject(Image _img, Vector2 _position, Vector2 _rotation, Vector2 _scale) 
	{
		_sprite = _img;
		position = _position;
		rotation = _rotation;
		scale = _scale;
	}
	
	public void SetSprite(Stage stage, Image _img)
	{
		_sprite = _img;
	}
	
	public Image GetSprite()
	{
		return _sprite;
	}
	
	public void Visible(boolean visible)
	{
		
	}
	
	public void Destroy()
	{
		//Container parent = object.getParent();
		//parent.remove(object);
		//parent.validate();
		//parent.repaint();
	}
}
