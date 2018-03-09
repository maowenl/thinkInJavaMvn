package com.java.study.ch11_holding;//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
import java.util.*;

class Snow {
  public void print(){
    System.out.println("Snow");
  }

  @Override
  public String toString() {
    return "Snow";
  }
}
class Powder extends Snow {
  @Override
  public String toString() {
    return "Powder";
  }

  public void print(){
    System.out.println("Powder");
  }
}
class Light extends Powder {
  public void print(){
    System.out.println("Light");
  }
  @Override
  public String toString() {
    return "Light+";
  }

}
class Heavy extends Powder {
  public void print(){
    System.out.println("Light");
  }

}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
            new Crusty(), new Slush(), new Powder());

    // Won't compile:
    // List<Snow> snow2 = Arrays.asList(
    //   new Light(), new Heavy());
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());

    // Give a hint using an
    // explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList(
            new Light(), new Heavy());
  }
} ///:~
