package com.java.study.ch21_concurrency.Ch21_2_ThreadBase;//: concurrency/NaiveExceptionHandling.java
// {ThrowsException}
import java.util.concurrent.*;

public class NaiveExceptionHandling {
  public static void main(String[] args) {
    int a = Integer.parseInt("0 Subscribers".split(" ")[0]);


    try {
      ExecutorService exec = Executors.newCachedThreadPool();
      exec.execute(new ExceptionThread());
    } catch(RuntimeException ue) {
      // This statement will NOT execute!
      System.out.println("Exception has been handled!");
    }
  }
} ///:~
