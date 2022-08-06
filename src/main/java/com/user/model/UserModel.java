package com.user.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	private Long id;
	
	@NotEmpty
	@Size(min=3,max=10,message="First Name should be min 3 chars and max 10 chars !!")
	@Pattern(regexp="[A-Z][a-zA-Z]*",message = "first name is wrong and must with capital at least one character")
	private String firstName;
	
	@NotEmpty
	@Size(min=3,max=10,message="Last Name should be min 3 chars and max 10 chars !!")
	@Pattern(regexp="[A-Z][a-zA-Z]*",message = "last name is wrong and must with capital at least one character")
	private String lastName;
	
	@Email(message="Email address not valid ! !")
	private String emailAddress;
	
	@NotEmpty
	@Size(max=10,message="Phone Number should be max 10 chars !!")
	@Pattern(regexp = "[0-9]+",message = "must be numbers")
	private String phoneNumber;
	
	private String dateAndTime;
	

}
