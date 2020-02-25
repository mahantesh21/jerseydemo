package com.jersey.jerseydemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class Employee {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayGreetingJSON() {
		return null;
	}
	
	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_XML)
	public String sayGreetingXML(@PathParam("name") String name) {
		return "<hello>Hello XML "+name+"</hello>";
	}

}
