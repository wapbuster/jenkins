package com.example.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.Repo.UserRepository;
import com.example.docker.domain.Country;

@RestController
@RequestMapping("/rest")
public class Controller {

	@Autowired
	private UserRepository repository;

	@GetMapping("/hello")
	public String hello() {
		return "Hello Docker";
	}

	@GetMapping
	public Iterable<Country> findAll() {
		List<Country> list = null;
		try {
			list = repository.findAll();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return list;
	}

	@PostMapping(consumes = "application/json")
	public String create(@RequestBody Country country) {
		Country con = null;
		try {
			con = repository.save(country);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return "created..!";
	}

	@DeleteMapping(path = "/{country_id}")
	public String delete(@PathVariable("country_id") String country_id) {
		try {
			repository.deleteById(country_id);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return "deleted..!";
	}
}
