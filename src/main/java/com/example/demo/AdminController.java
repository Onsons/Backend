package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	/* @PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminRepository.save(admin);
		
	}*/

}
