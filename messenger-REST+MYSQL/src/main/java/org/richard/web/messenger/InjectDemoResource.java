package org.richard.web.messenger;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inject")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	@GET
	@Path("annotations")
	public String getParamsUsingAnnotation(@MatrixParam("param") String matrixParam,
										@HeaderParam("customerID") String header,
										@CookieParam("name") String cookie){
		return "Matrix param: " + matrixParam + "customer header value: " + header;
		
	}

}
