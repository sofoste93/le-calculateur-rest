package com.lecalculateur.resource;

import com.lecalculateur.model.ChemistryCalculationRequest;
import com.lecalculateur.service.ChemistryCalculatorService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This class represents a RESTful resource for performing chemistry calculations.
 * The resource is accessed through the "/calculator/chemistry" path.
 */
@Path("/calculator/chemistry")
public class ChemistryCalculatorResource {

    private final ChemistryCalculatorService service = new ChemistryCalculatorService();

    /**
     * Calculates the molarity based on the given ChemistryCalculationRequest.
     *
     * @param request The ChemistryCalculationRequest containing the necessary parameters for molarity calculation.
     * @return A Response object containing the molarity result.
     */
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

    /**
     * Calculates the molar mass based on the given ChemistryCalculationRequest.
     *
     * @param request The ChemistryCalculationRequest containing the necessary parameters for molar mass calculation.
     * @return A Response object containing the molar mass result.
     */
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

    /**
     * Calculates the dilution based on the given ChemistryCalculationRequest.
     *
     * @param request The ChemistryCalculationRequest containing the necessary parameters for dilution calculation.
     * @return A Response object containing the dilution result.
     */
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
