package com.vaibhav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vaibhav.model.Employee;
import com.vaibhav.service.IEmployeeService;
// hi vaibhav Update add commnts for checking  github 
@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
     
	@RequestMapping(value="/showlogin")
     public String showPage() {
		return "EmployeeLogin";
	}
     @RequestMapping(value="/empData",method=RequestMethod.POST)
     public String empRegister(@ModelAttribute("employee") Employee emp,ModelMap map){
           service.empSave(emp);	 
           map.addAttribute("emp",emp);
    	 return "EmployeeData";
     }
}
