package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/PSL")
public class TestService {
	
	  @POST
	  @Path("/abcd")
	  @Consumes("application/json")
	  @Produces("application/json")
	  public Student changeName(Student student) {
	    student.setName("HELLO " + student.getName());
	    return student;
	  }
	  
	  @GET
	  @Path("/efgh")
	  @Consumes("text/plain")
	  @Produces("application/json")
	  public Student getName() {
	    Student student = new Student();
	    student.setName("Rockey");
	    return student;
	  }

}

