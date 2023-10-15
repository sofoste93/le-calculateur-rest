package com.lecalculateur.resource;

import com.lecalculateur.model.OhmsLawRequest;
import com.lecalculateur.service.OhmsLawService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/physics/ohms-law")
public class OhmsLawResource {

    private final OhmsLawService service = new OhmsLawService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateOhmsLaw(OhmsLawRequest request) {
        try {
            double result = service.calculateMissingValue(request);
            return Response.ok(result).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
