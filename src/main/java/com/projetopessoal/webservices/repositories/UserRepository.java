package com.projetopessoal.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
