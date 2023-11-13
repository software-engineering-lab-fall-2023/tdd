package edu.sharif.sel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testSquareComputeArea() {
        // Given
        double length = 5.0;
        Square square = new Square(length);

        // When
        double area = square.computeArea();

        // Then
        double expectedArea = length * length;
        assertEquals(expectedArea, area, 0.0001); // Add a delta to handle precision issues with doubles
    }

    @Test
    public void testSquareComputeAreaAndSetDimensions() {
        // Given
        double initialLength = 4.5;
        Square square = new Square(initialLength);

        // When
        double initialArea = square.computeArea();

        // Then
        double expectedInitialArea = initialLength * initialLength;
        assertEquals(expectedInitialArea, initialArea, 0.0001);

        // When
        double newLength = 7.0;
        square.setLength(newLength);

        // Then
        double updatedArea = square.computeArea();
        double expectedUpdatedArea = newLength * newLength;
        assertEquals(expectedUpdatedArea, updatedArea, 0.0001);

        // And
        // Check if length and width are correctly updated
        assertEquals(newLength, square.getLength(), 0.0001);
    }
}
