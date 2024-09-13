package Service;

import Model.ComplexNumber;

public class CalculationService {
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImanginary() + b.getImanginary());
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getReal() * b.getReal() - a.getImanginary() * b.getImanginary(),
                a.getReal() * b.getImanginary() + a.getImanginary() * b.getReal());

    }


    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImanginary() * b.getImanginary();
        return new ComplexNumber(
                (a.getReal() * b.getReal() + a.getImanginary() * b.getImanginary()) / denominator,
                (a.getImanginary() * b.getReal() - a.getReal() * b.getImanginary()) / denominator
        );

    }
}
