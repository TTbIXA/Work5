package Controller;

import Model.ComplexNumber;
import Service.CalculationService;
import Service.LoggerService;

public class CalculatorController {
    private final CalculationService calculationService;
    private final LoggerService loggerService;

    public CalculatorController(CalculationService calculationService, LoggerService loggerService){
        this.calculationService = calculationService;
        this.loggerService = loggerService;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b){
        loggerService.log("Adding " + a + "And " + b);
        return calculationService.add(a, b);
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b){
        loggerService.log("Multiplying " + a + "And " + b);
        return calculationService.multiply(a, b);
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b){
        loggerService.log("Dividing " + a + " by " + b);
        return calculationService.divide(a, b);
    }

}
