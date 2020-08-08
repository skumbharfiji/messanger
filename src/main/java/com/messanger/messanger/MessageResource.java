package com.messanger.messanger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("messages")
public class MessageResource 
{
	@GET
	public Response getMessages()
	{
		return Response.status(Status.OK)
				.entity("Welcome to Message API")
				.build();
	}
	
}
