package com.hwcalculator.hwkcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Repeatable;

@Service
public class CalculatorOperations {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

    public String plus (int num1, int num2){
        if (num1 != 0 && num2 != 0) {
            int sum = num1 + num2;
            return num1 + " + " + num2 + " = " + sum;
        }
        else return "Введите оба параметра";
    }

    public String minus (int num1, int num2){
        if (num1 != 0 && num2 != 0) {
            int sub = num1 - num2;
            return num1 + " - " + num2 + " = " + sub;
        }
        else return "Введите оба параметра";
    }

    public String multiply (int num1, int num2){
        if (num1 != 0 && num2 != 0) {
            int mul = num1 * num2;
            return num1 + " * " + num2 + " = " + mul;
        }
        else return "Введите оба параметра";
    }
    public String divide (int num1, int num2){
        if (num1 != 0 && num2 != 0) {
            int div = num1 / num2;
            return num1 + " / " + num2 + " = " + div;
        }
        else if (num2 == 0){
            return "Делить на ноль нельзя";
        }
        else return "Введите оба параметра";
    }

}
