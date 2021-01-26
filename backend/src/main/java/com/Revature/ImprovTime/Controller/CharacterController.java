package com.Revature.ImprovTime.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.Revature.ImprovTime.Beans.Characters;
import com.Revature.ImprovTime.Services.CharacterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/characters")
public class CharacterController {
	
	private CharacterService charactersServ;
	
	@Autowired
	public CharacterController(CharacterService cs) {
		this.charactersServ = cs;
	}
	
	@GetMapping
	public ResponseEntity<List<Characters>> getAll(){
		
		List<Characters> chars = charactersServ.getAll();
		return ResponseEntity.ok(chars);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Characters> getById(@PathVariable("id") Integer id){
		
		Characters chars = charactersServ.getById(id);
		if(chars != null)
		return ResponseEntity.ok(chars);
		return ResponseEntity.notFound().build();
	}
	
	
	@PostMapping
	public ResponseEntity<Characters> addCharacters(@RequestBody Characters c){
		
		return ResponseEntity.ok(charactersServ.addCharacter(c));
	}
	
	
	@PutMapping
	public ResponseEntity<Void> updateCharacters(@RequestBody Characters c){
		
		charactersServ.updateCharacters(c);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping
	public ResponseEntity<Void> deleteCharacters(@RequestBody Characters c){
		
		charactersServ.deleteCharacters(c);
		return ResponseEntity.ok().build();
	}

}
