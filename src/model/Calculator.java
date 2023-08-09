package model;

import java.util.Arrays;

public class Calculator {
    private Calculator() {}

    public static Calculator calculator() {
        return new Calculator();
    }

    public float addition(float number1, float number2){
        return number1 + number2;
    }

    public float subtract(float number1, float number2){
        return number1 - number2;
    }

    public float product(float number1, float number2) {
        return number1 * number2;
    }

    public float division(float number1, float number2) {
        return number1 / number2;
    }

    public int elderlyNumber(float number1, float number2, float number3) {
        int[] output = {(int) number1, (int) number2, (int) number3};
        Arrays.sort(output);
        return output [2];
    }

    public int factorial (int input) {
        int output = 1;
        int number = input;
        int error = -1;

        if (input <= 0) {
            return error;
        } else {
            while (number != 0) {
                output = output * number;
                number--;
            }
            return output;
        }
    }
}