package com.nss.profix.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.nss.profix.service.OrderService;

@Path("/order")
public class OrderResource {
	
	OrderService orderService = new OrderService();
	
	@POST
	@Path("/{sessionId}")
	public void sendOrder(@PathParam("sessionId") String sessionId) {
		orderService.sendOrder(sessionId);
	}
	
}
