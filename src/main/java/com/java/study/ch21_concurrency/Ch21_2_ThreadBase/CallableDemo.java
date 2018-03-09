package com.java.study.ch21_concurrency.Ch21_2_ThreadBase;//: concurrency/CallableDemo.java
import java.util.concurrent.*;
import java.util.*;

class TaskWithResult implements Callable<String> {
  private int id;
  public TaskWithResult(int id) {
    this.id = id;
  }

  public String call() {
    try {
      Thread.sleep(10*1000);
    }catch (Exception e) {}
    long c = 1;
//    while(++c != 0){}
    return "result of TaskWithResult " + id + ", thread.id = " + Thread.currentThread().getId();
  }
}

public class CallableDemo {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
//    ExecutorService exec = Executors.newFixedThreadPool(3);
    ArrayList<Future<String>> results =
      new ArrayList<Future<String>>();
    for(int i = 0; i < 10; i++)
      results.add(exec.submit(new TaskWithResult(i)));

    System.out.println("calling fs.get()");
    for(Future<String> fs : results)
      try {
        // get() blocks until completion:

        System.out.println(fs.get());
//        System.out.println("call fs.get() done");
      } catch(InterruptedException e) {
        System.out.println(e);
        return;
      } catch(ExecutionException e) {
        System.out.println(e);
      } finally {
        exec.shutdown();
      }
  }
} /* Output:
result of TaskWithResult 0
result of TaskWithResult 1
result of TaskWithResult 2
result of TaskWithResult 3
result of TaskWithResult 4
result of TaskWithResult 5
result of TaskWithResult 6
result of TaskWithResult 7
result of TaskWithResult 8
result of TaskWithResult 9
*///:~
