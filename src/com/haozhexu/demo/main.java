package com.haozhexu.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;

public class main {



    public static void main(String[] args) {

        UserService service = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(service);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
        System.currentTimeMillis();
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
