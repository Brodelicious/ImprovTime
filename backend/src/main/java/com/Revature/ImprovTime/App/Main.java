package com.Revature.ImprovTime.App;

import java.util.List;
import com.Revature.ImprovTime.Beans.Activity;
import com.Revature.ImprovTime.Beans.Characters;
import com.Revature.ImprovTime.Beans.Setting;

public class Main {

	private static List<Activity> actList;
	private static List<Characters> charsList;
	private static List<Setting> setList;
	
	public static void run()
	{
		System.out.println("I have begun!");
	}
	
	public static void fillLists()
	{
		Characters cha = new Characters();
		cha.setName("All the Ninja Turtles"); //1
		cha.setName("Shredder");			  //2
		cha.setName("Splinter");			  //3
		cha.setName("Joe Shmo");			  //4
		cha.setName("Tree #721");			  //5
		cha.setName("Megameme");			  //6
		cha.setName("Not so Superman");		  //7
		cha.setName("A Tree Frog");			  //8
		cha.setName("Romeo");				  //9
		cha.setName("Doomguy");				  //10
		cha.setName("Mr Incredible");		  //11
		cha.setName("Rango the Chameleon");	  //12
		
		
		Activity act = new Activity();
		act.setName("");
		act.setName("");
		act.setName("");
		act.setName("");
		act.setName("");
		act.setName("");
		
		Setting setting = new Setting();
		setting.setName("Elevator ride to the 34th floor, but each floor button is lit.");
		setting.setName("Woke up skydiving with no memory of how you got here.");
		setting.setName("Revature zoom call, but before the trainer is online.");
		setting.setName("At brian's house");
		setting.setName("Currently on the actual titanic in today's year.");
		setting.setName("Literally in a git hub.");
	}
	
	public static void activitylist() {
		Activity ac = new Activity();
		ac.setName("mugging a shark");
		ac.setName("milking a cow");
		ac.setName("eating dinner with batchmates");
		ac.setName("riding a tandem bike");
		ac.setName("shopping at walmart");
	}
	
}
