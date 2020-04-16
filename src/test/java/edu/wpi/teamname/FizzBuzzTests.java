package edu.wpi.teamname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

  @Test
  public void numAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("4", fizzBuzz.answer(4));
  }

  @Test
  public void divisByThree() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("fizz", fizzBuzz.answer(3));
  }

  @Test
  public void divisByFive() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("buzz", fizzBuzz.answer(5));
  }

  @Test
  public void divisThreeAndFive() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("fizzbuzz", fizzBuzz.answer(15));
  }

  @Test
  public void isPrimeNum() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Assertions.assertEquals("whiz", fizzBuzz.answer(13));
  }
}
