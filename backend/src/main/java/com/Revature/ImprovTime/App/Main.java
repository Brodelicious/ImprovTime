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
		cha.setName("All the Ninja Turtles");
		cha.setName("Shredder");
		cha.setName("Splinter");
		cha.setName("Joe Shmo");
		cha.setName("Tree #721");
		cha.setName("Megameme");
		cha.setName("Not so Superman");
		cha.setName("A Tree Frog");
		cha.setName("Romeo");
		cha.setName("Doomguy");
		cha.setName("Mr Incredible");
		cha.setName("Rango the Chameleon");
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
