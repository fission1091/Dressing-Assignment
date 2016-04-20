package com.Actions;


public class PutFootwear implements DressAction {
	int id;
	String descrption;
	PutFootwear(){
		id=1;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "sandals";
		else if(type.equals("COLD"))
			descrption = "boots";
		return descrption;
	}
}
