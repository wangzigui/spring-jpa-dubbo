package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.domain.Account;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
	@Autowired
	private AccountDao accountDao = null;  
	
	public String hello(String name) {	
		List<Account> list = accountDao.findAll();
		System.out.println("hello");
		return list.toString();
	}
}
