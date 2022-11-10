package org.example;

import org.example.palindrome.PalindromeChecker;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World");
    if(args.length > 0) {
      System.out.println(args[0] + " is"  + (PalindromeChecker.isPalindrome(args[0]) ? "" : " not") + " a Palindrome: " );
    }
  }
}
