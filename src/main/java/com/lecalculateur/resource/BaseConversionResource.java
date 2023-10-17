package com.lecalculateur.resource;

import com.lecalculateur.model.BaseConversionRequest;
import com.lecalculateur.service.BaseConverterService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This class represents a REST resource for base conversions.
 * It provides an endpoint for converting numbers from one base to another.
 *
 * The base converter service is used to perform the conversion.
 */
@Path("/calculator/convert/base")
public class BaseConversionResource {

    private final BaseConverterService service;

    /**
     * Initializes a new instance of the BaseConversionResource class.
     *
     * Creates a new instance of the BaseConverterService and assigns it to the service property.
     * The service property can be injected using CDI.
     */
    public BaseConversionResource() {
        this.service = new BaseConverterService();  // Ceci peut être injecté via CDI
    }

    /**
     * Converts a value from one base to another.
     *
     * @param request the base conversion request object containing the value to be converted and the base values
     * @return a Response object with the converted value in plain text format
     */
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