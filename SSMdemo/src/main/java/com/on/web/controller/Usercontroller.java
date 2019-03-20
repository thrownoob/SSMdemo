package com.on.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.on.web.mod.User;
import com.on.web.service.Userservice;

@Controller
@RequestMapping("/user")
public class Usercontroller {
	
	@Resource
	private Userservice userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String userId =String.valueOf(request.getParameter("id"));
		User user = this.userService.getUserforid(userId);
		model.addAttribute("user", user);
		return "showUser";

}
}
