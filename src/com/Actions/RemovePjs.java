package com.Actions;


public class RemovePjs implements DressAction {

	int id;
	String descrption;
	RemovePjs(){
		id=8;
		descrption =new String();
	}
	
	public String getResponse(String type){
		descrption = "Removing PJs";
		return descrption;
	}

}
