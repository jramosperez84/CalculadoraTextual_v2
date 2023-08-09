package controller;

import data.Operators;

import model.Calculator;
import view.CalculatorCLI;

import java.util.Scanner;

public class CalculatorController {
    private CalculatorController() {}

    public static CalculatorController program() {
        return new CalculatorController();
    }

    public void systemOperations() {
        Scanner input = new Scanner(System.in);
        CalculatorCLI cli = CalculatorCLI.getMenu();
        Calculator calculator = Calculator.calculator();
        int option;
        int factorial;
        float operand1;
        float operand2;
        float operand3;
        float output;
        boolean exit = false;

        do {
            cli.printMenu();
            option = input.nextInt();

            switch(option) {
                case Operators.ADDITION -> {
                    cli.showNumberMsg1();
                    operand1 = input.nextFloat();
                    cli.showNumberMsg2();
                    operand2 = input.nextFloat();
                    output = calculator.addition(operand1, operand2);
                    cli.result(output, operand1, operand2);
                }
                case Operators.SUBTRACT -> {
                    cli.showNumberMsg1();
                    operand1 = input.nextFloat();
                    cli.showNumberMsg2();
                    operand2 = input.nextFloat();
                    output = calculator.subtract(operand1, operand2);
                    cli.result(output, operand1, operand2);
                }
                case Operators.PRODUCT -> {
                    cli.showNumberMsg1();
                    operand1 = input.nextFloat();
                    cli.showNumberMsg2();
                    operand2 = input.nextFloat();
                    output = calculator.product(operand1, operand2);
                    cli.result(output, operand1, operand2);
                }
                case Operators.DIVISION -> {
                    cli.showNumberMsg1();
                    operand1 = input.nextFloat();
                    cli.showNumberMsg2();
                    operand2 = input.nextFloat();
                    if (operand2 == 0)
                        cli.indeterminate();
                    else {
                        output = calculator.division(operand1, operand2);
                        cli.result(output, operand1, operand2);
                    }
                }
                case Operators.MAX -> {
                    cli.showNumberMsg1();
                    operand1 = input.nextFloat();
                    cli.showNumberMsg2();
                    operand2 = input.nextFloat();
                    cli.showNumberMsg3();
                    operand3 = input.nextFloat();
                    output = calculator.elderlyNumber(operand1, operand2, operand3);
                    cli.elderlyNumber(output);
                }
                case Operators.FACTORIAL -> {
                    int outFactorial;
                    cli.showFactorialMsg();
                    factorial = input.nextInt();
                    outFactorial = calculator.factorial(factorial);
                    if (outFactorial == -1)
                        cli.showErrorMsgFactorial();
                    else
                        cli.showFactorialOut(factorial, outFactorial);
                }
                case Operators.EXIT -> exit = true;
                default -> cli.showErrorMsg();
            }
        } while (!exit);
    }
}