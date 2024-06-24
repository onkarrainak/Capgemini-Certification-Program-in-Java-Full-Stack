package com.springcrudprojectst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudprojectst.entity.User;
import com.springcrudprojectst.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/findallusers")
	public List<User> findAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/add")
	public User addUser(@RequestBody @Valid User a) {
		return userService.addUser(a);
	}
	@DeleteMapping("/deleteuser/{userid}")
	public void deleteUser(@PathVariable("userid") int userid){
		this.userService.deleteUser(userid);	
	}
	
	@PutMapping("/updateuser/{userid}")
	public User updateUser(@PathVariable("userid") int userid, @RequestBody User user) {
		return userService.updateUser(userid, user);
	}
	
	@GetMapping("/findByUserName/{fullName}")
	public List<User> findUsertName(@PathVariable("fullName") String fullName){
		return userService.findByUserName(fullName);
	}
	//localhost:8085/findByUserName1?fullName=fullName -> postman
	@GetMapping("/findByUserName1")
	public List<User> findUsertName1(@RequestParam("fullName") String fullName){
		return userService.findByUserName(fullName);
	}
	
}
