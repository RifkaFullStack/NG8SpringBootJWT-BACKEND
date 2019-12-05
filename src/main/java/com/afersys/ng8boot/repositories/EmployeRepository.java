package com.afersys.ng8boot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afersys.ng8boot.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

	Employe findByMatricule(String matricule);

}
