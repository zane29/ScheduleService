package com.goldmsg;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/13
 * Time: 17:59
 */


public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        for (int i = 0; i <3; i++) {
            Thread thread = new Thread(myThread);
            thread.start();
        }
    }

}
