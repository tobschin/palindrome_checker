package org.example.palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckerTest {


  @ParameterizedTest
  @ValueSource(strings = {
      "lagerregal",
      "ABBA",
      "Kajak",
      "Der Freibierfred"
  })
  void test_isPalindrome_shouldBeTrue(String inputString) {
    assertTrue(PalindromeChecker.isPalindrome(inputString));
  }

  @Test
  void test_isPalindrome_shouldBeFalse() {
    assertFalse(PalindromeChecker.isPalindrome("ACDAC"));
  }

  @Test
  void test_isPalindrome_shouldThrowRuntimeException() {
    assertThrows(RuntimeException.class, () -> PalindromeChecker.isPalindrome(""));
  }


}
