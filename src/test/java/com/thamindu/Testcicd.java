package com.thamindu;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Testcicd {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        assertEquals(calc.add(5,3),8);
    }
    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        assertEquals(calc.subtract(5,3),2);
    }
    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(3,2),6);
    }
    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        assertEquals(calc.divide(6,3),2);
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero(){
        Calculator calc = new Calculator();
        calc.divide(5,0);
    }

}
