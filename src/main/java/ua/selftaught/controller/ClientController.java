package ua.selftaught.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.selftaught.model.Client;
import ua.selftaught.repository.ClientRepository;

@RestController
public class ClientController {
	
	private ClientRepository repository;
	
	@Autowired
	public ClientController(ClientRepository repo) {
		this.repository = repo;
	}
	
	@GetMapping("/client")
	public List<Client> clients() {
		return this.repository.findAll();
	}

}
