//: annotations/database/Uniqueness.java
// Sample of nested annotations
package com.java.study.ch20_annotations.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
