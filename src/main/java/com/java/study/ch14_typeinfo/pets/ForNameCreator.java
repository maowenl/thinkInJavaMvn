//: typeinfo/pets/ForNameCreator.java
package com.java.study.ch14_typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "com.java.study.ch14_typeinfo.pets.Mutt",
    "com.java.study.ch14_typeinfo.pets.Pug",
    "com.java.study.ch14_typeinfo.pets.EgyptianMau",
    "com.java.study.ch14_typeinfo.pets.Manx",
    "com.java.study.ch14_typeinfo.pets.Cymric",
    "com.java.study.ch14_typeinfo.pets.Rat",
    "com.java.study.ch14_typeinfo.pets.Mouse",
    "com.java.study.ch14_typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
