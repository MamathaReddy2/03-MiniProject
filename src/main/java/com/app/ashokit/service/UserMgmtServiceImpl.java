package com.app.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ashokit.binding.User;
import com.app.ashokit.repository.CityRepo;
import com.app.ashokit.repository.CountryRepo;
import com.app.ashokit.repository.StateRepo;
import com.app.ashokit.repository.UserRepo;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CountryRepo countryRepo;
	@Autowired
	private CityRepo cityRepo;
	@Autowired
	private StateRepo stateRepo;

	@Override
	public String checkEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockAccount(UnlockAccForm accForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockAccount(UnlockAccForm accForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(LoginForm loginForm) {
		// TODO Auto-generated method stub
		return null;
	}

}
