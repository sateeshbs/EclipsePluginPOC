package com.psl.rest.impl;

import java.io.IOException;

import com.psl.model.UserDetails;
import com.psl.rest.GitRestOperations;
import com.psl.service.GitOperService;
import com.psl.service.impl.GitOperServiceImpl;
import com.utils.UserValidation;


public class GitRestOperationsImpl implements GitRestOperations {
	
	
	
	
	public UserDetails doCommit(UserDetails userDetails) {
		
		GitRestOperationsImpl gitOperService = new GitRestOperationsImpl();
		userDetails = gitOperService.doCommit(userDetails);
		return userDetails;
	}
	/*
	public UserDetails getGITHubRepositoryStructure(String userName,
			String password, String url) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public UserDetails getGITHubRepositoryStructure(UserDetails userdetail)
			throws IOException {
		UserValidation userVal = new UserValidation();
		try {
			if (userVal.authenticate(userdetail.getUserName(), userdetail.getPassword())) {
				userdetail.setAuthorised(true);
				GitOperService gitOperService = new GitOperServiceImpl();
				return gitOperService.getGITHubRepositoryStructure(userdetail);
			}
		} catch (IOException e) {
			userdetail.setAuthorised(false);
		}
		return userdetail;
	}

}
