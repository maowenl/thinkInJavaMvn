//: annotations/ExtractInterface.java
// APT-based annotation processing.
package com.java.study.ch20_annotations;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
  public String value();
} ///:~
