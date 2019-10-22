package com.haozhexu.facade_pattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class FacadePatternDemo {

    public static void main(final String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();
        ObjectC objectC = new ObjectC();
        ObjectD objectD = new ObjectD();

        ObjectFacade objectFacade = new ObjectFacade(objectA, objectB, objectC, objectD);

        objectFacade.doSutff();
    }
}
