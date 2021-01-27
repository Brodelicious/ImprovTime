package com.Revature.ImprovTime.DAOs;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Revature.ImprovTime.Beans.Activity;

@Repository
public interface ActivityDAO extends JpaRepository<Activity, Integer>{
    public Activity findByName(String name);
}
