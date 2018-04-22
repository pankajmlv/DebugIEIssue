package com.test.preview.logo.DebugIEIssue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class DebugIeIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebugIeIssueApplication.class, args);
	}

	@GetMapping("/home")
	public String getHOme(Model model)
	{
		return "home";
	}

}
