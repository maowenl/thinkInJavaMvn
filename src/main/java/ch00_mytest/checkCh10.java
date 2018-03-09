package ch00_mytest;

import com.java.study.ch10_innerclasses.Parcel2;

/**
 * Created by maowenl on 2017/10/31.
 */
public class checkCh10 {

    public static void main(String[] args){
        Parcel2 q = new Parcel2();
        Parcel2.Destination d = q.new Destination("maowenl");
//        System.out.println(d.readLabel());
    }
}
