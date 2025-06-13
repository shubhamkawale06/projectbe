package com.dummyproject.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummyproject.app.service.ForecastService;

@RestController
@RequestMapping("/api/v1/")
public class MainController {

    private final ForecastService forecastService;
	
	public MainController(ForecastService forecastService) {
		this.forecastService = forecastService;
	}

	@GetMapping("allforecast")
	public ResponseEntity<Object> getForecastData(){
		return  ResponseEntity.ok(forecastService.getAllForecast());
	}
}
