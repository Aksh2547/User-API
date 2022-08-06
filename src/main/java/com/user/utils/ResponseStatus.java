package com.user.utils;

import org.springframework.http.HttpStatus;

public class ResponseStatus {
	
	 public static ResponseModel create(String message, Object obj, HttpStatus httpStatus, int httpStatusCode) {
	        ResponseModel rs = new ResponseModel();
	        rs.setMessage(message);
	        rs.setResult(obj);
	        rs.setStatus(httpStatus);
	        rs.setStatusCode(httpStatusCode);
	        return rs;
	    }


}
