package com.psl.rest.impl;

import com.psl.model.UserDetails;
import com.psl.rest.GitRestOperations;


public class GitRestOperationsImpl implements GitRestOperations {
	
	
	
	
	public UserDetails doCommit(UserDetails userDetails) {
		
		GitRestOperationsImpl gitOperService = new GitRestOperationsImpl();
		userDetails = gitOperService.doCommit(userDetails);
		return userDetails;
	}

}
