package com.goldmsg.threadLock;


/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/13
 * Time: 18:01
 */
class MyThread implements Runnable {
    //两个对象锁
    private Object syncObject1 = new Object();
    private Object syncObject2 = new Object();
    private int num = 10;
/*
* 体验每个线程使用同一个对象和不同对象的区别
* 方法：
* 1、在for外创建MyThread对象
* 2、在for内创建MyThread对象
* */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        for (int i = 0; i < 3; i++) {
//            MyThread myThread = new MyThread();体验下如果在这创建对象结果是怎样的
            Thread thread = new Thread(myThread);
            thread.start();
        }
    }

    public void run() {
        test1();
        test2();
    }
    /*
    * 体验下面名的情况：
    * 0、不用锁
    * 1、两把锁都是this
    * 2、两把锁都是syncObject1
    * 3、两把锁分别是syncObject1，syncObject2
    * */
    public void test1() {
        synchronized (syncObject1) {//锁syncObject1、
            content();
        }

    }

    public void test2() {
        synchronized (syncObject2) {//锁syncObject2、
            content();
        }
    }


    public void content() {
        System.out.println(Thread.currentThread().getName() + ":\t开始" + "\t获取num:" + num);
        try {
            Thread.sleep(1000);
            num = num - 1;
            System.out.println(Thread.currentThread().getName() + "\t消费" + "\t消费num:" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "\t结束");
    }

}
