package Methods;

import Main.*;

public abstract class Behaviour
{
	protected Renderer renderer;
	protected Stage stage;
	
	private static final int updateCall = 1000;
	
	public void Start()
	{	
		renderer = new Renderer();
		stage = new Stage(1280, 800);
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
		stage.AddChild(path, renderer);
	}
}
