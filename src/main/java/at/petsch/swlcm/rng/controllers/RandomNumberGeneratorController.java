package at.petsch.swlcm.rng.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/rng")
public class RandomNumberGeneratorController {
    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetRandomNumberFromSourceString(@PathParam("sourceString")String sourceString){
        return sourceString;
    }
}
