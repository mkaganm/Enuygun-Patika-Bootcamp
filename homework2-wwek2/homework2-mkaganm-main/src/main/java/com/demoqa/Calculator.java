/*
 * @author M.Kağan Meriç
 * @since 06.2022
 */

package com.demoqa;

// * dört işlem yapan class
public class Calculator {

    // * junit için örnek metod
    // * junit quick starttan alındı
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.parseInt(summand);
        return sum;
    }

    // * toplama metodu
    public double sum(double a, double b){
        return a + b;
    }

    // * çıkarma metodu
    public double minus(double first, double second){
        return first - second;
    }

    // * bölme metodu
    public double divide(double first, double second){
        return first / second;
    }

    // * çarpma metodu
    public double multiply(double a, double b){
        return a * b;
    }


}
