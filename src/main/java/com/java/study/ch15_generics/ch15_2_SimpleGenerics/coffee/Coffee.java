//: generics/coffee/Coffee.java
package com.java.study.ch15_generics.ch15_2_SimpleGenerics.coffee;

public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
} ///:~
