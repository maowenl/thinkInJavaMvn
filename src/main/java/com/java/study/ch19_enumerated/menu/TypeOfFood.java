//: enumerated/menu/TypeOfFood.java
package com.java.study.ch19_enumerated.menu;
import static com.java.study.ch19_enumerated.menu.Food.*;

public class TypeOfFood {
  public static void main(String[] args) {
    Food food = Appetizer.SALAD;
    food = MainCourse.LASAGNE;
    food = Dessert.GELATO;
    food = Coffee.CAPPUCCINO;
  }
} ///:~
