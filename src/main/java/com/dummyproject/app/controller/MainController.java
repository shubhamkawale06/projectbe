package com.dummyproject.app.controller;
import com.dummyproject.app.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummyproject.app.service.ForecastService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

    private final UserService userService;

    private final ForecastService forecastService;
	
	public MainController(ForecastService forecastService, UserService userService) {
		this.forecastService = forecastService;
		this.userService = userService;
	}

	@GetMapping("allforecast")
	public ResponseEntity<Object> getForecastData(){
		return  ResponseEntity.ok(forecastService.getAllForecast());
	}
	
	 @GetMapping("{userName}/{password}")
	    public ResponseEntity<Object> getExample(@PathVariable String userName,
	    		@PathVariable String password) {
	        return ResponseEntity.ok(userService.validUserOrNot(userName, password));
	    }

	
	
}
