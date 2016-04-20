package com.Wheather;


public class TypeFactory {
	private static TypeFactory instance = null;
	private TypeFactory() {}
	public static TypeFactory getInstance() {
	      if(instance == null) {
	    	  instance = new TypeFactory();
		  }
	      return instance;
	}
	
	public TemperatureType getType(String type){
		if(type.equals("HOT")||type.equals("Hot")||type.equals("hot"))
			return new Hot();
		else if(type.equals("COLD")||type.equals("Cold")||type.equals("cold"))
			return new Cold();
		else
			return null;
	}
}
