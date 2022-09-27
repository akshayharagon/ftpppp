package com.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/homepage")
	public String viewHomePage() {
		return "Home Page";
	}
	
	@RequestMapping("/user")
	public String viewUserPage() {
		return "User Page";
	}
	@RequestMapping("/admin")
	public String viewAdminPage() {
		return "Admin Page";
	}
}
