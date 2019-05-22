package com.andre.isidoro.sprindemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		
		theModel.addAttribute("student" , theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("theStudent") Student theStudent) {
		System.out.println("first name=" + theStudent.getFirstName() + "/nlast name=" + theStudent.getLastName());
		return "student-confirmation";
	}
}
