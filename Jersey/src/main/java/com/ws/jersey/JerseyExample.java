package com.ws.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by thiennt on 5/21/14.
 */
@Path("/jersey")
public class JerseyExample {

    @GET
    @Path("/path/{param}")
    public Response getMessage(@PathParam(value = "param") String param){
        String ouput = "Jersey say: "+param+"-by @PathParam";
        return Response.status(200).entity(ouput).build();
    }
    @GET
    @Path("/query")
    public Response getMessageByQueryParam(@QueryParam("param") String param){
        String ouput = "Jersey say: "+param+"-by @QueryParam";
        return Response.status(200).entity(ouput).build();
    }
}
