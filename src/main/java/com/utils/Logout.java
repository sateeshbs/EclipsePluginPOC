package com.utils;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;




public class Logout {
	
	  @GET
	  @Path("/logout")
	  @Consumes("text/plain")
	  @Produces("application/json")
	  public Response logout() {
		  return Response.status(401).header("WWW-Authenticate", "Basic").build();
	  }

}
