package com.Actions;


public class PutPants implements DressAction {

	int id;
	String descrption;
	PutPants(){
		id=6;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "shorts";
		else if(type.equals("COLD"))
			descrption = "pants";
		return descrption;
	}

}
