package com.psl.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.psl.model.UserDetails;


@Path("/operation")
public interface GitRestOperations {
	
	
	@POST
	@Path("/commit")
	@Produces("application/json")
	@Consumes("application/json")
	UserDetails doCommit(UserDetails userDetails);

}
