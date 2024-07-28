package org.example;

public class Calculate {

  public int sum(int x, int y) {
    return x + y;
  }

  public int sigma(int x, int y) {
    int total = 0;

    for (int i = x; i <= y; i++) {
      total += i;
    }

    return total;
  }

  public int oddsigma(int x, int y) {
    int total = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        total += i;
      }
    }

    return total;
  }

  public int evensigma(int x, int y) {
    int total = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        total += i;
      }
    }

    return total;
  }

  public static void main(String[] args) {
    Calculate c = new Calculate();

    System.out.println("Hello World!");

    int a = 2;
    int b = 3;
    System.out.println("Sum of " + a + "and " + b + " is " + c.sum(a, b) + ". Average is " + c.sum(a, b) / 2 + ".");

    a = 1;
    b = 10;
    System.out.println("Sum of " + a + "to " + b + " is " + c.sigma(a, b) + ". Average is " + c.sigma(a, b) / 10 + ".");

    System.out.println(
        "Sum of odd of " + a + "to " + b + " is " + c.oddsigma(a, b) + ". Sum of even is " + c.evensigma(a, b) + ".");
  }
}
