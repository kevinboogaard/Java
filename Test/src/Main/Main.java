package Main;

import Mathf.Vector2;
import Methods.Tree;
import Methods.GameObject;

public class Main extends Tree
{
	private GameObject ball;
	
	public static void main(String[] args) { new Main().Start(); }
	
	Vector2 velocity;
	
	protected void Begin()
	{
		if(stage != null) init();
		else System.out.println("Failed adding Stage.");
	}

	protected void init()
	{
		ball = new GameObject(stage.GetSprite("lib/BAL.jpg"), new Vector2(stage.screenSize.x / 2, stage.screenSize.y / 2), new Vector2(0,0), new Vector2(1,1));
		stage.AddChild(ball);
		
		velocity = new Vector2(-11, -2);
	}
	
	protected void Tick()
	{
		ball.position = ball.position.plus(new Vector2(velocity.x / 2, velocity.y / 2));
		
		if (ball.position.x < stage.getWidth() / 2)
		{
			velocity.x = -velocity.x;
		}
		
		if (ball.position.x > stage.screenSize.x - stage.getWidth() / 2)
		{
			velocity.x = -velocity.x;
		}
		
		if (ball.position.y < stage.getHeight() / 2)
		{
			velocity.y = -velocity.y;
		}
		
		if (ball.position.y > stage.screenSize.y - stage.getHeight() / 2)
		{
			velocity.y = -velocity.y;
		}
	}
}