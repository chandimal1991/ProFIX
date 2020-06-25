package com.nss.profix.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nss.profix.fixservice.FIXService;
import com.nss.profix.service.FIXServiceImpl;

@Path("/session")
public class SessionResource {
	
	FIXService fixServiceImpl = new FIXServiceImpl();
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Session> getSessionList() {
		return sessionService.getSessionList();
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getSessionList() {
		return fixServiceImpl.getSessionList();
	}

}
