package com.Revature.ImprovTime.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Revature.ImprovTime.Beans.Characters;
import com.Revature.ImprovTime.DAOs.CharacterDAO;

@Service
public class CharacterService {
	private CharacterDAO charactersDao;
	
	@Autowired
	public CharacterService(CharacterDAO cd) {
		
		charactersDao = cd;
	}
	
	
	public List<Characters> getAll(){
		
		return charactersDao.findAll();
	}
	
	
	public Characters getById(Integer id) {

		return charactersDao.findById(id).get();
		
	}
	
	
	public Characters addCharacter(Characters c) {
		
		charactersDao.save(c);
		return c;
	}
	
	
	public void deleteCharacters(Characters c) {
		
		charactersDao.delete(c);
	}
	
	
	public void updateCharacters(Characters c) {
		
		charactersDao.save(c);
	}

}
