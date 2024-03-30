package com.nagarro.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/devops")
public class DevOpsController {


	

	@GetMapping
    public String getAllCustomers() {
  
            return "DevOps Application is Running";
    
	
	}
}


