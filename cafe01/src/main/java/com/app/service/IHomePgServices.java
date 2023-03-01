package com.app.service;

import com.app.dto.LoginRequestDto;
import com.app.entity.LogRegStatus;
import com.app.entity.User;

public interface IHomePgServices {

	User authenticateUser(LoginRequestDto dto);

	LogRegStatus status(User newUser);

}
