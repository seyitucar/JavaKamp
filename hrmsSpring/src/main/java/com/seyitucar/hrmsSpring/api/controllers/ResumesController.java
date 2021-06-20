package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.ResumeService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {
	
	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume  resume) {
		return this.resumeService.add(resume);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll() {
		return this.resumeService.getAll();
	}
	
	@GetMapping("/getByEmployeeId")
	DataResult<Resume> getByEmployeeId(@RequestParam int employeeId){
		return this.resumeService.getByEmployeeId(employeeId);
	}
}
