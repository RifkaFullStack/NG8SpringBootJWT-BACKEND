package com.afersys.ng8boot.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api")
public class UserRestController {

	
	 @GetMapping(path = "/hello")
	    public ResponseEntity<String> basicauth() {
		 return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	    }
}
