package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnedTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singlePairOfBracketsReturnTrue() {

        // Arrange
        String input = "[]";

        // Act
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);

        // Assertion
        assertTrue(result);

    }

    @Test
    public void bracketsReturnFalse() {

        // Arrange
        String input = "][";

        // Act
        Boolean result = BalancedBrackets.hasBalancedBrackets(input);

        // Assert
        assertFalse(result);

    }

    @Test
    public void multiplePairOfBrackets() {
        String input = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }

    @Test
    public void bracketsReturnTrue() {
        String input = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }

    @Test
    public void stringWithoutBracketTrue() {
        String input = "LauchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }

    @Test
    public void bracketsWithTextInsideReturnTrue() {
        String input = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }

    @Test
    public void bracketsWithinStringReturnTrue() {
        String input = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
        assertTrue(result);
    }
}