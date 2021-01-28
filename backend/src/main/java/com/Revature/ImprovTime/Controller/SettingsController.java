package com.Revature.ImprovTime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Revature.ImprovTime.Beans.Setting;
import com.Revature.ImprovTime.Services.SettingsService;

@RestController
@RequestMapping("/settings")
@CrossOrigin(origins="http://localhost:4200")
public class SettingsController {

	private SettingsService setServ;
	
	@Autowired
	public SettingsController(SettingsService setServ)
	{
		this.setServ = setServ;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Setting> getSettingById(@PathVariable Integer id)
	{

		Setting set = setServ.getSettingByID(id);
		
		if (set != null)
		{
			return ResponseEntity.ok(set);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Setting>> getAllSettings()
	{
		return ResponseEntity.ok(setServ.getAllSettings());
	}
	
	@PostMapping
	public ResponseEntity<Setting> addSetting(@RequestBody Setting set)
	{
		return ResponseEntity.ok(setServ.addSetting(set));
	}
	
	@PutMapping
	public void updateSetting(@RequestBody Setting set)
	{
		setServ.updateSetting(set);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSetting(@PathVariable Integer id)
	{
		setServ.deleteSetting(setServ.getSettingByID(id));
	}
	
}
