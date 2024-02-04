package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TestApp {

    @ParameterizedTest
    @CsvSource({
            "0, ''",
            "1, I",
            "2, II",
            "4, IV",
            "5, V",
            "249, CCXLIX"
    })
    void shouldTransformAlgebraicToRoman(int algebraic, String expectedRoman) {
        assertThat(new App().toRoman(algebraic)).isEqualTo(expectedRoman);
    }

}