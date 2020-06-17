package com.nss.profix.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nss.profix.model.Session;
import com.nss.profix.service.SessionService;

@Path("/session")
public class SessionResource {
	
	SessionService sessionService = new SessionService();
	
	@GET
	@Path("/1")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Session> getSessions() {
		return sessionService.getSessions();
	}
	
	@GET
	@Path("/2")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getSession() {
		return sessionService.getSession();
	}
	
	@GET
	@Path("/fixsession")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<String> getSessionList() {
		return sessionService.getSessionList();
	}

}
