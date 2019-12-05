package com.afersys.ng8boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afersys.ng8boot.entities.Employe;
import com.afersys.ng8boot.repositories.EmployeRepository;

@RestController
@RequestMapping(value = "/api")
public class EmployeRestController {

	@Autowired
	EmployeRepository empRepo;

	@GetMapping(value = "/empList")
	public ResponseEntity<List<Employe>> getAllEmployes() {
		return ResponseEntity.ok(empRepo.findAll());

	}

	@PostMapping(value = "/addEmp")
	public ResponseEntity<Employe> addNewEmploye(@RequestBody Employe emp) {
		return ResponseEntity.ok(empRepo.save(emp));
	}

	@DeleteMapping(value = "/deleteEmp/{matricule}")
	public ResponseEntity<String> deleteEmploye(@PathVariable String matricule) {
		Employe emp = empRepo.findByMatricule(matricule);
		if (emp == null)
			return ResponseEntity.notFound().build();
		empRepo.delete(emp);
		return new ResponseEntity<>(matricule, HttpStatus.OK);

	}

	@PutMapping(value = "/editEmp/{matricule}")
	public ResponseEntity<Employe> updateEmploye(@RequestBody Employe emp1, @PathVariable String matricule) {
		Employe emp = empRepo.findByMatricule(matricule);
		if (emp == null)
			return ResponseEntity.notFound().build();
		emp1.setId(emp.getId());
		empRepo.save(emp1);
		return new ResponseEntity<>(emp1, HttpStatus.OK);

	}

}
