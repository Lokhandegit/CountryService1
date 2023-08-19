package com.country.service.ServiceImpl;

import java.util.List;

import com.country.service.Dto.CountryDto;
import com.country.service.Repository.entity.CountryEntity;

public interface CountryService {

		/**
		 * This method is use to save the data in database
		 * 
		 * @param countryDto
		 * @return "Successfully Saved"
		 */
		String saveCountryInToDB(CountryDto countryDto);
		/**
		 * This method is use to get country list from  database
		 * 
		 * 
		 * @return CountryDto List of countries
		 */
	   List<CountryDto> getAllCountries();
	   CountryDto getCountryById(int countryId);

		/**
		 * 
		 * @param entity
		 * @param countryId
		 * @return
		 */
		
		CountryEntity updateCountry(CountryEntity entity, int countryId);

		/**
		 * This method is use to delete the country from database
		 * 
		 * @return "Country is Deleted"
		 */
		String deleteCountry(int countryId);

	}

