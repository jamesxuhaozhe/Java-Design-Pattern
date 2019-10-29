package com.haozhexu.playground;

import sun.misc.Launcher;

import java.net.URL;

public class PlayGround {

    public static void main(String[] args) throws Exception {

        URL[] urls = Launcher.getBootstrapClassPath().getURLs();

        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }


        System.out.println("----------------------------");


        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类装载器:" + appClassLoader);
        ClassLoader extensionClassLoader = appClassLoader.getParent();
        System.out.println("系统类装载器的父类加载器——扩展类加载器:" + extensionClassLoader);
        ClassLoader bootstrapClassLoader = extensionClassLoader.getParent();
        System.out.println("扩展类加载器的父类加载器——引导类加载器:" + bootstrapClassLoader);


        System.out.println("------------------------------");

        //test2();


        test3();
    }


    private static void test2() throws Exception {
        MyClassLoader loader = new MyClassLoader();
        Class<?> c = loader.loadClass("com.haozhexu.playground.HighRichHandsome");
        System.out.println("Loaded by :" + c.getClassLoader());

        Person p = (Person) c.newInstance();
        p.say();

        HighRichHandsome man = (HighRichHandsome) c.newInstance();
        man.say();
    }


    private static void test3() throws Exception {
        MyClassLoader loader = new MyClassLoader();
        Class<?> c = loader.findClass("com.haozhexu.playground.HighRichHandsome");
        System.out.println("Loaded by :" + c.getClassLoader());

        System.out.println("Person is loaded by: " + Person.class.getClassLoader());

        System.out.println("HighRichHandsome is loaded by: " + HighRichHandsome.class.getClassLoader());

        Person p = (Person) c.newInstance();
        p.say();

        // the following line will cause problem, because HighRichHandsome is loaded by parent class loader AppClassLoader,
        // however c is loaded by its child MyClassLoader, class loaded in the child classloader share different namespace.
        // class loaded in parent classloader can be seen in the child class loader

        //HighRichHandsome man = (HighRichHandsome) c.newInstance();
        //man.say();
    }

}
