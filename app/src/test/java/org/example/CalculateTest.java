package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSigma() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sigma(1, 10));
  }

  @Test
  public void testOddsigma() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddsigma(1, 10));
  }

  @Test
  public void testEvensigma() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evensigma(1, 10));
  }
}
