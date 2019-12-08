package com.project.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.manage.common.Result;
import com.project.manage.service.IUserService;

@RestController
@RequestMapping(value = "/v1")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public Result findAll() {
		return userService.findAll();
	}
	
	
}
