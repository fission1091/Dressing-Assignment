package com.Constraints;

// define constraints here based on temperature type
import java.util.HashSet;

import com.Constants.Constants;

public class Constraints {
	
	boolean isPanton;
	boolean isShirton;
	boolean isSockon;
	HashSet<Integer> uniqueValues;
	public Constraints(){
		uniqueValues = new HashSet<Integer>();
		isPanton=false;
		isShirton=false;
		isSockon=false;
	}
	
	//checking not perform one action twice
	public boolean onceAction(int id){
		if(!uniqueValues.contains(id)){
			uniqueValues.add(id);
			return true;
		}
		else
			return false;
	}
		
	//first action should be to remove PJs
	public boolean removePjs(int id){
		if(id==8)
			return true;
		else
			return false;
	}
	// checking to put jackets or scoks
	public boolean putJacketorSocks(int id){
		if(id==3||id==5)
			return false;
		else
			return true;
	}
	
	public boolean validAction(int id){
		if(id>8)
			return false;
		else
			return true;
	}
	//checking whether leaving house before all other actions are completed
	public boolean leavingHouseHot(int id,int index,int size){
	if(id==7&&index<(Constants.HOTACTIONS-1))
			return false;
		else
			return true;
	}
	
	//checking whether leaving house before all other actions are completed
	public boolean leavingHouseCold(int id,int index,int size){
		if(id==7&&index<(Constants.COLDACTIONS-1))
				return false;
			else
				return true;
	}
	
	//making pant on action true
	public void PantOn(int id){
		if(id==6)
			isPanton=true;
	}
	
	//putting on socks
	public void SockOn(int id){
		if(id==3)
			isSockon=true;
	}
	
	//putting on shirt
	public void ShirtOn(int id){
		if(id==4)
			isShirton=true;
	}
	
	// checking to put headwear after putting shirt on
	public boolean putShirtbefore(int id){
		if(id==2&&!isShirton)
			return false;
		else
			return true;
	}
	
	//checking to put shoes after putting pants
	public boolean putPantbefore(int id){
		if(id==1&&!isPanton)
			return false;
		else
			return true;
	}
	
	//checking to put socks before shoes
	public boolean putSocksBefore(int id){
		if(id==1&&!isSockon)
			return false;
		else
			return true;
	}
	
	public boolean putJacketAfter(int id){
		if(id==5&&!isShirton)
			return false;
		else
			return true;
	}
	
	
	
	
}
