package org.example;

import java.util.List;

public class App {

    public String toRoman(int algebraic) {
        if (algebraic == 0) {
            return "";
        }
        for (AR ar : getConversionsList()) {
            if (ar.algebraic <= algebraic) {
                return ( ar.roman + toRoman(algebraic - ar.algebraic));
            }
        }
        return null;
    }

    // assignment of algebraic and roman numeral
    private record AR (int algebraic, String roman) {};

    private static List<AR> getConversionsList() {
        return List.of(
                new AR(100, "C"),
                new AR(90, "XC"),
                new AR(50, "L"),
                new AR(40, "XL"),
                new AR(10, "X"),
                new AR(9, "IX"),
                new AR(5, "V"),
                new AR(4, "IV"),
                new AR(1, "I")
        );
    }
}
