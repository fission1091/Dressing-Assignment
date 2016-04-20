package com.Actions;


public class PutHeadwear implements DressAction {
	int id;
	String descrption;
	PutHeadwear(){
		id=2;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "sun visor";
		else if(type.equals("COLD"))
			descrption = "hat";
		return descrption;
	}

}
