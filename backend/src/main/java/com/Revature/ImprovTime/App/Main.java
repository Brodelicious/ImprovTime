package com.Revature.ImprovTime.App;

import java.util.ArrayList;
import java.util.List;
import com.Revature.ImprovTime.Beans.Activity;
import com.Revature.ImprovTime.Beans.Characters;
import com.Revature.ImprovTime.Beans.Generator;
import com.Revature.ImprovTime.Beans.Setting;

public class Main {

	private static List<Activity> actList = null;
	private static List<Characters> charsList = null;
	private static List<Setting> setList = null;
	
	public static void run()
	{
		System.out.println("Scene!");
		fillLists();
		Generator gen = new Generator();
		gen.generate(charsList, setList, actList);
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
		
		addSetting("on an elevator ride to the 34th floor, but each floor button is lit.");
		addSetting("they woke up skydiving with no memory of how you got here.");
		addSetting("on a revature zoom call, but before the trainer is online.");
		addSetting("at brian's house");
		addSetting("currently on the actual titanic in today's year.");
		addSetting("literally in a git hub.");
	}
	
	private static void addCharacter(String name)
	{
		if(charsList == null)
		{
			charsList = new ArrayList<Characters>();
		}
		Characters cha = new Characters();
		cha.setName(name);
		charsList.add(cha);
	}
	
	private static void addSetting(String name)
	{
		if(setList == null)
		{
			setList = new ArrayList<Setting>();
		}
		
		Setting setting = new Setting();
		setting.setName(name);
		setList.add(setting);
	}
	
	private static void addActivity(String name)
	{
		if(actList == null)
		{
			actList = new ArrayList<Activity>();
		}
		
		Activity act = new Activity();
		act.setName(name);
		actList.add(act);
	}
	
}
