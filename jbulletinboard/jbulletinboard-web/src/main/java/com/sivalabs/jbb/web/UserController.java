package com.sivalabs.jbb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Siva
 *
 */
@Controller
public class UserController
{
	
	@RequestMapping("listUsers")
	public String listUsers()
	{
		return "show_users";
	}
	@RequestMapping("showUser")
	public String showUser()
	{
		return "user_details";
	}
}
