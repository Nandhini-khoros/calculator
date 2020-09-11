
package com.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    @Test
    public void testAddPass() {
        int res;
        res = com.Calculator.calculator.addition(4, 5);
        assertEquals(9, res);
        res = com.Calculator.calculator.addition(1, 599);
        assertEquals(600, res);

    }

    @Test
    public void testSubPass() {
        int res;
        res= com.Calculator.calculator.sub(-3, -2);
        assertEquals(-1, res);
        res= com.Calculator.calculator.sub(900000, 899999);
        assertEquals(1, res);

    }
    @Test
    public void testMulPass() {
        int res;
        res = com.Calculator.calculator.mul(4, -5);
        assertEquals(-20, res);
        res = com.Calculator.calculator.mul(52, 86);
        assertEquals(4472, res);
    }
    @Test
    public void testDivPass() {
        int res;
        res = com.Calculator.calculator.div(20, 30);
        assertEquals(0, res);
        res = com.Calculator.calculator.div(50, 10);
        assertEquals(5, res);
    }
}