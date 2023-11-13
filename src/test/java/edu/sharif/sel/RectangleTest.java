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

    @Test
    public void testRectangleComputeAreaAndSetDimensions() {
        // Given
        double initialLength = 4.5;
        double initialWidth = 5.5;
        Rectangle rectangle = new Rectangle(initialLength, initialWidth);

        // When
        double initialArea = rectangle.computeArea();

        // Then
        double expectedInitialArea = initialLength * initialWidth;
        assertEquals(expectedInitialArea, initialArea, 0.0001);

        // When
        double newLength = 7.0;
        double newWidth = 4.0;
        rectangle.setLength(newLength);
        rectangle.setWidth(newWidth);

        // Then
        double updatedArea = rectangle.computeArea();
        double expectedUpdatedArea = newLength * newWidth;
        assertEquals(expectedUpdatedArea, updatedArea, 0.0001);

        // And
        // Check if length and width are correctly updated
        assertEquals(newLength, rectangle.getLength(), 0.0001);
        assertEquals(newWidth, rectangle.getWidth(), 0.0001);
    }
}
