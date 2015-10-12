package Methods;

import Main.*;
import Mathf.Vector2;

public abstract class Behaviour
{
	protected Stage stage;
	
	private static final int updateCall = 1000;
	
	public void Start()
	{	
		stage = new Stage();
		Begin();
		while(true)
		{
			try
			{
				Thread.sleep(updateCall);
			} catch(InterruptedException ie) {}

			Update();
		}
	}
	
	protected abstract void Begin();
	
	protected abstract void Update();
	
	protected void AddChild(String path)
	{
		//stage.AddChild(path, renderer);
	}
}
