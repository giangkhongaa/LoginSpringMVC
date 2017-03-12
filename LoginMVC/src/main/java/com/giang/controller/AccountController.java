package com.giang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.giang.model.*;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap modelmap) {
		Account aaa=new Account("giang","123");
		modelmap.put("acc", aaa);
		return "login";
	}
	
	//get value from the login page and login check
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String abcc(@ModelAttribute(value ="acc") Account account,ModelMap modelmap) {
		AccountDAO accountDAO= new AccountDAO();
		if(accountDAO.checkAccount(account)){
			modelmap.put("message","Dang nhap thanh cong");
			return "welcome";
		} else {
			modelmap.put("message", "Dang nhap that bai");
			return "login";
		}
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "redirect:login.html";		
	}
}
