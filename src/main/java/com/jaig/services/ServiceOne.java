package com.jaig.services;

	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import java.util.Collection;

	/**
	 * REST service to manipulate Karaf features
	 */
	@Path("/")
	public interface ServiceOne {
	    /**
	     * Returns an explicit collection of all features in XML format in response to HTTP GET requests.
	     * @return the collection of features
	     * http://localhost:8181/cxf/services/serviceone
	     */
	    @GET
		@Path("/serviceone")
	    @Produces("application/xml")
	    public String getServiceOne() throws Exception;
	}

