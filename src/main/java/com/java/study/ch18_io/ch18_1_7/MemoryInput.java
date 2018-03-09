package com.java.study.ch18_io.ch18_1_7;//: io/MemoryInput.java
import com.java.study.ch18_io.ch18_1_7.BufferedInputFile;

import java.io.*;

public class MemoryInput {
  public static void main(String[] args)
  throws IOException {
    StringReader in = new StringReader(
      BufferedInputFile.read("MemoryInput.java"));
    int c;
    while((c = in.read()) != -1)
      System.out.print((char)c);
  }
} /* (Execute to see output) *///:~
