package com.app.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ashokit.entity.StateEntity;

public interface StateRepo extends JpaRepository<StateEntity, Serializable> {
	public List<StateEntity> findByCountryId(Integer countryId);

}
