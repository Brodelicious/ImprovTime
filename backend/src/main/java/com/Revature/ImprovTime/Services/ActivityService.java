package com.Revature.ImprovTime.Services;

import com.Revature.ImprovTime.Beans.Activity;
import java.util.List;
import com.Revature.ImprovTime.DAOs.ActivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService{
    private ActivityDAO activityDAO;

    @Autowired
    public ActivityService(ActivityDAO ad){
        activityDAO = ad;
    }

    // Create
    public Activity add(Activity activity){
        return activityDAO.save(activity);
    }

    // Read
    public List<Activity> getAll(){
        return activityDAO.findAll();
    }

    public Activity getById(Integer id){
        return activityDAO.findById(id).get();
    }

    // Update
    public void update(Activity activity){
        activityDAO.save(activity);
    }

    // Delete
    public void delete(Activity activity){
        activityDAO.delete(activity);
    }

}
