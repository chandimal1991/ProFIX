package com.nss.profix.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.nss.profix.fixservice.FIXService;
import com.nss.profix.service.FIXServiceImpl;

@Path("/order")
public class OrderResource {
	
	//OrderService orderService = new OrderService();
	FIXService fixServiceImpl = new FIXServiceImpl();
	
	@POST
	@Path("/{sessionId}")
	public void sendOrder(@PathParam("sessionId") String sessionId) {
		fixServiceImpl.sendOrder(sessionId);
	}
	
}
