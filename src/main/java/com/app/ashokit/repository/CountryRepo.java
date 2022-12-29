package com.app.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ashokit.entity.CityEntity;
import com.app.ashokit.entity.CountryEntity;

public interface CountryRepo extends JpaRepository<CountryEntity, Serializable> {

	public List<CountryEntity> findByCountryId(Integer countryId);

}
