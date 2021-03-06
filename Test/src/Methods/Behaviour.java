package Methods;

import Main.*;
import Mathf.Vector2;

public abstract class Behaviour
{
	protected Stage stage;
	
	private long currentTime;
	private long previousTime = System.nanoTime();
	private long passedTime;
	
	private int frames = 0;
	private int tickCount = 0;
	
	private double unprocessedSeconds = 0;
	private double secondsPerTick = 1 / 60.0;
	
	private boolean ticked = false;
	protected boolean tickRunning = true;
	
	public void Start()
	{	
		stage = new Stage();
		stage.ChangeFrame(new Vector2(1200, 800), "Four Pong; Remake", true, false, stage);
		Begin();

		while(tickRunning) {
			
			currentTime = System.nanoTime();
			passedTime = currentTime - previousTime;
			previousTime = currentTime;
			unprocessedSeconds += passedTime / 1000000000.0;
			
			while (unprocessedSeconds > secondsPerTick) {
				Tick();
				unprocessedSeconds -= secondsPerTick;
				ticked = true;
				tickCount++;
				if (tickCount % 60 == 0) {
					previousTime += 1000;
					setFrames(0);
				}
			}
			
			if (ticked) {
				stage.Render();
				setFrames(getFrames() + 1);
			}
			
			stage.Render();
			setFrames(getFrames() + 1);
		}
	}
	
	protected abstract void Begin();
	
	protected abstract void Tick();
	protected abstract void FixedTick();
	
	protected void AddChild(GameObject child)
	{
		stage.AddChild(child);
	}

	public int getFrames() {
		return frames;
	}

	public void setFrames(int frames) {
		this.frames = frames;
	}
}
