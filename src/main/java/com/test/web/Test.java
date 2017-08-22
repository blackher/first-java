package com.test.web;

public class Test {
    public volatile int inc = 0;

    public void increase() {
        inc++;

    }


    public static void main(String[] args) {
        final Test test = new Test();
        for(int i=0;i<1000;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<10;j++)
                        test.increase();
                };
            }.start();

        }

        if(Thread.activeCount()>=1) { //保证前面的线程都执行完
            Thread.yield();
        }
        System.out.println(test.inc);

    }
}
