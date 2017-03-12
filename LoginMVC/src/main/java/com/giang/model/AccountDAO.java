package com.giang.model;

public class AccountDAO {
	public boolean checkAccount(Account acc) {
		if(acc.getUser().equals("giang") && acc.getPass().equals("123")){
			return true;
		}
		return false;
	}
}
