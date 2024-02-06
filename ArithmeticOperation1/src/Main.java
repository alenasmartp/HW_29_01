import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое число для вычислений: ");
    double number1 = scanner.nextDouble();
    System.out.println("Введите второе число для вычислений: ");
    double number2 = scanner.nextDouble();
    ArithmeticOperation arithmeticOperation = new ArithmeticOperation(number1, number2);
    double resultOfSum = arithmeticOperation.sum(number1, number2);
    System.out.println("Сумма введенных чисел = " + resultOfSum);
    double number = 0;
    System.out.println("Является ли сумма четной? " + arithmeticOperation.isEven(number));
    double resultOfSubsraction = arithmeticOperation.substraction(number1, number2);
    System.out.println("Результат вычитания = " + resultOfSubsraction);
    double resultOfDivision = arithmeticOperation.division(number1, number2);
    System.out.println("Результат деления = " + resultOfDivision);
    double resultOfMultiplication = arithmeticOperation.multiplication(number1, number2);
    System.out.println("Результат умножения = " + resultOfMultiplication);



    }
}