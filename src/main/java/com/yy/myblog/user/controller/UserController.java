package com.yy.myblog.user.controller;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yy.myblog.user.service.IUserService;

/**
 * @author Ivan yu
 * @since 2019-12-17
 * @version ${version}
 */
@RequestMapping("/user")
@RestController
@Validated
public class UserController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private IUserService userService;

	@RequestMapping("/login")
	public Response


}



