package com.ust.EmployeeSecurity.controller;

    import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/rest/auth1")
	public class Controller {
	    @GetMapping("/two")
	    public String greeting() {
	    	return "Hi Meenakshi(no auth) good morning ";
	    }
	}

