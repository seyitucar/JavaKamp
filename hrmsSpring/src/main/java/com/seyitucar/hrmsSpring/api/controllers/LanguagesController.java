package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.LanguageService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	};
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}

}
