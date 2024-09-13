package Main;

import Controller.CalculatorController;
import Model.ComplexNumber;
import Service.CalculationService;
import Service.LoggerService;

public class Main {
    public static void main(String[] args) {
        CalculationService calculationService = new CalculationService();
        LoggerService loggerService = new LoggerService();
        CalculatorController calculatorController = new CalculatorController(calculationService, loggerService);

        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 7);

        ComplexNumber sum = calculatorController.add(num1, num2);
        ComplexNumber product = calculatorController.multiply(num1, num2);
        ComplexNumber quotient = calculatorController.divide(num1, num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}