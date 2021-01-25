package com.Revature.ImprovTime.Beans;
import java.util.List;
import java.lang.Math;

public class Generator{
    public Generator(){
    }

    public void generate(List<Characters> characters, List<Setting> settings, List<Activity> activities){
        Characters char1 = new Characters();
        Characters char2 = new Characters();
        Setting setting = new Setting();
        Activity activity = new Activity();

        char1 = characters.get((int)(Math.random()*(characters.size())));
        char2 = characters.get((int)(Math.random()*(characters.size())));
        while(char2 == char1){
            char2 = characters.get((int)(Math.random()*(characters.size())));
        }
        setting = settings.get((int)(Math.random()*(settings.size())));
        activity = activities.get((int)(Math.random()*(activities.size())));

        System.out.println(char1.getName() + " and " + char2.getName() + " are " + activity.getName() + " while " + setting.getName());
    }
}
