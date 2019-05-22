package com.tiejun.ge.model;

import com.tiejun.ge.server.Space;
import com.tiejun.ge.server.impl.Circle;
import com.tiejun.ge.server.impl.Rectengle;
import com.tiejun.ge.server.impl.Square;

public class StaticSpaceFactory {

	public static Space getCircleSpace() {
		return new Circle();
	}
	
	public static Space getSquareSpace() {
		return new Square();
	}
	
	public static Space getRectengleSpace() {
		return new Rectengle();
	}
}
