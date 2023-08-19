package com.country.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.country.service.Dto.CountryDto;
import com.country.service.Repository.entity.CountryEntity;
import com.country.service.ServiceImpl.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@PostMapping("/add-country")
	public String saveCountryInTODB(@RequestBody CountryDto countryDto) {
		String saveCountryInToDB = countryService.saveCountryInToDB(countryDto);
		return saveCountryInToDB;
	}


	@GetMapping("/country")
	public List<CountryDto> getAllCountries() {
		return countryService.getAllCountries();
	}

	@GetMapping("/country/{id}")
	public ResponseEntity<CountryDto> getCountryById(@PathVariable(value = "id") int countryId) {
		CountryDto dto = countryService.getCountryById(countryId);
		if (dto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity<>(dto, HttpStatus.OK);
		}
	}

	@PutMapping("/country/{id}")
	public ResponseEntity<CountryEntity> updateCountry(@RequestBody CountryEntity entity,
			@PathVariable(value = "id") int countryId) {
		CountryEntity country = countryService.updateCountry(entity, countryId);
		return new ResponseEntity<>(country, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/country/{id}")
	public String deleteCountry(@PathVariable(value = "id") int countryId) {
		String str = countryService.deleteCountry(countryId);
		return str;

	}

}
