package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@Autowired
	private TestRegistryService testRegistryService;
	
	@RequestMapping(value="/Hello")  
	@ResponseBody
    public String HelloWorld(){  
		String str = testRegistryService.hello("dfd");
        return str;  
    } 
}
