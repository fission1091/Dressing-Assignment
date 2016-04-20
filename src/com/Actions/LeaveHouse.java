package com.Actions;


public class LeaveHouse implements DressAction {

	int id;
	String descrption;
	LeaveHouse(){
		id=7;
		descrption =new String();
	}
	
	public String getResponse(String type){
		descrption = "leaving house";
		return descrption;
	}
}
