package com.company.test;
import com.company.main.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        this.circle= new Circle(10);
    }

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = Circle.calculateArea(1d);
        double expectedArea = 3.141592653589793;
        assertEquals(expectedArea, actualArea);
    }
    @DisplayName("negatív input")
    @Test
    void givenNegativeValue_whenCalculateArea_thenReturnArea() {
        assertEquals(-1,Circle.calculateArea(-10));
    }

    @Test
    @DisplayName("twicethesize tesztje")
    void givenValue_whenTwiceTheSize_thenReturn() {
        double functionValue=Circle.twiceTheSize(1d);
        double expectedValue=2.0;
        assertEquals(functionValue,expectedValue,"valami");
    }
/*
    @Test
    void returnTrueTest() {
        circle.
        assertTrue(true);
    }
*/

    @DisplayName("Exception Testing")
    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () ->
                System.out.println(this.circle.lista[11]));

    }


}