package com.java.study.ch21_concurrency.Ch21_2_ThreadBase;//: concurrency/SettingDefaultHandler.java
import com.java.study.ch21_concurrency.Ch21_2_ThreadBase.ExceptionThread;
import com.java.study.ch21_concurrency.Ch21_2_ThreadBase.MyUncaughtExceptionHandler;

import java.util.concurrent.*;

public class SettingDefaultHandler {
  public static void main(String[] args) {
    Thread.setDefaultUncaughtExceptionHandler(
      new MyUncaughtExceptionHandler());
    ExecutorService exec = Executors.newCachedThreadPool();
    exec.execute(new ExceptionThread());
  }
} /* Output:
caught java.lang.RuntimeException
*///:~
