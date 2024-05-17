package com.junit.mevenjunt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeChecker {

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public String isPalindrome1(String input) {
        if (input == null) {
            return "null";
        }
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return "Not Palindrome";
            }
        }
        return "isPalindrome";
    }

//    public static class PalindromeCheckerTest {

        @Test
        public void testPalindrome() {
            PalindromeChecker checker = new PalindromeChecker();

//            assertTrue(checker.isPalindrome("mam"));
//            assertTrue(checker.isPalindrome("12321"));
//            assertTrue(checker.isPalindrome("No lemon, no melon"));
//
//            assertFalse(checker.isPalindrome("racecar"));
//            assertFalse(checker.isPalindrome("world"));
            assertEquals(true, checker.isPalindrome("dad"));
            assertSame("isPalindrome", checker.isPalindrome1("dad"));
            
            System.out.println(checker.isPalindrome1("dad"));
            
        }
    }

