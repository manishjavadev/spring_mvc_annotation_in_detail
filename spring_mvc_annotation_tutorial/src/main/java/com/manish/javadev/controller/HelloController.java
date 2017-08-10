package com.manish.javadev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manish.javadev.model.User;

@Controller
@RequestMapping("/helloController")
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}

	/**
	 * http://localhost:6060/TestAnnotation/helloController/url1/Divya
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user") User user,
			BindingResult result) {
		System.out.println("doLogin called");
		return null;
	}

	/**
	 * http://localhost:6060/TestAnnotation/helloController/url1/Divya
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/url1/{name}", method = RequestMethod.GET)
	public ModelAndView pathVariable(@PathVariable("name") String username) {
		System.out.println("pathVariable called");
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		username = username + "  you are using @PathVariable";
		model.addObject("username", username);
		return model;
	}

	/**
	 * http://localhost:6060/TestAnnotation/helloController/url2?
	 * uname=Divya&password=543432
	 * 
	 * @param salary
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/url2", method = RequestMethod.GET)
	public ModelAndView requestParamExample(
			@RequestParam(value = "salary", required = false) String salary,
			@RequestParam("uname") String username,
			@RequestParam("password") String password) {
		System.out.println("requestParamExample called");
		username = username + "  you are using @RequestParam";
		ModelAndView model = new ModelAndView();
		model.setViewName("testjsp");
		model.addObject("username", username);
		return model;
	}

	/**
	 * http://localhost:6060/TestAnnotation/helloController/url2/Divya?
	 * uname=Divya&password=543432
	 * 
	 * @param salary
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/url3/{name}", method = RequestMethod.GET)
	public ModelAndView pathVariableAndRequestParam(
			@ModelAttribute("") @PathVariable("name") String name,
			@RequestParam(value = "salary", required = false) String salary,
			@RequestParam("uname") String username,
			@RequestParam("password") String password) {
		username = name + "   " + username;
		username = username
				+ " you are using @PathVariable And @RequestParam together";
		System.out.println("requestParamExample called");
		ModelAndView model = new ModelAndView();
		model.setViewName("testjsp");
		model.addObject("username", username);
		return model;
	}
}