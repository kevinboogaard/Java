package Main;

import Mathf.Vector2;
import Methods.Behaviour;
import Methods.Tree;
import Methods.GameObject;

public class Main extends Tree
{
	private GameObject test;
	
	protected void Begin()
	{
		if(stage != null) init();
		else System.out.println("Failed adding Stage.");
	}

	protected void init()
	{o
		test = new GameObject(stage.GetSprite("lib/BAL.jpg"), new Vector2(0,0), new Vector2(0,0), new Vector2(1,1));
	}
}