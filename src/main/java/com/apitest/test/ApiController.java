package com.apitest.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ApiController {
	
	@PostMapping("/postTest")
	public String getPost() {
		return "helloPostTest";
		
	}
	
	@GetMapping("/getTest")
	public String getGet() {
		return "helloPostTest";		
	}
	
	@PutMapping("/updateTest")
	public void update() {
		//TODO
	}
	
	@DeleteMapping("/deleteTest")
	public void delete() {
		//TODO
	}
}
