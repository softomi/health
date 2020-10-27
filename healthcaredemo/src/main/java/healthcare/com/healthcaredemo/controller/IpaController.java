package healthcare.com.healthcaredemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import healthcare.com.healthcaredemo.entity.Cases;
import healthcare.com.healthcaredemo.service.IpaService;

@RestController
@RequestMapping("/healthcare")
public class IpaController {

	@Autowired
	IpaService ipaservice;
	
	@GetMapping("/get")
	public List<Cases> getAllInformation(){
		return ipaservice.getAllData();
	}
	
	@PostMapping("/uploaddata")
	public Cases uploadData(@RequestBody Cases patient) {
		return ipaservice.uploadData(patient);
	}
	
}
