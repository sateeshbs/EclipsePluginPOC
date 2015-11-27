package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/student")
public interface ChangeStudentDetails {
	
	@POST
	  @Path("/changeName")
	  @Consumes("application/json")
	  @Produces("application/json")
	Student changeName(Student student);
	
	@GET
	  @Path("/getName")
	  @Consumes("text/plain")
	  @Produces("application/json")
	  Student getName();
	
	@POST
	  @Path("/{name}/{password}/{url}")
	  @Consumes("application/json")
	  @Produces("application/json")
	  public String test(@PathParam("name")String name,
			  @PathParam("password")String password,
			  @PathParam("url")String url) ;

}
