package Main;
import java.io.IOException;

import Methods.Renderer;

public class Main
{
	
	public static void main(String[] args) throws Exception 
	{
		if(Stage.stage != null) init();
		else System.out.println("failt to add stage");
	}
	
	private static void init() throws Exception 
	{
		System.out.println("init child");
		Stage.stage.AddChild("lib\\URF.jpg");
	}
}