package com.nss.profix.resources;

import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.nss.profix.fixservice.FIXService;
import com.nss.profix.model.Session;

@Path("/session")
public class SessionResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Session> getSessions(@Context ServletContext servletContext) {
		
		FIXService fixService = (FIXService) servletContext.getAttribute("FIX_Service");
		
		List<Session> sessionList = fixService.getSessions();
		
		return sessionList;
	}
	
}
