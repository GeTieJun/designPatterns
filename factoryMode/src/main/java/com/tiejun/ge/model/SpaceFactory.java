package com.tiejun.ge.model;

import java.util.ArrayList;
import java.util.List;

import com.tiejun.ge.server.Space;
import com.tiejun.ge.server.impl.Circle;
import com.tiejun.ge.server.impl.EmptySpace;
import com.tiejun.ge.server.impl.Rectengle;
import com.tiejun.ge.server.impl.Square;

public class SpaceFactory {

	public Space CreateSpace (String spaceName) {
		if(!checkSpaceNameParam(spaceName)) {
			System.out.println("System all spaceName is not contant: " + spaceName + " spaceName");
			return new EmptySpace();
		}
		if(spaceName.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if(spaceName.equalsIgnoreCase("Rectengle")) {
			return new Rectengle();
		}
		if(spaceName.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return new EmptySpace();
	}

	private boolean checkSpaceNameParam(String spaceName) {
		boolean checkResult = true;
		List<String> allSpaceName = getAllSpaceName();
		if(allSpaceName.isEmpty() && checkResult) {
			checkResult = false;
		}
		if(!allSpaceName.contains(spaceName) && checkResult) {
			checkResult = false;
		}
		return checkResult;
	}
	
	private List<String> getAllSpaceName(){ 
		List<String> allSpaceNameList = new ArrayList<String>();
		allSpaceNameList.add("Circle");
		allSpaceNameList.add("Rectengle");
		allSpaceNameList.add("Square");
		return allSpaceNameList;
	}
}
