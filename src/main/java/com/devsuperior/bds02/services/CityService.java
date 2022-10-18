package com.devsuperior.bds02.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.devsuperior.bds02.dto.CityDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.repositories.CityRepository;

@Service
public class CityService {

	private CityRepository repository;
	
	public List<CityDTO> findAll() {
		List<City> list = repository.findAll();
		return list.stream().map(x -> new CityDTO(x)).collect(Collectors.toList());
	}
}
