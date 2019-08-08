package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@RequestMapping("/page")
	@ResponseBody
	public String getEmployee() {
		return "Rehan Ali";
	}
}
