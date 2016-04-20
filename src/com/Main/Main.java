package com.Main;

import java.util.ArrayList;
import com.Wheather.TemperatureType;
import com.Wheather.TypeFactory;

public class Main {

	public static void main(String[] args) {
		if(args.length!=2){
			System.out.println("Invalid Arguments");
			System.exit(1);
		}
		String type = args[0];
		//String s = "HOT 8,6,4,2,1,7";
		String[] commands = args[1].split(",");
		ArrayList<Integer> listCommands = new ArrayList<Integer>();
		for(int i=0;i<commands.length;i++){
			listCommands.add(Integer.parseInt(commands[i]));
		}
		
		TypeFactory factory = TypeFactory.getInstance();
		TemperatureType wheatherType = factory.getType(type);
		System.out.print("Output: ");
		System.out.println(wheatherType.getDressed(listCommands));
	}

}
