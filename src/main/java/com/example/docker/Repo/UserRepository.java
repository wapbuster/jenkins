package com.example.docker.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.docker.domain.Country;

@RestResource(exported = false)
public interface UserRepository extends JpaRepository<Country, String> {

}
