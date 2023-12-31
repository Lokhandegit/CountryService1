package com.country.service.Dto;


public class CountryDto {

	private int id;
	private String countryName;
	private String countryCapital;

	public CountryDto() {
	}

	public CountryDto(int id, String countryName, String countryCapital) {
		this.id = id;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	@Override
	public String toString() {
		return "CountryDto [id=" + id + ", countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}

}

