package com.Actions;


public class PutSocks implements DressAction {

	int id;
	String descrption;
	PutSocks(){
		id=3;
		descrption =new String();
	}
	
	public String getResponse(String type){
		if(type.equals("HOT"))
			descrption = "fail";
		else if(type.equals("COLD"))
			descrption = "socks";
		return descrption;
	}

}
