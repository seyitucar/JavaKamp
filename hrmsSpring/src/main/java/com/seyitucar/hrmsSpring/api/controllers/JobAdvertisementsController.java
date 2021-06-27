package com.seyitucar.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seyitucar.hrmsSpring.business.abstracts.JobAdvertisementService;
import com.seyitucar.hrmsSpring.core.utilities.results.DataResult;
import com.seyitucar.hrmsSpring.core.utilities.results.Result;
import com.seyitucar.hrmsSpring.entities.concretes.JobAdvertisement;
import com.seyitucar.hrmsSpring.entities.dtos.JobAdvertisementDto;

@CrossOrigin
@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement){
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/setStatus")
	public Result setStatus(@RequestParam int jobAdvertisementId, int employerId, boolean status){
		return this.jobAdvertisementService.setStatus(jobAdvertisementId, employerId, status);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByActivity")
	public DataResult<List<JobAdvertisementDto>> getByActivity(boolean activityStatus){
		return this.jobAdvertisementService.getByActivity(activityStatus);
	}
	
	@GetMapping("/getByActivityOrderByApplicationDeadline")
	public DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadline(boolean activityStatus){
		return this.jobAdvertisementService.getByActivityOrderByApplicationDeadline(activityStatus);
	}
	
	@GetMapping("/getByActivityOrderByApplicationDeadlineDesc")
	public DataResult<List<JobAdvertisementDto>> getByActivityOrderByApplicationDeadlineDesc(boolean activityStatus){
		return this.jobAdvertisementService.getByActivityOrderByApplicationDeadlineDesc(activityStatus);
	}
	
	@GetMapping("/getByActivityAndCompanyName")
	public DataResult<List<JobAdvertisementDto>> getByActivityAndCompanyName(@RequestParam boolean activityStatus, @RequestParam String companyName){
		return this.jobAdvertisementService.getByActivityAndCompanyName(activityStatus, companyName);
	}
	
	@GetMapping("/getByEmployerId")
	public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int employerId){
		return this.jobAdvertisementService.getByEmployerId(employerId);
	}
}
