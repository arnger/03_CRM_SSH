package com.ada.iwan.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ada.user.dto.UserDto;
import com.ada.user.rest.UserDtoApi;

@RestController
public class UserRest {

	@Autowired
	UserDtoApi api;

	@RequestMapping(value = "/findbynameandphone")
	@ResponseStatus(HttpStatus.OK)
	public UserDto findbynameandphone(String username, String phone) {
		return api.findByName(username, phone);
	}
}
