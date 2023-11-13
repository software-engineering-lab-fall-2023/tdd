package edu.sharif.sel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testRectangleComputeArea() {
        // Given
        double length = 5.0;
        double width = 3.0;
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double area = rectangle.computeArea();

        // Then
        double expectedArea = length * width;
        assertEquals(expectedArea, area, 0.0001); // Add a delta to handle precision issues with doubles
    }
}
