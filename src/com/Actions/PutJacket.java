package com.Actions;


public class PutJacket implements DressAction {

	int id;
	String descrption;
	PutJacket(){
		id=5;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "fail";
		else if(type.equals("COLD"))
			descrption = "jacket";
		return descrption;
	}
}
