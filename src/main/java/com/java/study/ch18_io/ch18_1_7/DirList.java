package com.java.study.ch18_io.ch18_1_7;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {

  public static void main(String[] args) {
    File path = new File(".");
    String[] list;
    if(args.length == 1)
      list = path.list();
    else {
//      list = path.list(new DirFilter(args[0]));
      list = path.list(new DirFilter(".*\\..*"));
    }

    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
    System.out.println(list.toString());
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);
  }
  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches();
  }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
