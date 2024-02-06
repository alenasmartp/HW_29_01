public class ArithmeticOperation {

    public double number1;
    public double number2;

    // Конструктор
    public ArithmeticOperation(double number1, double number2) {
    this.number1 = number1;
    this.number2 = number2;
    }

    public double sum(double number1, double number2) {
        double sumResult = number1 + number2;
        return sumResult;
    }

    public boolean isEven(double number) {
        boolean isEven = (number1 + number2) % 2 == 0;
        return isEven;
    }

    public double substraction(double number1, double number2) {
        double substractionResult = number1 - number2;
        return substractionResult;
    }

    public double division(double number1, double number2) {
        double divisionResult = number1 / number2;
        return divisionResult;
    }

    public double multiplication(double number1, double number2) {
        double multiplication = number1 * number2;
        return multiplication;
    }
}
