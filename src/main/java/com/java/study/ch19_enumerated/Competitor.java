//: enumerated/Competitor.java
// Switching one enum on another.
package com.java.study.ch19_enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
