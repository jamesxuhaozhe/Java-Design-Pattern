package com.haozhexu.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<>();

    public static DateFormat getDateFormat() {
        DateFormat df = threadLocal.get();
        if (df == null) {
            df = new SimpleDateFormat(DATE_FORMAT);
            threadLocal.set(df);
        }
        return df;
    }

    public static void main(String[] args) {
        SimpleDateFormatDemo formatDemo = new SimpleDateFormatDemo();

        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        MyRunnable myRunnable3 = new MyRunnable();

        Thread thread1= new Thread(myRunnable1);
        Thread thread2= new Thread(myRunnable2);
        Thread thread3= new Thread(myRunnable3);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class MyRunnable implements Runnable {


        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " current time: " + SimpleDateFormatDemo.getDateFormat().format(new Date()));
        }
    }
}
