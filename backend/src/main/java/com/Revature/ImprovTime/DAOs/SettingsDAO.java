package com.Revature.ImprovTime.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Revature.ImprovTime.Beans.Setting;

public interface SettingsDAO extends JpaRepository<Setting, Integer> {

}
