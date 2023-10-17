package com.lecalculateur.resource;

import com.lecalculateur.model.ChemistryCalculationRequest;
import com.lecalculateur.service.ChemistryCalculatorService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calculator/chemistry")
public class ChemistryCalculatorResource {

    private final ChemistryCalculatorService service = new ChemistryCalculatorService();

    @POST
    @Path("/molarity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateMolarity(ChemistryCalculationRequest request) {
        try {
            if (!request.isValidForMolarity()) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid parameters for molarity calculation").build();
            }
            double result = service.calculateMolarity(request);
            return Response.ok(result).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @POST
    @Path("/molar-mass")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateMolarMass(ChemistryCalculationRequest request) {
        try {
            if (!request.isValidForMolarMass()) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid parameters for molar mass calculation").build();
            }
            double result = service.calculateMolarMass(request);
            return Response.ok(result).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @POST
    @Path("/dilution")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateDilution(ChemistryCalculationRequest request) {
        try {
            if (!request.isValidForDilution()) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid parameters for dilution calculation").build();
            }
            double result = service.calculateDilution(request);
            return Response.ok(result).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Vous pouvez ajouter d'autres méthodes pour d'autres calculs chimiques ici.
}

