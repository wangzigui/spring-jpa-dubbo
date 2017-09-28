package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.AccountDao;
import com.domain.Account;

@Controller
public class HelloWorldController {
	
	@Autowired
	private AccountDao accountDao = null;  
	
	@RequestMapping(value="/Hello")  
	@ResponseBody
    public String HelloWorld(){  
		
		List<Account> list = accountDao.findAll();
//        model.addAttribute("message","Hello World!!!");  
        return list.toString();  
    } 
	
}
