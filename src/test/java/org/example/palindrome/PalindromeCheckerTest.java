package org.example.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

  @Test
  void test_isPalindrome_true_1() {
    assertTrue(PalindromeChecker.isPalindrome("lagerregal"));
  }

  @Test
  void test_isPalindrome_true_2() {
    assertTrue(PalindromeChecker.isPalindrome("ABBA"));
  }

  @Test
  void test_isPalindrome_true_3() {
    assertTrue(PalindromeChecker.isPalindrome("Kajak"));
  }

  @Test
  void test_isPalindrome_true_4() {
    assertTrue(PalindromeChecker.isPalindrome("Der Freibierfred"));
  }

  @Test
  void test_isPalindrome_false() {
    Assertions.assertFalse(PalindromeChecker.isPalindrome("ACDAC"));
  }

  @Test //
  void test_isPalindrome_throwRuntimeException() {
    Assertions.assertThrows(RuntimeException.class, () ->PalindromeChecker.isPalindrome("1x"));
  }



}
