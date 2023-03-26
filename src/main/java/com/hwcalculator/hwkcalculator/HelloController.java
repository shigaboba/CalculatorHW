package com.hwcalculator.hwkcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HelloController {

    private final CalculatorOperations calculatorOperations;

    public HelloController(CalculatorOperations calculatorOperations){
        this.calculatorOperations = calculatorOperations;
    }

    public String hello(){
        return calculatorOperations.hello();
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam int num1, @RequestParam int num2){
        return calculatorOperations.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2){
        return calculatorOperations.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2){
        return calculatorOperations.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2){
        return calculatorOperations.divide(num1, num2);
    }


}
