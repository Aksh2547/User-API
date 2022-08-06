package com.user.service;

import java.util.List;

import com.user.model.UserModel;
import com.user.utils.ResponseModel;

public interface UserService {
	
	//create User		
	ResponseModel createNewUser(UserModel userModel);
	
	public List<UserModel> getLatestUser();
		
	

}
