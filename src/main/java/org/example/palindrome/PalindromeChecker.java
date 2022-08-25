package org.example.palindrome;

public class PalindromeChecker {

  /**
   * Checks if a inputString is a palindrome or not (No digits are allowed!)
   *
   * Palindrom (https://de.wikipedia.org/wiki/Palindrom):
   * Als Palindrom (altgriechisch παλίνδρομος palíndromos „rückwärts laufend“) werden in der Sprachwissenschaft Wörter, Wortreihen oder Sätze bezeichnet,
   * die rückwärts gelesen genau denselben Text oder zumindest einen Sinn ergeben.[1]
   * Groß-/Kleinschreibung, Wortgrenzen und Satzzeichen sind beim Rückwärtslesen gegebenenfalls zu ändern.
   *
   * @param inputString
   * @return boolean
   * @throws RuntimeException
   */
  public static boolean isPalindrome(String inputString) throws RuntimeException {
    if(inputString == "" || inputString == null) {
      throw new RuntimeException("inputString should not be blank!");
    }

    for (int i = 0; i < inputString.length() / 2; i++) {
      if (inputString.charAt(i) != inputString.charAt(inputString.length()-i)) {
        return false;
      }
    }
    return true;
  }

}
