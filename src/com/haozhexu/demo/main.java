package com.haozhexu.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class main {

    private static int m;

    public static void main(String[] args) {

      /*  UserService service = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
        System.currentTimeMillis();


        Date date = new Date();

        Calendar ca = Calendar.getInstance();

        ca.setTime(date);
        ca.add(Calendar.DATE, 1);
        date = ca.getTime();
        System.out.println(date);

        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime oneDayLater = ldt.plusDays(1L);
        System.out.println(oneDayLater);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(sdf.format(Calendar.getInstance().getTime()));


        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(localDateTime);


        Period period = Period.between(LocalDate.of(2020, 12, 1), LocalDate.of(2020, 12, 29));
        System.out.println(period.getYears() + " " + period.getMonths() +" " + period.getDays());*/

 /*       int h = 7;

        int length = 31;

        System.out.println(h & (length - 1));
        System.out.println(h % length);*/

        Thread[] threads = new Thread[100];


        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    m++;
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(m);


    }

    interface UserService {
        void add();
    }


    static class UserServiceImpl implements UserService {
        @Override
        public void add() {
            System.out.println("UserServiceImpl add method gets called");
        }
    }

    static class MyInvocationHandler implements InvocationHandler {

        private Object target;

        MyInvocationHandler(Object target) {
            this.target = target;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(target, args);
            return result;
        }

        public Object getProxy() {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
        }
    }

}
