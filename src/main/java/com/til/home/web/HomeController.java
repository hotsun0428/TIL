package com.til.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home.do")
	public String home(ModelMap model) throws Exception {
		return "/home";
	}
}
