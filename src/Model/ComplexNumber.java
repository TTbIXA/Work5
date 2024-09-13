package Model;

public class ComplexNumber {

    private final double real;
    private final double imanginary;

    public ComplexNumber(double real, double imanginary){
        this.real = real;
        this.imanginary = imanginary;
    }

    public double getReal(){
        return real;
    }

    public double getImanginary() {
        return imanginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imanginary=" + imanginary +
                '}';
    }
}
