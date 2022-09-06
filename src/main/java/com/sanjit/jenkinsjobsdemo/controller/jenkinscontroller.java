package com.sanjit.jenkinsjobsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinscontroller {
	
	@GetMapping("/")
	public ResponseEntity<String> display()
	{
		return new ResponseEntity<>("Jenkins Jobs", HttpStatus.OK);
	}

}
