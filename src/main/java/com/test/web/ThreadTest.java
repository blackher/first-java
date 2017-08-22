package com.test.web;

import java.lang.Runnable;
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    
    public void run() {
        System.out.println("Running " +  threadName );
        if(threadName =="thread-1"){
            System.out.println("yeild"+threadName);
            Thread.yield();
        }

        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);

                Thread.sleep(2000);

            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();

        }
    }
}
public class ThreadTest{
    public static void main(String[] args){
        RunnableDemo a = new RunnableDemo("thread-1");
        a.start();
        RunnableDemo b = new RunnableDemo("thread-2");

        b.start();

    }
}
