package com.java.study.ch13_strings;//: strings/ArrayListDisplay.java
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListDisplay {
  public static void main(String[] args) {

    Integer i = new Integer(5);
    System.out.println(i.hashCode());
    i = 6;
    System.out.println(i.hashCode());

    AtomicInteger ai = new AtomicInteger(0);
    ai.compareAndSet(5,6);
    StringBuffer sb = new StringBuffer();
    sb.append("aaa");
//
//    try {
//      Class cls = Class.forName("com.java.study.ch07_reusing.Bath");
//      System.out.println("++++++55555++++");
//    }catch (Exception e){
//      System.out.println("++++++++++");
//    }
//    ArrayList<Coffee> coffees = new ArrayList<Coffee>();
//    for(Coffee c : new CoffeeGenerator(10))
//      coffees.add(c);
//    System.out.println(coffees);
  }
} /* Output:
[Americano 0, Latte 1, Americano 2, Mocha 3, Mocha 4, Breve 5, Americano 6, Latte 7, Cappuccino 8, Cappuccino 9]
*///:~
