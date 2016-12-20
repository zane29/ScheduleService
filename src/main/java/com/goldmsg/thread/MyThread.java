package com.goldmsg.thread;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/16
 * Time: 18:02
 */
class MyThread implements Runnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        for (int i = 0; i < 5; i++) {
//            MyThread myThread = new MyThread();体验下如果在这创建对象结果是怎样的
            Thread thread = new Thread(myThread);
            thread.start();
        }
    }

    public void run() {
        test1();
    }

    public void test1() {
        try {
            content();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void content() {
        System.out.println(Thread.currentThread().getName());
    }

}
