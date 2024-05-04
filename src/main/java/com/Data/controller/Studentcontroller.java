package com.Data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Data.Model.Student;
import com.Data.service.Studentservice;

@Controller
public class Studentcontroller {

	@Autowired
	private Studentservice service;

	@RequestMapping("/")
	public String landingPage() {
		return "index";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}

	@RequestMapping("/regstu")
	public String saveStudent(@ModelAttribute Student student) {
		System.out.println("inside Controller Layer");
		System.out.println(student.toString());
		service.saveStudent(student);
		return "index";
	}

	@RequestMapping("/logincheck")
	public String loginCheck(@RequestParam String username, @RequestParam String password, Model model) {
		System.out.println(username + "  " + password);

		boolean flag = service.loginCheck(username, password);

		if (flag) {
			List<Student> list = service.getAllData();
			model.addAttribute("data", list);
			return "Show";

		} else {

			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int RollNo,Model model)
	{
		System.out.println("Student Rollno :"+RollNo);
		
		List<Student> list= service.deleteStudent(RollNo);
		
		model.addAttribute("data", list);
		return "Show";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int RollNo, Model model)
	{
		System.out.println("Student Rollno :"+RollNo);
		
	     Student  stu = service.getStudentData(RollNo);
		
	     model.addAttribute("student", stu);
	     
	     return "update";
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student stu, Model model)
	{
		System.out.println(stu);
	
		List<Student>  list =service.updateStudent(stu);
		
		model.addAttribute("data", list);
		
		return "Show";
	}
	

}
