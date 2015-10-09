package Mathf;

import java.util.Random;

public class Mathf {

	public static int random(int _max) {
		Random rand = new Random();
		return rand.nextInt((_max - 0) + 1) + 0;
	}
	
	public static int random(int _min, int _max) {
		Random rand = new Random();
		return rand.nextInt((_max - _min) + 1) + _min;
	}
}
