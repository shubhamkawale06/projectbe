package com.dummyproject.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dummyproject.app.entity.Forecast;
import com.dummyproject.app.repository.ForecastRepository;

@Service
public class ForecastService {
	
	private ForecastRepository forecastRepo;

	public ForecastService(ForecastRepository forecastRepo) {
		this.forecastRepo = forecastRepo;
	}
	
	public List<Forecast> getAllForecast(){
		return forecastRepo.findAll();
	}
}
