package com.Revature.ImprovTime.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Revature.ImprovTime.Beans.Activity;
import com.Revature.ImprovTime.Beans.Generator;
import com.Revature.ImprovTime.Services.ActivityService;
import com.Revature.ImprovTime.Services.CharacterService;
import com.Revature.ImprovTime.Services.SettingsService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path = "/generators")
@CrossOrigin(origins="http://localhost:4200")
public class GeneratorController {
	
	private ActivityService asev;
	private CharacterService cserv;
	private SettingsService sserv;
	ObjectMapper om = new ObjectMapper();
	
	@Autowired
	public GeneratorController(ActivityService as, CharacterService cs, SettingsService ss) {
		this.cserv = cs;
		this.asev = as;
		this.sserv = ss;
	}
	
	@GetMapping
	public ResponseEntity<String> getScene(){
		Generator gen = new Generator();
		String str = gen.generate(cserv.getAll(), sserv.getAllSettings(), asev.getAll());
		try{
	    	str = om.writeValueAsString(str);
		}
		catch(Exception e){
		    return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(str);
	}
	
}
