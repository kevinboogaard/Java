package Mathf;

import Methods.Reflection;

public class Vector2 {
	private Double[] _location = new Double[2];
	
	public Vector2(Double _xLocation, Double _yLocation) {
		_location[0] = _xLocation;
		_location[1] = _yLocation;
	}
	
	public double dot(Vector2 that) {
		if (_location.length != 2) throw new RuntimeException("Vector2 is empty.");
		double sum = 0.0;
		for (int i = 0; i < _location.length; i++)
			sum = sum + (this._location[i] * that._location[i]);
		return sum;
	}
	
	/*
	public String toString() {
		Class _e = Reflection.getCallerClass(2);
		return "(" + _e.x(10) + ", " + _e.y(10) + ")";
	}
	*/
}
