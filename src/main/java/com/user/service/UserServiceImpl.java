package com.user.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.model.UserModel;
import com.user.repository.UserRepository;
import com.user.utils.CommonServiceHttpMessage;
import com.user.utils.ResponseModel;
import com.user.utils.ResponseStatus;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<UserModel> getLatestUser() {

		List<User> user = this.userRepository.findFirstByOrderByIdDesc();
		List<UserModel> userDto = user.stream().map((u) -> this.modelMapper.map(u, UserModel.class))
				.collect(Collectors.toList());

		return userDto;
	}

	@Override
	public ResponseModel createNewUser(UserModel userModel) {
		ResponseModel rs;
		User user = new User();

		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmailAddress(userModel.getEmailAddress());
		user.setPhoneNumber(userModel.getPhoneNumber());
		user.setDateAndTime(new Date());

		rs = ResponseStatus.create(CommonServiceHttpMessage.USER_CREATED, userRepository.save(user), HttpStatus.OK,
				HttpStatus.OK.value());

		return rs;
	}
}
