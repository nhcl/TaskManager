package com.hcl.TaskManager.Controller;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.TaskManager.Exceptions.TaskNotFoundException;
import com.hcl.TaskManager.Model.Task;
import com.hcl.TaskManager.Model.User;
import com.hcl.TaskManager.Repositories.UserRepository;
import com.hcl.TaskManager.Service.TaskService;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	public User user;

	@RequestMapping(value = { "/welcome", "/" }, method = RequestMethod.GET)
	public String welcomPage(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping(value = "ShowWelcome", method = RequestMethod.POST)
	public String ShowwelcomPage(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public String LoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPage(@RequestParam String username, @RequestParam String email,
			@RequestParam String password, ModelMap model) {
		User reg = new User();
		user = reg;
		reg.setUsername(username);
		reg.setEmail(email);
		reg.setPassword(password);

		userRepository.save(reg);

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginFromRegister(@RequestParam String username, @RequestParam String password, ModelMap model) {
		//User found = new User();
		//user = found;
		User found = userRepository.findByUsername(username);
		user = found;
		if (found != null && password.equals(found.getPassword())) {
			return "showOptions";
		} else {
			model.put("error", "Username or Password not Correct. Please Try again.");
			return null;
		}
	}
}
