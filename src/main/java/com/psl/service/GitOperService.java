package com.psl.service;

import com.psl.model.UserDetails;

public interface GitOperService {

	UserDetails doCommit(UserDetails userDetails);
	
	UserDetails getGITHubRepositoryStructure(UserDetails userDetails);
}
