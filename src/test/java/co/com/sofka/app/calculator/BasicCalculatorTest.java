package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing resta: 1-1=0")
    void restar() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.restar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicación: 1*1=1")
    void multiplicar() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator. multiplicar(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing división: 1/1=1")
    void dividir() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.dividir(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    @DisplayName("Testing several restas")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "4,    1,   3",
            "2,    1,   1",
            "49,  2, 47",
            "10,  3, 7"
    })
    public void severalRestas(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.restar(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
    @DisplayName("Testing several multiplicaciones")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "49,  1, 49",
            "1,  100, 100"
    })
    public void severalMultiplicaciones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicar(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
    @DisplayName("Testing several divisiones")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "3,    1,   3",
            "6,    2,   3",
            "49,   0,   0",
            "1,    1,   1"
    })
    public void severalDivisiones(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.dividir(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}