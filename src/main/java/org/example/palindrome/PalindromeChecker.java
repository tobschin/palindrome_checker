package org.example.palindrome;

public class PalindromeChecker {

  /**
   * Checks if a inputString is a palindrome or not (No digits are allowed!)
   *
   * Palindrom (Wikipedia): sinnvolle Folge von Buchstaben, Wörtern oder Versen, die vorwärts- wie rückwärtsgelesen [den gleichen] Sinn ergeben
   * @param inputString
   * @return boolean
   * @throws RuntimeException
   */
  public static boolean isPalindrome(String inputString) {
    inputString = inputString.toLowerCase();//
    inputString = inputString.replaceAll(" ", ""); //

    int len = inputString.length();

    for (int i = 0; i < len / 2; i++) {
      var c1 = inputString.charAt(i);
      var c2 = inputString.charAt(len-i-1); //

      if(Character.isDigit(c1) || Character.isDigit(c2)) {
        throw new RuntimeException("no digis allowed");
      }

      if (inputString.charAt(i) != inputString.charAt(len - i - 1)) {
        return false;
      }
    }
    return true;
  }

}
