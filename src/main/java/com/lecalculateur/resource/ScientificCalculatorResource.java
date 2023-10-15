package com.lecalculateur.resource;


import com.lecalculateur.model.ScientificCalculationRequest;
import com.lecalculateur.service.ScientificCalculatorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calculator/scientific")
public class ScientificCalculatorResource {

    @Inject
    ScientificCalculatorService calculatorService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculate(ScientificCalculationRequest request) {
        try {
            Double result = calculatorService.calculate(request);
            return Response.ok(result).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}
