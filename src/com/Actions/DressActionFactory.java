package com.Actions;

//creates Dress Action objects.
public class DressActionFactory {			
	
	private static DressActionFactory instance = null;
	private DressActionFactory() {}
	public static DressActionFactory getInstance() {
	      if(instance == null) {
	    	  instance = new DressActionFactory();
		  }
	      return instance;
	}
	
	public DressAction getAction(int i){
		if(i==1)
			return new PutFootwear();
		else if(i==2)
			return new PutHeadwear();
		else if(i==3)
			return new PutSocks();
		else if(i==4)
			return new PutShirt();
		else if(i==5)
			return new PutJacket();
		else if(i==6)
			return new PutPants();
		else if(i==7)
			return new LeaveHouse();
		else if(i==8)
			return new RemovePjs();
		else
			return null;
	}
}
