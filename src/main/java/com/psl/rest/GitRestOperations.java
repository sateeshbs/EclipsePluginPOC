package com.psl.rest;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.psl.model.UserDetails;


@Path("/operation")
public interface GitRestOperations {
	
	
	/**
	 * @param userDetails
	 * @return
	 */
	@POST
	@Path("/commit")
	@Produces("application/json")
	@Consumes("application/json")
	UserDetails doCommit(UserDetails userDetails);
	

	/**
	 * @param userdetail
	 * @return
	 * @throws IOException
	 */
	@POST
	@Path("/repositoryStructure")
	@Consumes("application/json")
	@Produces("application/json")
	public UserDetails getGITHubRepositoryStructure(UserDetails userdetail)
			throws IOException;
	
	/**
	 * @param userName
	 * @param password
	 * @param url
	 * @return
	 
	@POST
	@Path("/repositoryStructure")
	@Produces("application/json")
	public UserDetails getGITHubRepositoryStructure(
			@FormParam("username") String userName,
			@FormParam("password") String password, @FormParam("url") String url); */

}
