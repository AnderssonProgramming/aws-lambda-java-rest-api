package co.edu.escuelaing.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathServicesTest {

    @Test
    void squareReturnsExpectedValueForPositiveNumber() {
        assertEquals(Integer.valueOf(25), MathServices.square(5));
    }

    @Test
    void squareReturnsExpectedValueForNegativeNumber() {
        assertEquals(Integer.valueOf(16), MathServices.square(-4));
    }

    @Test
    void squareReturnsZeroForZero() {
        assertEquals(Integer.valueOf(0), MathServices.square(0));
    }
}
