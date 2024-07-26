package com.samuelsilva.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samuelsilva.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	//SPRING DATA PARA MONTAR UMA CONSULTA	
	List<Post> findByTitleContainingIgnoreCase(String text);

}
