package com.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDto;
import com.user.service.UserService;
import com.user.utils.CommonServiceHttpMessage;
import com.user.utils.ResponseModel;
import com.user.utils.ResponseStatus;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register/user")
	public ResponseModel createNewUser(@RequestBody UserDto userDto) {

		return userService.createNewUser(userDto);

	}

	@GetMapping("/getLastUser")
	public ResponseEntity<ResponseModel> getAllBatchPaymentList() {
		ResponseModel rs = ResponseStatus.create(CommonServiceHttpMessage.USER_LISTED, userService.getLatestUser(),
				HttpStatus.OK, HttpStatus.OK.value());
		return new ResponseEntity<>(rs, HttpStatus.OK);
	}

}
