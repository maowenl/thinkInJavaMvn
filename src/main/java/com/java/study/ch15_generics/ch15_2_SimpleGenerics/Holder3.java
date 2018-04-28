package com.java.study.ch15_generics.ch15_2_SimpleGenerics;//: generics/Holder3.java

public class Holder3<T> {
  private T a;
  public Holder3(T a) { this.a = a; }
  public void set(T a) { this.a = a; }
  public T get() { return a; }
  public static void main(String[] args) {
    Holder3<Automobile> h3 =
      new Holder3<Automobile>(new Automobile());

    mytest my = new mytest();
    my.setHolder(h3);

    Holder3<Automobile> h33 = my.getHolder();

    Automobile a = ((Holder3<Automobile>)my.getHolder()).get(); // No cast needed
    // h3.set("Not an Automobile"); // Error
    // h3.set(1); // Error
  }
} ///:~

class mytest{
  Holder3 mHolder;
  Holder3 getHolder(){
    return mHolder;
  }

  void setHolder(Holder3 holder){
    mHolder = holder;
  }
}