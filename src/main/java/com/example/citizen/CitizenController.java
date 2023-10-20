package com.example.citizen;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "citizen/v1")
public class CitizenController {


    @Value("${spring.datasource.url}")
	private String dataSourceUrl;

	private CitizenService citizenService;

    public CitizenController(CitizenService citizenService) {
		this.citizenService = citizenService;
	}

	@GetMapping(value = "/citizens")  
	public List<Citizen> getAllCitizens() {

		return this.citizenService.getAll();

	}

    @RequestMapping("/env")
    public String home() {
        return "DB url: " + dataSourceUrl;
    }

    @GetMapping(value = "/insert3")  
	public void insert3() {

		this.citizenService.insert3();

	}

	@PostMapping(value = "/insert")  
	public void insert(@RequestBody Citizen citizen) {

		this.citizenService.insert(citizen);

	}

}
