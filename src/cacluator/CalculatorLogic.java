
package cacluator;

public class CalculatorLogic {

    public static double calculate(double i, double j, String operator) {
        switch (operator) {
            case "+":
                return i + j;
            case "-":
                return i - j;
            case "×":
                return i * j;
            case "÷":
                if (j == 0) 
                	throw new ArithmeticException("Divide by zero");
                return i / j;
            case "^":
                return Math.pow(i, j);
            case "√":
                if (j < 0) 
                	throw new ArithmeticException("Square root of negative");
                return Math.sqrt(j); 
            default:
                throw new IllegalArgumentException("Unknown operator");
        }
    }
}

