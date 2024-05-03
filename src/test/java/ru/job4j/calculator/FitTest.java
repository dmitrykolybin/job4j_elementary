package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.calculateManWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.calculateWomanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void testWomanWeightEqual110() {
        short input = 110;
        double expected = 0;

        double output = Fit.calculateWomanWeight(input);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void testManWeightEqual100() {
        short input = 100;
        double expected = 0;

        double output = Fit.calculateManWeight(input);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman150Then46() {
        short input = 150;
        double expected = 46;

        double output = Fit.calculateWomanWeight(input);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan160Then69() {
        short input = 160;
        double expected = 69;

        double output = Fit.calculateManWeight(input);

        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}