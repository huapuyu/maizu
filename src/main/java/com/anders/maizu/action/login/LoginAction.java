package com.anders.maizu.action.login;

import org.springframework.beans.factory.annotation.Autowired;

import com.anders.maizu.action.BaseAction;
import com.anders.maizu.api.login.LoginService;

public class LoginAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private LoginService loginService;

	public LoginAction() {
	}

	private String name;

	public String hello() {
		System.out.println("Hello " + loginService.getAllUser().size());
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
