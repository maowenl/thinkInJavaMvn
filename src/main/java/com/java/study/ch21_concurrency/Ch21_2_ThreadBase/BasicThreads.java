package com.java.study.ch21_concurrency.Ch21_2_ThreadBase;//: concurrency/BasicThreads.java
// The most basic use of the Thread class.

import com.java.study.ch21_concurrency.LiftOff;

public class BasicThreads {
  public static void main(String[] args) {
    System.out.print(String.format("thread info:%s - %d \n" ,
            Thread.currentThread().getName(), Thread.currentThread().getId()));
    Thread t = new Thread(new LiftOff());
    t.start();
//    t.run();
    System.out.println("Waiting for LiftOff");
  }
} /* Output: (90% match)
Waiting for LiftOff
#0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1), #0(Liftoff!),
*///:~
