package com.samuelsilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuelsilva.workshopmongo.domain.User;
import com.samuelsilva.workshopmongo.dto.UserDTO;
import com.samuelsilva.workshopmongo.repository.UserRepository;
import com.samuelsilva.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	// FINDALL RESPONSAVEL POR RETORNAR TODOS USUARIOS DO MEU BANCO
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		//User user = repo.findById(id);
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
