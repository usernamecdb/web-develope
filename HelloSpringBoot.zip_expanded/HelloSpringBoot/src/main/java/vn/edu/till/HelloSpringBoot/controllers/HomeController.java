package vn.edu.till.HelloSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String trangChu() {
		
		
		return "index";
	}
	
	@GetMapping("/about")
	public String gioithieu() {
		
		
		return "about";
	}


}
