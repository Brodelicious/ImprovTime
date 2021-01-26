package com.Revature.ImprovTime.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Revature.ImprovTime.Beans.Setting;
import com.Revature.ImprovTime.DAOs.SettingsDAO;

@Service
public class SettingsService {

	private SettingsDAO setDAO;
	
	@Autowired
	public SettingsService(SettingsDAO setDAO)
	{
		this.setDAO = setDAO;
	}
	
	
	public Setting getSettingByID(Integer id)
	{
		return setDAO.getOne(id);
	}
	
	public List<Setting> getAllSettings()
	{
		return setDAO.findAll();
	}
	
	public Setting addSetting(Setting set)
	{
		return setDAO.save(set);
	}
	
	public void updateSetting(Setting set)
	{
		if(setDAO.getOne(set.getId()) != null)
		{
			setDAO.save(set);
		}
	}
	
	public void deleteSetting(Setting set)
	{
		setDAO.delete(set);
	}
	
}
