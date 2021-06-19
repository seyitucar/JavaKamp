package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.SkillService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.CoverLetter;
import com.seyitucar.hrmsSpring.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

	private SkillService skillService;
	
	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody Skill skill) {
		return this.skillService.add(skill);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Skill>> getAll(){
		return this.skillService.getAll();
	}
	
	@GetMapping("/getAllByEmployeeId")
	DataResult<List<Skill>> getAllByEmployeeId(@RequestParam int employeeId){
		return this.skillService.getAllByEmployeeId(employeeId);
	}
}
