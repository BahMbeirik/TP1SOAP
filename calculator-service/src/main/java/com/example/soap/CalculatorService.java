package com.example.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculatorService {

	@WebMethod
    public int addition(int a, int b) {
        return a + b;
    }

    @WebMethod
    public int subtraction(int a, int b) {
        return a - b;
    }

    @WebMethod
    public int multiplication(int a, int b) {
        return a * b;
    }

    @WebMethod
    public int division(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}



