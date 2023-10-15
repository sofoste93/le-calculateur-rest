package com.lecalculateur.resource;

import com.lecalculateur.model.BaseConversionRequest;
import com.lecalculateur.service.BaseConverterService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/convert/base")
public class BaseConversionResource {

    private final BaseConverterService service;

    public BaseConversionResource() {
        this.service = new BaseConverterService();  // Ceci peut être injecté via CDI
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)  // Nous renvoyons simplement une valeur de chaîne
    public Response convertBase(BaseConversionRequest request) {
        try {
            String result = service.convertBase(request);
            return Response.ok(result).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
