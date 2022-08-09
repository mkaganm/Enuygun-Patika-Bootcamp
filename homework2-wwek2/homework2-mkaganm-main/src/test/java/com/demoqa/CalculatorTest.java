/*
* @author M.Kağan Meriç
* @since 06.2022
*/

package com.demoqa;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // * evaluate metodunun testi
    // * junit - quick starttan alındı
    @Test
    public void evaluateTest() {
        int result = calculator.evaluate("1+2+3");
        assertEquals(6, result);
    }

    // * sum - toplama metodu testi
    @Test
    public void sumTest(){
        double result = calculator.sum(2.899, 1.555);
        double expected = 2.899 + 1.555;
        double delta = 0.0001;
        // ? double karşılaştırmalarda hata payı için delta değeri atamak gerekir.
        assertEquals(expected,result,delta);
    }

    // * minus - çıkarma metodu testi
    @Test
    public void minusTest(){
        double result = calculator.minus(2.899, 1.555);
        double expected = 2.899 - 1.555;
        double delta = 0.0001;
        // ? double karşılaştırmalarda hata payı için delta değeri atamak gerekir.
        assertEquals(expected,result,delta);
    }

    // * divide - bölme metodu testi
    @Test
    public void divideTest(){
        double result = calculator.divide(2.899, 1.555);
        double expected = 2.899 / 1.555;
        double delta = 0.0001;
        // ? double karşılaştırmalarda hata payı için delta değeri atamak gerekir.
        assertEquals(expected,result,delta);
    }

    // * multiply - çarpma metodu testi
    @Test
    public void multiplyTest(){
        double result = calculator.multiply(2.899, 1.555);
        double expected = 2.899 * 1.555;
        double delta = 0.0001;
        // ? double karşılaştırmalarda hata payı için delta değeri atamak gerekir.
        assertEquals(expected,result,delta);
    }

}
