package generic_calc;

public class GenericCalculator<N extends Number> {
    public double add(N first , N second) {
        return first.doubleValue() + second.doubleValue();
    }

    public double subtract(N first , N second) {
        return first.doubleValue() - second.doubleValue();
    }

    public double divide(N first , N second) {
        return first.doubleValue() / second.doubleValue();
    }

    public double multiply(N first , N second) {
        return first.doubleValue() * second.doubleValue();
    }
}
