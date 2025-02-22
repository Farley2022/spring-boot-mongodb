package com.revolution.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revolution.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria", "maria@com.br");
		User joao = new User("2", "Joao", "joao@com.br");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, joao));
		return ResponseEntity.ok().body(list);
	}
	
}
