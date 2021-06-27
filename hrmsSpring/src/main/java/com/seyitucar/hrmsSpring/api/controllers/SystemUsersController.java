package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.SystemUserService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.entities.concretes.SystemUser;


@RestController
@RequestMapping("/api/systemusers")
public class SystemUsersController {
	
	private SystemUserService systemUserService;
	
	@Autowired
	public SystemUsersController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}

	@GetMapping("/getAll")
	public DataResult<List<SystemUser>> getAll(){
		return this.systemUserService.getAll();
	}
}
