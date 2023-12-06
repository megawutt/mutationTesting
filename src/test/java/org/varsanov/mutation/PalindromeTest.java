package org.varsanov.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void whenPalindrome_thanAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
//    @Test
//    public void whenNotPalindrome_thanReject() {
//        Palindrome palindromeTester = new Palindrome();
//        assertFalse(palindromeTester.isPalindrome("neon"));
//    }
}
