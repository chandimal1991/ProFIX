package com.nss.profix.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nss.profix.model.Session;
import com.nss.profix.service.FIXServiceImpl;

@Path("/session")
public class SessionResource {
	
	FIXServiceImpl fixServiceImpl = new FIXServiceImpl(null);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Session> getSessions() {
		return fixServiceImpl.getSessions();
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getSessionList() {
		return fixServiceImpl.getSessionList();
	}

}
