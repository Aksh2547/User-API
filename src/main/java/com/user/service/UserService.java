package com.user.service;

import java.util.List;

import com.user.dto.UserDto;
import com.user.utils.ResponseModel;

public interface UserService {
	
	//create User		
	ResponseModel createNewUser(UserDto userDto);
	
	public List<UserDto> getLatestUser();
		
	

}
