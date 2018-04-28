package com.java.study;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 *
 */
public class App 
{

    private Lock lock=new ReentrantLock();






    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
    }
}
