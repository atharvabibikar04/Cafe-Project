package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.LoginRequestDto;
import com.app.entity.LogRegStatus;
import com.app.entity.User;
import com.app.repository.IHomePgRepository;

@Service
@Transactional
public class HomePgServices implements IHomePgServices {

	@Autowired
	private IHomePgRepository HomePgRepo;

	@Override
	public User authenticateUser(LoginRequestDto dto) {
		return HomePgRepo.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
	}

	@Override
	public LogRegStatus status(User newUser) {
		
		List<User> users = HomePgRepo.findAll();
        System.out.println("New user: " + newUser.toString());
        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return LogRegStatus.ALREADY_EXISTS;
            }
        }
        HomePgRepo.save(newUser);
        return LogRegStatus.SUCCESS;
	}

	
}
