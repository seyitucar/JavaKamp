package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.EmployeeLanguageService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.EmployeeLanguage;

@RestController
@RequestMapping("/api/employeelanguages")
public class EmployeeLanguagesController {

	private EmployeeLanguageService employeeLanguageService;
	
	@Autowired
	public EmployeeLanguagesController(EmployeeLanguageService employeeLanguageService) {
		super();
		this.employeeLanguageService = employeeLanguageService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody EmployeeLanguage employeeLanguage) {
		return this.employeeLanguageService.add(employeeLanguage);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<EmployeeLanguage>> getAll(){
		return this.employeeLanguageService.getAll();
	}
	
	@GetMapping("/getAllByEmployeeId")
	DataResult<List<EmployeeLanguage>> getAllByEmployeeId(@RequestParam int employeeId){
		return this.employeeLanguageService.getAllByEmployeeId(employeeId);
	}
}
