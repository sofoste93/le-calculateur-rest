package com.lecalculateur.resource;

import com.lecalculateur.model.BasicCalculationRequest;
import com.lecalculateur.service.CalculatorService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/calculator")
public class CalculatorResource {
    private final CalculatorService calculatorService = new CalculatorService();

    @POST
    @Path("/basic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public double basicCalculation(BasicCalculationRequest request) {
        return calculatorService.basicCalculation(request.getOperand1(), request.getOperand2(), request.getOperation());
    }

    @GET
    @Path("/start")
    @Produces(MediaType.TEXT_PLAIN)
    public String startHere() {
        return "Welcome to LE CALCULATEUR";
    }

    @POST
    @Path("/sin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public double calculateSin(BasicCalculationRequest request) {
        return calculatorService.calculateSin(request.getValue());
    }

    @POST
    @Path("/cos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public double calculateCos(BasicCalculationRequest request) {
        return calculatorService.calculateCos(request.getValue());
    }

    @POST
    @Path("/tan")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public double calculateTan(BasicCalculationRequest request) {
        return calculatorService.calculateTan(request.getValue());
    }

    @POST
    @Path("/log")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public double calculateLog(BasicCalculationRequest request) {
        return calculatorService.calculateLog(request.getValue());
    }
}
