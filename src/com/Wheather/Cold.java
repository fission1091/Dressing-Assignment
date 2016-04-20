package com.Wheather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.Actions.DressAction;
import com.Actions.DressActionFactory;
import com.Constants.Constants;
import com.Constraints.Constraints;

public class Cold implements TemperatureType {
	private Map<Integer,DressAction> mapping;
	public Cold(){
		mapping = new HashMap<Integer,DressAction>();
		DressActionFactory actionFactory = DressActionFactory.getInstance();
		for(int i=1;i<=Constants.NOOFACTIONS;i++){
			addAction(i,actionFactory.getAction(i) );
		}
	}
	
	public void addAction(int id,DressAction action){
		mapping.put(id,action);
	}
	
	public void removeAction(int id){
		mapping.remove(id);
	}
	
	public String getResponse(int id){
		DressAction da = mapping.get(id);
		return da.getResponse("COLD");
	}
	
	public String getDressed(ArrayList<Integer> sequence) {
		
		Constraints constraints = new Constraints();
		String answer = new String();
		
		if(sequence.size()>0&&!constraints.removePjs(sequence.get(0))){
			answer+="fail";
			return answer;
		}
		else if(sequence.size()>0)
			answer+=" "+getResponse(sequence.get(0))+",";
		
		for(int i=1;i<sequence.size();i++){
			int id = sequence.get(i);
			constraints.PantOn(id);
			constraints.ShirtOn(id);
			constraints.SockOn(id);
			if(constraints.validAction(id)&&
				constraints.onceAction(id)&&
				constraints.putPantbefore(id)&&
				constraints.putShirtbefore(id)&&
				constraints.putJacketAfter(id)&&
				constraints.putSocksBefore(id)&&
				constraints.leavingHouseCold(id, i, sequence.size())){
				
				answer+=" "+getResponse(id)+",";
			}
			else{
				answer+="fail";
				break;
			}
			
		}
		return answer;
	}
}
