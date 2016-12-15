package com.goldmsg;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/13
 * Time: 18:01
 */
class MyThread implements Runnable {
    private Object syncObject1 = new Object();
    private Object syncObject2 = new Object();
    private int num= 10;

    public void run() {
        test1();
        test2();
    }

    public  void test1() {
        synchronized (syncObject1) {
            System.out.println(Thread.currentThread().getName()

                    +
                    ":\t1-开始.."+":\t"+num);
            try {
                Thread.sleep(1000);
                num=num-1;
                System.out.println(Thread.currentThread().getName()

                        +":\t"+num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    +
                    ":\t1-结束..");

        }

    }
    public synchronized void test2() {
        synchronized (syncObject2) {
            System.out.println(Thread.currentThread().getName()
                    +
                    ":\t2-开始.."+":\t"+num);
            try {
                Thread.sleep(1000);
                num=num-1;
                System.out.println(Thread.currentThread().getName()

                        +":\t"+num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    +
                    ":\t2-结束..");

        }

    }

}
