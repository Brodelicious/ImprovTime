package com.Revature.ImprovTime.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Revature.ImprovTime.Beans.Characters;

@Repository
public interface CharacterDAO extends JpaRepository<Characters, Integer> {

}
