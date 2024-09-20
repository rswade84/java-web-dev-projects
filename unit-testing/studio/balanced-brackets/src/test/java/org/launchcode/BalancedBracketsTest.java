package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnedTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test 1

    @Test
    public void emptyStringReturnsTrue() {
        // Arrange
        String input = "";

        // Act
        boolean result = BalancedBrackets.hasBalancedBrackets(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        // Arrange
        String input = "LaunchCode";

        // Act
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void singlePairOfBracketsReturnTrue() {
        // Arrange
        String input = "[]";

        // Act
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void multiplePairOfBracketsReturnTrue() {
        String input = "[][][]";
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);

    }

    @Test
    public void bracketWithTextInsideReturnTrue() {
        String input = "[LaunchCode]";
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }
}