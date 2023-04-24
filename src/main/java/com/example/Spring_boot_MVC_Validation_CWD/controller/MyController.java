package com.example.Spring_boot_MVC_Validation_CWD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Spring_boot_MVC_Validation_CWD.entity.LoginData;

import jakarta.validation.Valid;

 

@Controller
public class MyController {
	@GetMapping("/form")
	public String pageForm(Model model) {
		 model.addAttribute("loginData", new LoginData());
		return "form";
	}
	//handelere
	@PostMapping("/process")
	public String processForm(@Valid  @ModelAttribute("loginData")LoginData loginData,BindingResult result,  Model model) {
		 model.addAttribute("loginData", loginData);
	 
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
	}

}
