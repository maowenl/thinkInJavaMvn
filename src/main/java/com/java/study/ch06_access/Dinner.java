package com.java.study.ch06_access;//: access/Dinner.java
// Uses the library.
import com.java.study.ch06_access.dessert.*;

public class Dinner {
  public static void main(String[] args) {
    Cookie x = new Cookie();
    //! x.bite(); // Can't access
  }
} /* Output:
Cookie constructor
*///:~
