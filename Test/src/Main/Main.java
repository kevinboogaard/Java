package Main;

import Methods.Behaviour;
import Methods.Tree;

public class Main extends Tree
{
	@Override
	protected void Begin()
	{
		if(stage != null) init();
		else System.out.println("Failed adding Stage.");
	}

	@Override
	protected void Update() {
		// TODO Auto-generated method stub
		
	}
	
	protected void init()
	{
		AddChild("lib\\URF.jpg");
	}
}