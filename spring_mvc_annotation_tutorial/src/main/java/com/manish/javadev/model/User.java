package com.manish.javadev.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class User {
	private String username;
	private String password;
	private String gender;
	private String city;
	private String aboutYou;
	private String course;
	private boolean allCourse;

	public User() {

	}

	public User(String username, String password, String gender, String city,
			String aboutYou, String course, boolean allCource) {
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.aboutYou = aboutYou;
		this.course = course;
		this.allCourse = allCource;
	}

	// Getter and Setter

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAboutYou() {
		return aboutYou;
	}

	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public boolean isAllCourse() {
		return allCourse;
	}

	public void setAllCourse(boolean allCourse) {
		this.allCourse = allCourse;
	}
}