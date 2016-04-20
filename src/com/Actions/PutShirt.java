package com.Actions;


public class PutShirt implements DressAction {

	int id;
	String descrption;
	PutShirt(){
		id=4;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "t-shirt";
		else if(type.equals("COLD"))
			descrption = "shirt";
		return descrption;
	}
}
