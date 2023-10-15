package com.lecalculateur.resource;


import com.lecalculateur.model.MolarityRequest;
import com.lecalculateur.service.MolarityService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/chemistry/molarity")
public class MolarityResource {

    private final MolarityService service = new MolarityService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateMolarity(MolarityRequest request) {
        try {
            double result = service.calculateMolarity(request);
            return Response.ok(result).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}

