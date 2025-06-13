package com.dummyproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dummyproject.app.entity.Forecast;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast, Integer>{

}
