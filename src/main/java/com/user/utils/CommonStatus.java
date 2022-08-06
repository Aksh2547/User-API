package com.user.utils;

public enum CommonStatus {
	
	OK("200"),
    CREATED("201");
   

    private String desc;

    CommonStatus(String desc) {
        this.desc = desc;
    }

	@Override
	public String toString() {
		return this.desc;
	}

}
