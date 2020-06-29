package com.nss.profix.resources;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;

import com.nss.profix.fixservice.FIXService;
import javax.servlet.ServletContext;

@Path("/order")
public class OrderResource {

	@POST
	@Path("/{sessionId}")
	public void sendOrder(@PathParam("sessionId") String sessionId, @Context ServletContext servletContext) {

		FIXService fixService = (FIXService) servletContext.getAttribute("FIX_Service");

		fixService.sendOrder(sessionId);

	}

}
