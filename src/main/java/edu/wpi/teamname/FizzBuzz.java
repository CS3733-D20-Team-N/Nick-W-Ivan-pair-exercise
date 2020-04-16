package edu.wpi.teamname;

public class FizzBuzz {

  public String answer(int answer) {
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
