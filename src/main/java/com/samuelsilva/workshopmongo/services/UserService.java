package com.samuelsilva.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuelsilva.workshopmongo.domain.User;
import com.samuelsilva.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	// FINDALL RESPONSAVEL POR RETORNAR TODOS USUARIOS DO MEU BANCO
	public List<User> findAll(){
		return repo.findAll();
	}
}
