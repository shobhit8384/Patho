package com.amrit.pathology.controller;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/billing")
public class BillingController {


//	@GetMapping(value="/get")
//	public ResponseEntity<String> djjdjfjn(){
//		return new ResponseEntity<>("Hello",HttpStatus.OK);
//
//	}
	@GetMapping("/hello")
	public String hello(){
		return "Hello";
	}
}
