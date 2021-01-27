package com.Revature.ImprovTime.Controller;

import com.Revature.ImprovTime.Beans.*;
import com.Revature.ImprovTime.Services.ActivityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping(path="/activities")
public class ActivityController{
    private ActivityService activityService;

    @Autowired
    ActivityController(ActivityService as){
        this.activityService = as;
    }
    
    // Create
    @PostMapping
    public ResponseEntity<Activity> add(@RequestBody Activity activity){
        return ResponseEntity.ok(activityService.add(activity));
    }

    // Read
    @GetMapping(path="/{id}")
    public ResponseEntity<Activity> getById(@PathVariable("id") Integer id){
        Activity activity = activityService.getById(id);
        if(activity != null){
            return ResponseEntity.ok(activity);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Activity>> getAll(){
        return ResponseEntity.ok(activityService.getAll());
    }

    // Update
    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Activity activity){
        activityService.update(activity);
        return ResponseEntity.ok().build();
    }

    // Delete
    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Activity activity){
        activityService.delete(activity);
        return ResponseEntity.ok().build();
    }
}
