package edu.wpi.teamname;

public class FizzBuzz {

  static boolean isPrime(int n) {
    // Corner case
    if (n <= 1) return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++) if (n % i == 0) return false;

    return true;
  }

  public String answer(int answer) {
    if (isPrime(answer) == true) {
      return "whiz";
    }
    if (answer % 3 == 0 && answer % 5 == 0) {
      return "fizzbuzz";
    }
    if (answer % 3 == 0) {
      return "fizz";
    }
    if (answer % 5 == 0) {
      return "buzz";
    }

    return Integer.toString(answer);
  }
}
