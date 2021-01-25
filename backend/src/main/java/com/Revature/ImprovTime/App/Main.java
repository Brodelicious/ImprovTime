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
		addCharacter("All the Ninja Turtles"); //1
		addCharacter("Shredder");			  //2
		addCharacter("Splinter");			  //3
		addCharacter("Joe Shmo");			  //4
		addCharacter("Tree #721");			  //5
		addCharacter("Megameme");			  //6
		addCharacter("Not so Superman");		  //7
		addCharacter("A Tree Frog");			  //8
		addCharacter("Romeo");				  //9
		addCharacter("Doomguy");				  //10
		addCharacter("Mr Incredible");		  //11
		addCharacter("Rango the Chameleon");	  //12
		
		
		
		addActivity("mugging a shark");
		addActivity("milking a cow");
		addActivity("eating dinner with batchmates");
		addActivity("riding a tandem bike");
		addActivity("shopping at walmart");
		
		addSetting("Elevator ride to the 34th floor, but each floor button is lit.");
		addSetting("Woke up skydiving with no memory of how you got here.");
		addSetting("Revature zoom call, but before the trainer is online.");
		addSetting("At brian's house");
		addSetting("Currently on the actual titanic in today's year.");
		addSetting("Literally in a git hub.");
	}
	
	private static void addCharacter(String name)
	{
		Characters cha = new Characters();
		cha.setName(name);
		charsList.add(cha);
	}
	
	private static void addSetting(String name)
	{
		Activity act = new Activity();
		act.setName(name);
		actList.add(act);
	}
	
	private static void addActivity(String name)
	{
		Setting setting = new Setting();
		setting.setName(name);
		setList.add(setting);
	}
	
}
